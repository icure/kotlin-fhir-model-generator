//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.communicationrequest

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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A request for information to be sent to a receiver
 *
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a
 * responsible provider, the CDS system proposes that the public health agency be notified about a
 * reportable condition.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param groupIdentifier Composite request this is part of
 * @param status draft | active | on-hold | revoked | completed | entered-in-error | unknown
 * @param statusReason Reason for current status
 * @param priority routine | urgent | asap | stat
 * @param doNotPerform True if request is prohibiting action
 * @param subject Focus of message
 * @param encounter Encounter created as part of
 * @param occurrenceDateTime When scheduled
 * @param occurrencePeriod When scheduled
 * @param authoredOn When request transitioned to being actionable
 * @param requester Who/what is requesting service
 * @param sender Message sender
 */
@SerialName("CommunicationRequest")
@Serializable
public data class CommunicationRequest(
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
  public val basedOn: List<Reference> = emptyList(),
  public val replaces: List<Reference> = emptyList(),
  /**
   * Composite request this is part of
   */
  public val groupIdentifier: Identifier? = null,
  /**
   * draft | active | on-hold | revoked | completed | entered-in-error | unknown
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * True if request is prohibiting action
   */
  public val doNotPerform: Boolean? = null,
  public val medium: List<CodeableConcept> = emptyList(),
  /**
   * Focus of message
   */
  public val subject: Reference? = null,
  public val about: List<Reference> = emptyList(),
  /**
   * Encounter created as part of
   */
  public val encounter: Reference? = null,
  public val payload: List<CommunicationRequestPayload> = emptyList(),
  /**
   * When scheduled
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When scheduled
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When request transitioned to being actionable
   */
  public val authoredOn: String? = null,
  /**
   * Who/what is requesting service
   */
  public val requester: Reference? = null,
  public val recipient: List<Reference> = emptyList(),
  /**
   * Message sender
   */
  public val sender: Reference? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
