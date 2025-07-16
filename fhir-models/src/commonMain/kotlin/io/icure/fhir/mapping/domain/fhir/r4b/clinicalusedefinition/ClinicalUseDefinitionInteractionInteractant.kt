//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.clinicalusedefinition

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The specific medication, food, substance or laboratory test that interacts
 *
 * The specific medication, food, substance or laboratory test that interacts.
 *
 * @param id Unique id for inter-element referencing
 * @param itemReference The specific medication, food or laboratory test that interacts
 * @param itemCodeableConcept The specific medication, food or laboratory test that interacts
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
   * The specific medication, food or laboratory test that interacts
   */
  public val itemReference: Reference? = null,
  /**
   * The specific medication, food or laboratory test that interacts
   */
  public val itemCodeableConcept: CodeableConcept? = null,
) : BackboneElement
