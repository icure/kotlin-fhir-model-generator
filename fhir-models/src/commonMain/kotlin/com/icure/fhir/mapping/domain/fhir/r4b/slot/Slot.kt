//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.slot

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A slot of time on a schedule that may be available for booking appointments
 *
 * A slot of time on a schedule that may be available for booking appointments.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param appointmentType The style of appointment or patient that may be booked in the slot (not
 * service type)
 * @param schedule The schedule resource that this slot defines an interval of status information
 * @param status busy | free | busy-unavailable | busy-tentative | entered-in-error
 * @param start Date/Time that the slot is to begin
 * @param end Date/Time that the slot is to conclude
 * @param overbooked This slot has already been overbooked, appointments are unlikely to be accepted
 * for this time
 * @param comment Comments on the slot to describe any extended information. Such as custom
 * constraints on the slot
 */
@SerialName("Slot")
@Serializable
public data class Slot(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  public val serviceCategory: List<CodeableConcept> = emptyList(),
  public val serviceType: List<CodeableConcept> = emptyList(),
  public val specialty: List<CodeableConcept> = emptyList(),
  /**
   * The style of appointment or patient that may be booked in the slot (not service type)
   */
  public val appointmentType: CodeableConcept? = null,
  /**
   * The schedule resource that this slot defines an interval of status information
   */
  public val schedule: Reference,
  /**
   * busy | free | busy-unavailable | busy-tentative | entered-in-error
   */
  public val status: String? = null,
  /**
   * Date/Time that the slot is to begin
   */
  public val start: String? = null,
  /**
   * Date/Time that the slot is to conclude
   */
  public val end: String? = null,
  /**
   * This slot has already been overbooked, appointments are unlikely to be accepted for this time
   */
  public val overbooked: Boolean? = null,
  /**
   * Comments on the slot to describe any extended information. Such as custom constraints on the
   * slot
   */
  public val comment: String? = null,
) : DomainResource
