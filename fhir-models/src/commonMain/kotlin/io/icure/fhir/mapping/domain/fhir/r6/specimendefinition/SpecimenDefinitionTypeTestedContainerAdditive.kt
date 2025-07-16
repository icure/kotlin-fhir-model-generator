//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.specimendefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additive associated with container
 *
 * Substance introduced in the kind of container to preserve, maintain or enhance the specimen.
 * Examples: Formalin, Citrate, EDTA.
 *
 * @param id Unique id for inter-element referencing
 * @param additiveCodeableConcept Additive associated with container
 * @param additiveReference Additive associated with container
 */
@SerialName("SpecimenDefinitionTypeTestedContainerAdditive")
@Serializable
public data class SpecimenDefinitionTypeTestedContainerAdditive(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Additive associated with container
   */
  public val additiveCodeableConcept: CodeableConcept? = null,
  /**
   * Additive associated with container
   */
  public val additiveReference: Reference? = null,
) : BackboneElement
