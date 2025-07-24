//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.messageheader

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A resource that describes a message that is exchanged between systems
 *
 * The header for a message exchange that is either requesting or responding to an action.  The
 * reference(s) that are the subject of the action as well as other information related to the action
 * are typically transmitted in a bundle in which the MessageHeader resource instance is the first
 * resource in the bundle.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param eventCoding The real world event that triggered this messsage
 * @param eventUri The real world event that triggered this messsage
 * @param eventCanonical The real world event that triggered this messsage
 * @param source Message source application
 * @param reason Cause of event
 * @param response If this is a reply to prior message
 * @param definition Link to the definition for this message
 */
@SerialName("MessageHeader")
@Serializable
public data class MessageHeader(
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
  /**
   * The real world event that triggered this messsage
   */
  public val eventCoding: Coding? = null,
  /**
   * The real world event that triggered this messsage
   */
  public val eventUri: String? = null,
  /**
   * The real world event that triggered this messsage
   */
  public val eventCanonical: String? = null,
  public val destination: List<MessageHeaderDestination> = emptyList(),
  /**
   * Message source application
   */
  public val source: MessageHeaderSource,
  /**
   * Cause of event
   */
  public val reason: CodeableConcept? = null,
  /**
   * If this is a reply to prior message
   */
  public val response: MessageHeaderResponse? = null,
  public val focus: List<Reference> = emptyList(),
  /**
   * Link to the definition for this message
   */
  public val definition: String? = null,
) : DomainResource
