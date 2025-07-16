//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.activitydefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who should participate in the action
 *
 * Indicates who should participate in performing the action described.
 *
 * @param id Unique id for inter-element referencing
 * @param type careteam | device | group | healthcareservice | location | organization | patient |
 * practitioner | practitionerrole | relatedperson
 * @param typeCanonical Who or what can participate
 * @param typeReference Who or what can participate
 * @param role E.g. Nurse, Surgeon, Parent, etc
 * @param function E.g. Author, Reviewer, Witness, etc
 */
@SerialName("ActivityDefinitionParticipant")
@Serializable
public data class ActivityDefinitionParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * careteam | device | group | healthcareservice | location | organization | patient |
   * practitioner | practitionerrole | relatedperson
   */
  public val type: String? = null,
  /**
   * Who or what can participate
   */
  public val typeCanonical: String? = null,
  /**
   * Who or what can participate
   */
  public val typeReference: Reference? = null,
  /**
   * E.g. Nurse, Surgeon, Parent, etc
   */
  public val role: CodeableConcept? = null,
  /**
   * E.g. Author, Reviewer, Witness, etc
   */
  public val function: CodeableConcept? = null,
) : BackboneElement
