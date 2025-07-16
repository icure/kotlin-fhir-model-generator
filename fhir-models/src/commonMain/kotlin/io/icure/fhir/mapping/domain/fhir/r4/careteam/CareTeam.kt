//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.careteam

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Planned participants in the coordination and delivery of care for a patient or group
 *
 * The Care Team includes all the people and organizations who plan to participate in the
 * coordination and delivery of care for a patient.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status proposed | active | suspended | inactive | entered-in-error
 * @param name Name of the team, such as crisis assessment team
 * @param subject Who care team is for
 * @param encounter Encounter created as part of
 * @param period Time period team covers
 */
@SerialName("CareTeam")
@Serializable
public data class CareTeam(
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
   * proposed | active | suspended | inactive | entered-in-error
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Name of the team, such as crisis assessment team
   */
  public val name: String? = null,
  /**
   * Who care team is for
   */
  public val subject: Reference? = null,
  /**
   * Encounter created as part of
   */
  public val encounter: Reference? = null,
  /**
   * Time period team covers
   */
  public val period: Period? = null,
  public val participant: List<CareTeamParticipant> = emptyList(),
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  public val managingOrganization: List<Reference> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
