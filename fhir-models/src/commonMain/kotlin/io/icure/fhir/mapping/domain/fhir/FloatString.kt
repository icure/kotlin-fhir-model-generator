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

@Serializable(FloatStringSerializer::class)
data class FloatString(val value: String)

class FloatStringSerializer : KSerializer<FloatString> {
	override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor("FloatString", PrimitiveKind.STRING)

	@OptIn(ExperimentalSerializationApi::class)
	override fun serialize(
		encoder: Encoder,
		value: FloatString
	) {
		encoder as JsonEncoder
		encoder.encodeJsonElement(JsonUnquotedLiteral(value.value))
	}

	override fun deserialize(decoder: Decoder): FloatString {
		decoder as JsonDecoder
		return FloatString(decoder.decodeJsonElement().jsonPrimitive.content)
	}
}