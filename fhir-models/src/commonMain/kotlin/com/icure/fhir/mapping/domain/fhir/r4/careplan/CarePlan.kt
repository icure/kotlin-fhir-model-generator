//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.careplan

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
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Healthcare plan for patient or group
 *
 * Describes the intention of how one or more practitioners intend to deliver care for a particular
 * patient, group or community for a period of time, possibly limited to care for a specific condition
 * or set of conditions.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | active | on-hold | revoked | completed | entered-in-error | unknown
 * @param intent proposal | plan | order | option
 * @param title Human-friendly name for the care plan
 * @param description Summary of nature of plan
 * @param subject Who the care plan is for
 * @param encounter Encounter created as part of
 * @param period Time period plan covers
 * @param created Date record was first recorded
 * @param author Who is the designated responsible party
 */
@SerialName("CarePlan")
@Serializable
public data class CarePlan(
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
  public val partOf: List<Reference> = emptyList(),
  /**
   * draft | active | on-hold | revoked | completed | entered-in-error | unknown
   */
  public val status: String? = null,
  /**
   * proposal | plan | order | option
   */
  public val intent: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Human-friendly name for the care plan
   */
  public val title: String? = null,
  /**
   * Summary of nature of plan
   */
  public val description: String? = null,
  /**
   * Who the care plan is for
   */
  public val subject: Reference,
  /**
   * Encounter created as part of
   */
  public val encounter: Reference? = null,
  /**
   * Time period plan covers
   */
  public val period: Period? = null,
  /**
   * Date record was first recorded
   */
  public val created: String? = null,
  /**
   * Who is the designated responsible party
   */
  public val author: Reference? = null,
  public val contributor: List<Reference> = emptyList(),
  public val careTeam: List<Reference> = emptyList(),
  public val addresses: List<Reference> = emptyList(),
  public val supportingInfo: List<Reference> = emptyList(),
  public val goal: List<Reference> = emptyList(),
  public val activity: List<CarePlanActivity> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
