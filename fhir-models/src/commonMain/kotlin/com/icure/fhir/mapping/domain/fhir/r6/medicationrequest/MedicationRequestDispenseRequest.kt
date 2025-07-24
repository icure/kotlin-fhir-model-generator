//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationrequest

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param dispenser Intended performer of dispense
 * @param doseAdministrationAid Type of adherence packaging to use for the dispense
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
   * Intended performer of dispense
   */
  public val dispenser: Reference? = null,
  public val dispenserInstruction: List<Annotation> = emptyList(),
  /**
   * Type of adherence packaging to use for the dispense
   */
  public val doseAdministrationAid: CodeableConcept? = null,
) : BackboneElement
