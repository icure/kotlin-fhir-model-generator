//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Setting or value of environment for adequate storage
 *
 * Describes a setting/value on the environment for the adequate storage of the medication and other
 * substances.  Environment settings may involve temperature, humidity, or exposure to light.
 *
 * @param id Unique id for inter-element referencing
 * @param type Categorization of the setting
 * @param valueQuantity Value of the setting
 * @param valueRange Value of the setting
 * @param valueCodeableConcept Value of the setting
 */
@SerialName("MedicationKnowledgeStorageGuidelineEnvironmentalSetting")
@Serializable
public data class MedicationKnowledgeStorageGuidelineEnvironmentalSetting(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Categorization of the setting
   */
  public val type: CodeableConcept,
  /**
   * Value of the setting
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Value of the setting
   */
  public val valueRange: Range? = null,
  /**
   * Value of the setting
   */
  public val valueCodeableConcept: CodeableConcept? = null,
) : BackboneElement
