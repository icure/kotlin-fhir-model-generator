//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.careteam

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Planned participants in the coordination and delivery of care
 *
 * The Care Team includes all the people and organizations who plan to participate in the
 * coordination and delivery of care.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status proposed | active | suspended | inactive | entered-in-error
 * @param name Name of the team, such as crisis assessment team
 * @param subject Who care team is for
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
   * Time period team covers
   */
  public val period: Period? = null,
  public val participant: List<CareTeamParticipant> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  public val managingOrganization: List<Reference> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
