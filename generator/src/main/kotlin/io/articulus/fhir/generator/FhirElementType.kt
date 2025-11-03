package io.articulus.fhir.generator

import com.google.gson.JsonElement
import com.google.gson.JsonObject
import java.util.Locale
import java.util.Locale.getDefault

class FhirElementType(dict: JsonObject? = null) {

    val code: String? = if (dict != null && dict.has("code")) {
        dict["code"].asString.replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(getDefault()) else it.toString()
        }
    } else null
    val profile: JsonElement?

    init {
        if (dict != null && dict.has("targetProfile")) {
            profile = dict["targetProfile"]
        } else {
            profile = null
        }
    }
}