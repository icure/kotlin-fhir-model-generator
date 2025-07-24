//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.money.Money
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
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
