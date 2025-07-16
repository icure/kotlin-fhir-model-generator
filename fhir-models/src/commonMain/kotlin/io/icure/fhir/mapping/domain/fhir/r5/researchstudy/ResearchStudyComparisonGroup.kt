//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.researchstudy

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defined path through the study for a subject
 *
 * Describes an expected event or sequence of events for one of the subjects of a study. E.g. for a
 * living subject: exposure to drug A, wash-out, exposure to drug B, wash-out, follow-up. E.g. for a
 * stability study: {store sample from lot A at 25 degrees for 1 month}, {store sample from lot A at 40
 * degrees for 1 month}.
 *
 * @param id Unique id for inter-element referencing
 * @param linkId Allows the comparisonGroup for the study and the comparisonGroup for the subject to
 * be linked easily
 * @param name Label for study comparisonGroup
 * @param type Categorization of study comparisonGroup
 * @param description Short explanation of study path
 * @param observedGroup Group of participants who were enrolled in study comparisonGroup
 */
@SerialName("ResearchStudyComparisonGroup")
@Serializable
public data class ResearchStudyComparisonGroup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Allows the comparisonGroup for the study and the comparisonGroup for the subject to be linked
   * easily
   */
  public val linkId: String? = null,
  /**
   * Label for study comparisonGroup
   */
  public val name: String? = null,
  /**
   * Categorization of study comparisonGroup
   */
  public val type: CodeableConcept? = null,
  /**
   * Short explanation of study path
   */
  public val description: String? = null,
  public val intendedExposure: List<Reference> = emptyList(),
  /**
   * Group of participants who were enrolled in study comparisonGroup
   */
  public val observedGroup: Reference? = null,
) : BackboneElement
