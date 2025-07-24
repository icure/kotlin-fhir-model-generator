//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.careplan

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * In-line definition of activity
 *
 * A simple summary of a planned activity suitable for a general care plan system (e.g. form driven)
 * that doesn't know about specific resources such as procedure etc.
 *
 * @param id Unique id for inter-element referencing
 * @param kind Appointment | CommunicationRequest | DeviceRequest | MedicationRequest |
 * NutritionOrder | Task | ServiceRequest | VisionPrescription
 * @param code Detail type of activity
 * @param status not-started | scheduled | in-progress | on-hold | completed | cancelled | stopped |
 * unknown | entered-in-error
 * @param statusReason Reason for current status
 * @param doNotPerform If true, activity is prohibiting action
 * @param scheduledTiming When activity is to occur
 * @param scheduledPeriod When activity is to occur
 * @param scheduledString When activity is to occur
 * @param location Where it should happen
 * @param productCodeableConcept What is to be administered/supplied
 * @param productReference What is to be administered/supplied
 * @param dailyAmount How to consume/day?
 * @param quantity How much to administer/supply/consume
 * @param description Extra info describing activity to perform
 */
@SerialName("CarePlanActivityDetail")
@Serializable
public data class CarePlanActivityDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Appointment | CommunicationRequest | DeviceRequest | MedicationRequest | NutritionOrder | Task
   * | ServiceRequest | VisionPrescription
   */
  public val kind: String? = null,
  public val instantiatesCanonical: List<String> = emptyList(),
  public val instantiatesUri: List<String> = emptyList(),
  /**
   * Detail type of activity
   */
  public val code: CodeableConcept? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val goal: List<Reference> = emptyList(),
  /**
   * not-started | scheduled | in-progress | on-hold | completed | cancelled | stopped | unknown |
   * entered-in-error
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  /**
   * If true, activity is prohibiting action
   */
  public val doNotPerform: Boolean? = null,
  /**
   * When activity is to occur
   */
  public val scheduledTiming: Timing? = null,
  /**
   * When activity is to occur
   */
  public val scheduledPeriod: Period? = null,
  /**
   * When activity is to occur
   */
  public val scheduledString: String? = null,
  /**
   * Where it should happen
   */
  public val location: Reference? = null,
  public val performer: List<Reference> = emptyList(),
  /**
   * What is to be administered/supplied
   */
  public val productCodeableConcept: CodeableConcept? = null,
  /**
   * What is to be administered/supplied
   */
  public val productReference: Reference? = null,
  /**
   * How to consume/day?
   */
  public val dailyAmount: Quantity? = null,
  /**
   * How much to administer/supply/consume
   */
  public val quantity: Quantity? = null,
  /**
   * Extra info describing activity to perform
   */
  public val description: String? = null,
) : BackboneElement
