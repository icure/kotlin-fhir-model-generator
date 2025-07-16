package io.icure.fhir.mapping.domain.fhir

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.element
import kotlinx.serialization.encodeToString
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonEncoder
import kotlinx.serialization.json.JsonUnquotedLiteral
import kotlinx.serialization.json.jsonPrimitive

@Serializable(ExactMeasureSerializer::class)
data class ExactMeasure(
	val value: Int,
	val scale: Int
)

class ExactMeasureSerializer : KSerializer<ExactMeasure> {
	override val descriptor: SerialDescriptor = buildClassSerialDescriptor("ExactMeasure") {
		element<Int>("value")
		element<Int>("scale")
	}

	@OptIn(ExperimentalSerializationApi::class)
	override fun serialize(
		encoder: Encoder,
		value: ExactMeasure
	) {
		encoder as JsonEncoder
		val valueToEncode = if (value.scale > 0) {
			value.value.toString().let {
				val intPart = it.substring(0, it.length - value.scale)
				val decimalPart = it.substring(it.length - value.scale)
				"$intPart.$decimalPart"
			}
		} else {
			value.value.toString().padEnd(value.value.toString().length + value.scale, '0')
		}
		encoder.encodeJsonElement(JsonUnquotedLiteral(valueToEncode))
	}

	override fun deserialize(decoder: Decoder): ExactMeasure {
		decoder as JsonDecoder
		val content = decoder.decodeJsonElement().jsonPrimitive.content
		val splitContent = content.split(".")
		return when (splitContent.size) {
			1 -> ExactMeasure(value = splitContent.first().toInt(), scale = 0)
			2 -> ExactMeasure(
				value = "${splitContent.first()}${splitContent.last()}".toInt(),
				scale = splitContent.last().length
			)
			else -> throw IllegalStateException("Invalid float: $content")
		}
	}
}