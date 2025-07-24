//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.communication

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A clinical or business level record of information being transmitted or shared
 *
 * A clinical or business level record of information being transmitted or shared; e.g. an alert
 * that was sent to a responsible provider, a public health agency communication to a provider/reporter
 * in response to a case report for a reportable condition.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preparation | in-progress | not-done | on-hold | stopped | completed |
 * entered-in-error | unknown
 * @param statusReason Reason for current status
 * @param priority routine | urgent | asap | stat
 * @param subject Focus of message
 * @param topic Description of the purpose/content
 * @param encounter The Encounter during which this Communication was created
 * @param sent When sent
 * @param received When received
 * @param sender Who shares the information
 */
@SerialName("Communication")
@Serializable
public data class Communication(
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
  public val partOf: List<Reference> = emptyList(),
  public val inResponseTo: List<Reference> = emptyList(),
  /**
   * preparation | in-progress | not-done | on-hold | stopped | completed | entered-in-error |
   * unknown
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
  public val medium: List<CodeableConcept> = emptyList(),
  /**
   * Focus of message
   */
  public val subject: Reference? = null,
  /**
   * Description of the purpose/content
   */
  public val topic: CodeableConcept? = null,
  public val about: List<Reference> = emptyList(),
  /**
   * The Encounter during which this Communication was created
   */
  public val encounter: Reference? = null,
  /**
   * When sent
   */
  public val sent: String? = null,
  /**
   * When received
   */
  public val received: String? = null,
  public val recipient: List<Reference> = emptyList(),
  /**
   * Who shares the information
   */
  public val sender: Reference? = null,
  public val reason: List<CodeableReference> = emptyList(),
  public val payload: List<CommunicationPayload> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
