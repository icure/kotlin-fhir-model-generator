//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.episodeofcare

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time
 * that the Organization assumes some level of responsibility
 *
 * An association between a patient and an organization / healthcare provider(s) during which time
 * encounters may occur. The managing organization assumes a level of responsibility for the patient
 * during this time.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status planned | waitlist | active | onhold | finished | cancelled | entered-in-error
 * @param patient The patient who is the focus of this episode of care
 * @param managingOrganization Organization that assumes care
 * @param period Interval during responsibility is assumed
 * @param careManager Care manager/care coordinator for the patient
 */
@SerialName("EpisodeOfCare")
@Serializable
public data class EpisodeOfCare(
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
   * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
   */
  public val status: String? = null,
  public val statusHistory: List<EpisodeOfCareStatusHistory> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  public val diagnosis: List<EpisodeOfCareDiagnosis> = emptyList(),
  /**
   * The patient who is the focus of this episode of care
   */
  public val patient: Reference,
  /**
   * Organization that assumes care
   */
  public val managingOrganization: Reference? = null,
  /**
   * Interval during responsibility is assumed
   */
  public val period: Period? = null,
  public val referralRequest: List<Reference> = emptyList(),
  /**
   * Care manager/care coordinator for the patient
   */
  public val careManager: Reference? = null,
  public val team: List<Reference> = emptyList(),
  public val account: List<Reference> = emptyList(),
) : DomainResource
