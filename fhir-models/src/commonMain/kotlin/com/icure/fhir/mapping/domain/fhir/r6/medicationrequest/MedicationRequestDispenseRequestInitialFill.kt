//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationrequest

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * First fill details
 *
 * Indicates the quantity or duration for the first dispense of the medication.
 *
 * @param id Unique id for inter-element referencing
 * @param quantity First fill quantity
 * @param duration First fill duration
 */
@SerialName("MedicationRequestDispenseRequestInitialFill")
@Serializable
public data class MedicationRequestDispenseRequestInitialFill(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * First fill quantity
   */
  public val quantity: Quantity? = null,
  /**
   * First fill duration
   */
  public val duration: Duration? = null,
) : BackboneElement
