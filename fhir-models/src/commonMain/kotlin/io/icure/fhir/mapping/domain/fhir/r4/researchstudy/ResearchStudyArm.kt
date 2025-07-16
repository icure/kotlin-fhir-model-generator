//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.researchstudy

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defined path through the study for a subject
 *
 * Describes an expected sequence of events for one of the participants of a study.  E.g. Exposure
 * to drug A, wash-out, exposure to drug B, wash-out, follow-up.
 *
 * @param id Unique id for inter-element referencing
 * @param name Label for study arm
 * @param type Categorization of study arm
 * @param description Short explanation of study path
 */
@SerialName("ResearchStudyArm")
@Serializable
public data class ResearchStudyArm(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for study arm
   */
  public val name: String? = null,
  /**
   * Categorization of study arm
   */
  public val type: CodeableConcept? = null,
  /**
   * Short explanation of study path
   */
  public val description: String? = null,
) : BackboneElement
