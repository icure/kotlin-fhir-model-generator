package io.icure.fhir.mapping.domain.fhir.xml

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
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

@Serializable(FloatStringKSerializer::class)
@JsonSerialize(using = FloatStringSerializer::class)
@JsonDeserialize(using = FloatStringDeserializer::class)
data class FloatString(val value: String)

class FloatStringKSerializer : KSerializer<FloatString> {
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

class FloatStringDeserializer : JsonDeserializer<FloatString?>() {
	override fun deserialize(p: JsonParser, ctxt: DeserializationContext?): FloatString  =
		if (p.isExpectedStartObjectToken) { // When decoding from XML, the value may be wrapped in an object
			val node = p.readValueAsTree<JsonNode>()
			FloatString(node["value"].toString())
		} else {
			FloatString(p.valueAsString)
		}
}

class FloatStringSerializer : JsonSerializer<FloatString>() {
	override fun serialize(
		value: FloatString,
		gen: JsonGenerator,
		serializers: SerializerProvider
	) {
		gen.writeRawValue(value.value)
	}
}