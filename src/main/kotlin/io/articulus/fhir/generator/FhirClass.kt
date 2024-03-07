package io.articulus.fhir.generator

/**
 * An element/resource that should become its own class.
 */
class FhirClass(val path: String, val name: String, var module: String?, val resourceType: String?, val superclassName: String?, var superClass: FhirClass?, val short: String, val formal: String, val properties: MutableMap<String, FhirClassProperty>) {

    constructor(element: FhirStructureDefinitionElement) : this(
        element.path,
        element.nameIfClass(),
        null,
        element.nameOfResource(),
        if (element.nameIfClass() == "Resource") "FhirAbstractResource" else element.getSuperclassName(),
        null,
        element.definition.short,
        element.definition.formal,
        mutableMapOf()
    )

    val log by logger()

    companion object {
        val known = mutableMapOf<String, FhirClass>()

        fun forElement(element: FhirStructureDefinitionElement): Pair<FhirClass, Boolean> {
            val className = element.nameIfClass()
            if (known.containsKey(className)) {
                return Pair(known[className]!!, false)
            }
            val klass = FhirClass(element)
            known[className] = klass
            return Pair(klass, true)
        }

        fun withName(className: String?): FhirClass? {
            return known[className]
        }


        fun findProperty(parent: FhirClass, paths: List<String>, key: String): FhirClassProperty? {
            var cls: FhirClass? = parent
            for (path in paths) {
                if (path.isBlank()) {
                    break
                }

                if (cls!!.properties.containsKey(path)) {
                    cls = withName(cls.properties[path]!!.typeName)
                    if (cls == null) {
                        return null
                    }
                    break
                }
            }

            return cls!!.properties[key]
        }
    }

    fun copy(
        path: String = this.path,
        name: String = this.name,
        module: String? = this.module,
        resourceType: String? = this.resourceType,
        superclassName: String? = this.superclassName,
        superClass: FhirClass? = this.superClass,
        short: String = this.short,
        formal: String = this.formal,
        properties: MutableMap<String, FhirClassProperty> = this.properties
    ): FhirClass {
        return FhirClass(path, name, module, resourceType, superclassName, superClass, short, formal, properties)
    }

    fun addProperty(prop: FhirClassProperty) {

        // do we already have a property with this name?
        // if we do and it's a specific reference, make it a reference to a generic resource
        if (properties.containsKey(prop.name)) {
            if (properties[prop.name]!!.referenceToNames.isEmpty()) {
                log.warn("Already have property ${prop.name} on $name, which is only allowed for references")
            } else {
                properties[prop.name]!!.referenceToNames.addAll(prop.referenceToNames)
            }
        }

        if (properties.contains(prop.name)) {
            return
        }

        properties[prop.name] = prop
    }


    fun shouldWrite(): Boolean {
        return if (superClass != null) true else properties.isNotEmpty()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FhirClass

        if (path != other.path) return false
        if (name != other.name) return false
        if (module != other.module) return false
        if (resourceType != other.resourceType) return false
        if (superclassName != other.superclassName) return false
        if (superClass != other.superClass) return false
        if (short != other.short) return false
        if (formal != other.formal) return false
        if (properties != other.properties) return false

        return true
    }

    override fun hashCode(): Int {
        var result = path.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + (module?.hashCode() ?: 0)
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (superclassName?.hashCode() ?: 0)
        result = 31 * result + (superClass?.hashCode() ?: 0)
        result = 31 * result + (short.hashCode())
        result = 31 * result + (formal.hashCode())
        result = 31 * result + properties.hashCode()
        return result
    }


}
