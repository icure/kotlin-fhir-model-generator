//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.clinicalusedefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The specific medication, product, food etc. or laboratory test that interacts
 *
 * The specific medication, product, food, substance etc. or laboratory test that interacts.
 *
 * @param id Unique id for inter-element referencing
 * @param itemReference The specific medication, product, food etc. or laboratory test that
 * interacts
 * @param itemCodeableConcept The specific medication, product, food etc. or laboratory test that
 * interacts
 */
@SerialName("ClinicalUseDefinitionInteractionInteractant")
@Serializable
public data class ClinicalUseDefinitionInteractionInteractant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The specific medication, product, food etc. or laboratory test that interacts
   */
  public val itemReference: Reference? = null,
  /**
   * The specific medication, product, food etc. or laboratory test that interacts
   */
  public val itemCodeableConcept: CodeableConcept? = null,
) : BackboneElement
