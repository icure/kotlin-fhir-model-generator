//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.researchsubject

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Subject status
 *
 * The current state (status) of the subject and resons for status change where appropriate.
 *
 * @param id Unique id for inter-element referencing
 * @param type state | milestone
 * @param subjectState candidate | eligible | follow-up | ineligible | not-registered | off-study |
 * on-study | on-study-intervention | on-study-observation | pending-on-study | potential-candidate |
 * screening | withdrawn
 * @param milestone SignedUp | Screened | Randomized
 * @param reason State change reason
 * @param startDate State change date
 * @param endDate State change date
 */
@SerialName("ResearchSubjectProgress")
@Serializable
public data class ResearchSubjectProgress(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * state | milestone
   */
  public val type: CodeableConcept? = null,
  /**
   * candidate | eligible | follow-up | ineligible | not-registered | off-study | on-study |
   * on-study-intervention | on-study-observation | pending-on-study | potential-candidate | screening
   * | withdrawn
   */
  public val subjectState: CodeableConcept? = null,
  /**
   * SignedUp | Screened | Randomized
   */
  public val milestone: CodeableConcept? = null,
  /**
   * State change reason
   */
  public val reason: CodeableConcept? = null,
  /**
   * State change date
   */
  public val startDate: String? = null,
  /**
   * State change date
   */
  public val endDate: String? = null,
) : BackboneElement
