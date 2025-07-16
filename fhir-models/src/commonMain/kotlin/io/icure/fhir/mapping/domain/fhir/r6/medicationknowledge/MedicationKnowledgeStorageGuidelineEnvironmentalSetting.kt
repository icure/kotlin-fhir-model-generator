//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
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
