package io.icure.fhir.mapping.domain.fhir

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonUnquotedLiteral
import kotlinx.serialization.json.jsonPrimitive
import kotlin.math.pow

@Serializable(ExactMeasureSerializer::class)
data class ExactMeasure(
	val value: Int,
	val scale: Int
)

class ExactMeasureSerializer : KSerializer<ExactMeasure> {
	override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("ExactMeasure", PrimitiveKind.STRING)

	@OptIn(ExperimentalSerializationApi::class)
	override fun serialize(
		encoder: Encoder,
		value: ExactMeasure
	) {
		encoder as JsonEncoder
		val valueWithPrecision = "${value.value / 10.0.pow(value.scale)}".let {
			val decimalPart = it.split(".").last()
			if (value.scale > 0 && decimalPart.length != value.scale) {
				it.padEnd(it.length + (value.scale - decimalPart.length), '0')
			} else it
		}
		encoder.encodeJsonElement(JsonUnquotedLiteral(valueWithPrecision))
	}

	override fun deserialize(decoder: Decoder): ExactMeasure {
		decoder as JsonDecoder
		val content = decoder.decodeJsonElement().jsonPrimitive.content
		val splitContent = content.split(".")
		return if (splitContent.size == 1) {
			ExactMeasure(value = splitContent.first().toInt(), scale = 0)
		} else {
			val scale = splitContent.last().length
			ExactMeasure(
				value = (content.toDouble() * 10.0.pow(scale)).toInt(),
				scale = scale
			)
		}
	}
}

