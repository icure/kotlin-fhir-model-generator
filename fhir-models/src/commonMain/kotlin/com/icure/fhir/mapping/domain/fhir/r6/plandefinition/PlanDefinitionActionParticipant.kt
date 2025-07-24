//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.plandefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param actorId What actor
 * @param type careteam | device | group | healthcareservice | location | organization | patient |
 * practitioner | practitionerrole | relatedperson
 * @param typeCanonical Who or what can participate
 * @param typeReference Who or what can participate
 * @param role E.g. Nurse, Surgeon, Parent
 * @param function E.g. Author, Reviewer, Witness, etc
 */
@SerialName("PlanDefinitionActionParticipant")
@Serializable
public data class PlanDefinitionActionParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What actor
   */
  public val actorId: String? = null,
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
   * E.g. Nurse, Surgeon, Parent
   */
  public val role: CodeableConcept? = null,
  /**
   * E.g. Author, Reviewer, Witness, etc
   */
  public val function: CodeableConcept? = null,
) : BackboneElement
