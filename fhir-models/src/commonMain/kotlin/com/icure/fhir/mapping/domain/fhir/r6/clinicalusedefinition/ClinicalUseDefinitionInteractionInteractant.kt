//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.clinicalusedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
