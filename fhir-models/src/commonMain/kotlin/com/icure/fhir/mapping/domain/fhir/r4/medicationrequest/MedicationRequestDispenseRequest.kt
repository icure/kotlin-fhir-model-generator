//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicationrequest

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Medication supply authorization
 *
 * Indicates the specific details for the dispense or medication supply part of a medication request
 * (also known as a Medication Prescription or Medication Order).  Note that this information is not
 * always sent with the order.  There may be in some settings (e.g. hospitals) institutional or system
 * support for completing the dispense details in the pharmacy department.
 *
 * @param id Unique id for inter-element referencing
 * @param initialFill First fill details
 * @param dispenseInterval Minimum period of time between dispenses
 * @param validityPeriod Time period supply is authorized for
 * @param numberOfRepeatsAllowed Number of refills authorized
 * @param quantity Amount of medication to supply per dispense
 * @param expectedSupplyDuration Number of days supply per dispense
 * @param performer Intended dispenser
 */
@SerialName("MedicationRequestDispenseRequest")
@Serializable
public data class MedicationRequestDispenseRequest(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * First fill details
   */
  public val initialFill: MedicationRequestDispenseRequestInitialFill? = null,
  /**
   * Minimum period of time between dispenses
   */
  public val dispenseInterval: Duration? = null,
  /**
   * Time period supply is authorized for
   */
  public val validityPeriod: Period? = null,
  /**
   * Number of refills authorized
   */
  public val numberOfRepeatsAllowed: Int? = null,
  /**
   * Amount of medication to supply per dispense
   */
  public val quantity: Quantity? = null,
  /**
   * Number of days supply per dispense
   */
  public val expectedSupplyDuration: Duration? = null,
  /**
   * Intended dispenser
   */
  public val performer: Reference? = null,
) : BackboneElement
