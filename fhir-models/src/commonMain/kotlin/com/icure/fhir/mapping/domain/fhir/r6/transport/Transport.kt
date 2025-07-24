//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.transport

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * Delivery of item
 *
 * Record of transport of item.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param instantiatesCanonical Formal definition of transport
 * @param instantiatesUri Formal definition of transport
 * @param groupIdentifier Requisition or grouper id
 * @param status in-progress | completed | abandoned | cancelled | planned | entered-in-error
 * @param statusReason Reason for current status
 * @param intent unknown | proposal | plan | order | original-order | reflex-order | filler-order |
 * instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param code Transport Type
 * @param description Human-readable explanation of transport
 * @param focus What transport is acting on
 * @param for_fhir Beneficiary of the Transport
 * @param encounter Healthcare event during which this transport originated
 * @param completionTime Completion time of the event (the occurrence)
 * @param authoredOn Transport Creation Date
 * @param lastModified Transport Last Modified Date
 * @param requester Who is asking for transport to be done
 * @param owner Responsible individual
 * @param location Where transport occurs
 * @param restriction Constraints on fulfillment transports
 * @param requestedLocation The desired location
 * @param currentLocation The entity current location
 * @param reason Why transport is needed
 * @param history Parent (or preceding) transport
 */
@SerialName("Transport")
@Serializable
public data class Transport(
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
  /**
   * Formal definition of transport
   */
  public val instantiatesCanonical: String? = null,
  /**
   * Formal definition of transport
   */
  public val instantiatesUri: String? = null,
  public val basedOn: List<Reference> = emptyList(),
  /**
   * Requisition or grouper id
   */
  public val groupIdentifier: Identifier? = null,
  public val partOf: List<Reference> = emptyList(),
  /**
   * in-progress | completed | abandoned | cancelled | planned | entered-in-error
   */
  public val status: String? = null,
  /**
   * Reason for current status
   */
  public val statusReason: CodeableConcept? = null,
  /**
   * unknown | proposal | plan | order | original-order | reflex-order | filler-order |
   * instance-order | option
   */
  public val intent: String? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * Transport Type
   */
  public val code: CodeableConcept? = null,
  /**
   * Human-readable explanation of transport
   */
  public val description: String? = null,
  /**
   * What transport is acting on
   */
  public val focus: Reference? = null,
  /**
   * Beneficiary of the Transport
   */
  @JsonNames("for")
  public val for_fhir: Reference? = null,
  /**
   * Healthcare event during which this transport originated
   */
  public val encounter: Reference? = null,
  /**
   * Completion time of the event (the occurrence)
   */
  public val completionTime: String? = null,
  /**
   * Transport Creation Date
   */
  public val authoredOn: String? = null,
  /**
   * Transport Last Modified Date
   */
  public val lastModified: String? = null,
  /**
   * Who is asking for transport to be done
   */
  public val requester: Reference? = null,
  public val performerType: List<CodeableConcept> = emptyList(),
  /**
   * Responsible individual
   */
  public val owner: Reference? = null,
  /**
   * Where transport occurs
   */
  public val location: Reference? = null,
  public val insurance: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val relevantHistory: List<Reference> = emptyList(),
  /**
   * Constraints on fulfillment transports
   */
  public val restriction: TransportRestriction? = null,
  public val input: List<TransportInput> = emptyList(),
  public val output: List<TransportOutput> = emptyList(),
  /**
   * The desired location
   */
  public val requestedLocation: Reference,
  /**
   * The entity current location
   */
  public val currentLocation: Reference,
  /**
   * Why transport is needed
   */
  public val reason: CodeableReference? = null,
  /**
   * Parent (or preceding) transport
   */
  public val history: Reference? = null,
) : DomainResource
