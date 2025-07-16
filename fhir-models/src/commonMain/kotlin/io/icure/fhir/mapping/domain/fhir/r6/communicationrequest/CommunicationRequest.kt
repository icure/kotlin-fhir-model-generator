//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.communicationrequest

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param intent proposal | plan | directive | order | original-order | reflex-order | filler-order
 * | instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param doNotPerform True if request is prohibiting action
 * @param subject Focus of message
 * @param encounter The Encounter during which this CommunicationRequest was created
 * @param occurrenceDateTime When scheduled
 * @param occurrencePeriod When scheduled
 * @param authoredOn When request transitioned to being actionable
 * @param requester Who asks for the information to be shared
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
  /**
   * proposal | plan | directive | order | original-order | reflex-order | filler-order |
   * instance-order | option
   */
  public val intent: String? = null,
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
   * The Encounter during which this CommunicationRequest was created
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
   * Who asks for the information to be shared
   */
  public val requester: Reference? = null,
  public val recipient: List<Reference> = emptyList(),
  public val informationProvider: List<Reference> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
