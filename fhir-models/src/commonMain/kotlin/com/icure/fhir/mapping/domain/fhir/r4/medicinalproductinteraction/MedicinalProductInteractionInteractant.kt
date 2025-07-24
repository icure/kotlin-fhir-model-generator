//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductinteraction

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The specific medication, food or laboratory test that interacts
 *
 * The specific medication, food or laboratory test that interacts.
 *
 * @param id Unique id for inter-element referencing
 * @param itemReference The specific medication, food or laboratory test that interacts
 * @param itemCodeableConcept The specific medication, food or laboratory test that interacts
 */
@SerialName("MedicinalProductInteractionInteractant")
@Serializable
public data class MedicinalProductInteractionInteractant(
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
