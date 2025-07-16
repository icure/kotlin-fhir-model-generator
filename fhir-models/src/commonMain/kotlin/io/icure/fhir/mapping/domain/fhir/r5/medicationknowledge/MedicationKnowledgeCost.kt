//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.money.Money
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The pricing of the medication
 *
 * The price of the medication.
 *
 * @param id Unique id for inter-element referencing
 * @param type The category of the cost information
 * @param source The source or owner for the price information
 * @param costMoney The price or category of the cost of the medication
 * @param costCodeableConcept The price or category of the cost of the medication
 */
@SerialName("MedicationKnowledgeCost")
@Serializable
public data class MedicationKnowledgeCost(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val effectiveDate: List<Period> = emptyList(),
  /**
   * The category of the cost information
   */
  public val type: CodeableConcept,
  /**
   * The source or owner for the price information
   */
  public val source: String? = null,
  /**
   * The price or category of the cost of the medication
   */
  public val costMoney: Money? = null,
  /**
   * The price or category of the cost of the medication
   */
  public val costCodeableConcept: CodeableConcept? = null,
) : BackboneElement
