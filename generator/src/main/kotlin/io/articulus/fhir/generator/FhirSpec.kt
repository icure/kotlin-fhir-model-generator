package io.articulus.fhir.generator

import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import java.io.File
import java.util.*
import java.util.Locale
import java.util.Locale.getDefault


class FhirSpec(directory: String, val packageName: String, val topLevelClasses: List<String> = listOf(), val makeReadonlyProperties: Boolean = true) {
    val log by logger()

    val gson = Gson()

    private val profiles: MutableMap<String, FhirStructureDefinition> = HashMap()
    val info: FhirVersionInfo = FhirVersionInfo(this, directory)

    fun prepare() {
        handleManualProfiles()
        readProfiles()
        wrapUp()
        println("done")
    }


    private fun readBundleResources(f: File): List<JsonElement> {
        val parser = JsonParser()
        val resources: MutableList<JsonElement> = mutableListOf()

        val json = parser.parse(f.readTextAndClose()).asJsonObject

        if (!json.has("resourceType")) {
            InvalidPropertiesFormatException("No resourceType in $f")
        }

        if (json.get("resourceType").asString != "Bundle") {
            InvalidPropertiesFormatException("Resource type is not Bundle")
        }

        if (!json.has("entry")) {
            throw InvalidPropertiesFormatException("No entries in Bundle")
        }

        json.get("entry").asJsonArray.forEach { elem ->
            val resource = (elem as JsonObject).get("resource") as JsonObject
            resources.add(resource)
        }

        return resources
    }

    private fun readProfiles() {
        val resources: MutableList<JsonElement> = mutableListOf()

        arrayOf("profiles-types.json", "profiles-resources.json").forEach { f ->
            val file = File("${Settings.downloadDir}/$f")
            if (file.exists()) readBundleResources(file).forEach { res ->
                if (res.asJsonObject.get("resourceType").asString == "StructureDefinition") {
                    resources.add(res)
                }
            }
        }
        File(Settings.downloadDir).listFiles()?.forEach {
            if(it.name.contains("StructureDefinition")) {
                val parser = JsonParser()
                val json = parser.parse(it.readTextAndClose()).asJsonObject
                if (json.get("resourceType").asString == "StructureDefinition") {
                    resources.add(json)
                }
            }
        }

        // create profile instances
        resources.forEach { res ->
            val profile = FhirStructureDefinition(this, res as JsonObject)

            if (foundProfile(profile)) {
                profile.processProfile()
            }
        }
    }


    private fun foundProfile(profile: FhirStructureDefinition): Boolean {
        if (profile.name() == null) {
            print("TODO ERROR HERE")
            return false
        }
        if (profiles.containsKey(profile.name()!!.lowercase(getDefault()))) {
            print("log key already found")
            return false
        }

        profiles[profile.name()!!.lowercase(getDefault())] = profile
        return true
    }


    /**
     * Creates in-memory representations for all our manually defined
     * profiles.
     */
    private fun handleManualProfiles() {
        // todo
    }


    /**
     * Should be called after all profiles have been parsed and allows
     * to perform additional actions, like looking up class implementations
     * from different profiles.
     */
    private fun wrapUp() {
        profiles.forEach { _, profile ->
            profile.wrapUp()
        }
    }


    fun asModuleName(name: String): String? {
        return name.lowercase(getDefault())
    }


    private fun asClassName(className: String, parentName: String?): String? {
        if (className.isEmpty()) {
            return null
        }
        val pathName = if (parentName != null) "$parentName.$className" else null

        if (pathName != null && Settings.classMap.containsKey(pathName.lowercase(getDefault()))) {
            return Settings.classMap[pathName.lowercase(getDefault())]
        }

        // is our plain class mapped?
        if (Settings.classMap.containsKey(className.lowercase(getDefault()))) {
            return Settings.classMap[className.lowercase(getDefault())]
        }

        // CamelCase
        return className.capitalize()
    }


    fun classNameForType(typeName: String, parentName: String? = null): String? {
        return asClassName(typeName, parentName)
    }


    fun classNameForTypeIfProperty(typeName: String): String? {
        val className = classNameForType(typeName)
        return if (className != null) Settings.reservedMap.getOrDefault(className, className) else null
    }


    fun classNameForProfile(profileName: String): String {
        // todo check impl for edge case
        return profileName.split("/").last()
    }


    fun classNameIsNative(className: String): Boolean {
        return Settings.natives.contains(className)
    }


    fun safePropertyName(propName: String): String {
        return Settings.reservedMap.getOrDefault(propName, propName)
    }


    fun jsonClassForClassName(className: String): String {
        return Settings.jsonmap.getOrDefault(className, Settings.jsonMapDefault)
    }


    fun writeableProfile(): List<FhirStructureDefinition> {
        val p = mutableListOf<FhirStructureDefinition>()
        profiles.forEach { _, profile ->
            if (!profile.isManual) {
                p.add(profile)
            }
        }
        return p
    }

}
