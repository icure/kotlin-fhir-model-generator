//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Active or inactive ingredient
 *
 * Identifies a particular constituent of interest in the product.
 *
 * @param id Unique id for inter-element referencing
 * @param itemCodeableConcept Medication(s) or substance(s) contained in the medication
 * @param itemReference Medication(s) or substance(s) contained in the medication
 * @param isActive Active ingredient indicator
 * @param strength Quantity of ingredient present
 */
@SerialName("MedicationKnowledgeIngredient")
@Serializable
public data class MedicationKnowledgeIngredient(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Medication(s) or substance(s) contained in the medication
   */
  public val itemCodeableConcept: CodeableConcept? = null,
  /**
   * Medication(s) or substance(s) contained in the medication
   */
  public val itemReference: Reference? = null,
  /**
   * Active ingredient indicator
   */
  public val isActive: Boolean? = null,
  /**
   * Quantity of ingredient present
   */
  public val strength: Ratio? = null,
) : BackboneElement
