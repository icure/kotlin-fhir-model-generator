//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.requestgroup

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A group of related requests
 *
 * A group of related requests that can be used to capture intended activities that have
 * inter-dependencies such as "give this medication after that one".
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param groupIdentifier Composite request this is part of
 * @param status draft | active | on-hold | revoked | completed | entered-in-error | unknown
 * @param intent proposal | plan | directive | order | original-order | reflex-order | filler-order
 * | instance-order | option
 * @param priority routine | urgent | asap | stat
 * @param code What's being requested/ordered
 * @param subject Who the request group is about
 * @param encounter Created as part of
 * @param authoredOn When the request group was authored
 * @param author Device or practitioner that authored the request group
 */
@SerialName("RequestGroup")
@Serializable
public data class RequestGroup(
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
   * proposal | plan | directive | order | original-order | reflex-order | filler-order |
   * instance-order | option
   */
  public val intent: String? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * What's being requested/ordered
   */
  public val code: CodeableConcept? = null,
  /**
   * Who the request group is about
   */
  public val subject: Reference? = null,
  /**
   * Created as part of
   */
  public val encounter: Reference? = null,
  /**
   * When the request group was authored
   */
  public val authoredOn: String? = null,
  /**
   * Device or practitioner that authored the request group
   */
  public val author: Reference? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val action: List<RequestGroupAction> = emptyList(),
) : DomainResource
