//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.messageheader

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param eventCoding Event code or link to EventDefinition
 * @param eventCanonical Event code or link to EventDefinition
 * @param sender Real world sender of the message
 * @param author The source of the decision
 * @param source Message source application
 * @param responsible Final responsibility for event
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
   * Event code or link to EventDefinition
   */
  public val eventCoding: Coding? = null,
  /**
   * Event code or link to EventDefinition
   */
  public val eventCanonical: String? = null,
  public val destination: List<MessageHeaderDestination> = emptyList(),
  /**
   * Real world sender of the message
   */
  public val sender: Reference? = null,
  /**
   * The source of the decision
   */
  public val author: Reference? = null,
  /**
   * Message source application
   */
  public val source: MessageHeaderSource,
  /**
   * Final responsibility for event
   */
  public val responsible: Reference? = null,
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
