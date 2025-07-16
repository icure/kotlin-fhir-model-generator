//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationrequest

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
