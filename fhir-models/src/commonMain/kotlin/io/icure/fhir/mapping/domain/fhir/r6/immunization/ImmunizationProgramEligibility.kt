//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.immunization

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Patient eligibility for a specific vaccination program
 *
 * Indicates a patient's eligibility for a funding program.
 *
 * @param id Unique id for inter-element referencing
 * @param program The program that eligibility is declared for
 * @param programStatus The patient's eligibility status for the program
 */
@SerialName("ImmunizationProgramEligibility")
@Serializable
public data class ImmunizationProgramEligibility(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The program that eligibility is declared for
   */
  public val program: CodeableConcept,
  /**
   * The patient's eligibility status for the program
   */
  public val programStatus: CodeableConcept,
) : BackboneElement
