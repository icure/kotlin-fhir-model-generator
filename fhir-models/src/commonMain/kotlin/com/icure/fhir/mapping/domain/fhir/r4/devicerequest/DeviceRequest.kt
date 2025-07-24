//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.devicerequest

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Medical device request
 *
 * Represents a request for a patient to employ a medical device. The device may be an implantable
 * device, or an external assistive device, such as a walker.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param groupIdentifier Identifier of composite request
 * @param status draft | active | on-hold | revoked | completed | entered-in-error | unknown
 * @param intent proposal | plan | directive | order | original-order | reflex-order | filler-order
 * | instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param codeReference Device requested
 * @param codeCodeableConcept Device requested
 * @param subject Focus of request
 * @param encounter Encounter motivating request
 * @param occurrenceDateTime Desired time or schedule for use
 * @param occurrencePeriod Desired time or schedule for use
 * @param occurrenceTiming Desired time or schedule for use
 * @param authoredOn When recorded
 * @param requester Who/what is requesting diagnostics
 * @param performerType Filler role
 * @param performer Requested Filler
 */
@SerialName("DeviceRequest")
@Serializable
public data class DeviceRequest(
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
  public val instantiatesCanonical: List<String> = emptyList(),
  public val instantiatesUri: List<String> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  public val priorRequest: List<Reference> = emptyList(),
  /**
   * Identifier of composite request
   */
  public val groupIdentifier: Identifier? = null,
  /**
   * draft | active | on-hold | revoked | completed | entered-in-error | unknown
   */
  public val status: String? = null,
  /**
   * proposal | plan | directive | order | original-order | reflex-order | filler-order |
   * instance-order | option
   */
  public val intent: String? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * Device requested
   */
  public val codeReference: Reference? = null,
  /**
   * Device requested
   */
  public val codeCodeableConcept: CodeableConcept? = null,
  public val parameter: List<DeviceRequestParameter> = emptyList(),
  /**
   * Focus of request
   */
  public val subject: Reference,
  /**
   * Encounter motivating request
   */
  public val encounter: Reference? = null,
  /**
   * Desired time or schedule for use
   */
  public val occurrenceDateTime: String? = null,
  /**
   * Desired time or schedule for use
   */
  public val occurrencePeriod: Period? = null,
  /**
   * Desired time or schedule for use
   */
  public val occurrenceTiming: Timing? = null,
  /**
   * When recorded
   */
  public val authoredOn: String? = null,
  /**
   * Who/what is requesting diagnostics
   */
  public val requester: Reference? = null,
  /**
   * Filler role
   */
  public val performerType: CodeableConcept? = null,
  /**
   * Requested Filler
   */
  public val performer: Reference? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val insurance: List<Reference> = emptyList(),
  public val supportingInfo: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val relevantHistory: List<Reference> = emptyList(),
) : DomainResource
