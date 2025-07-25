//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.researchsubject

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Participant or object which is the recipient of investigative activities in a study
 *
 * A ResearchSubject is a participant or object which is the recipient of investigative activities
 * in a research study.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | active | retired | unknown
 * @param period Start and end of participation
 * @param study Study subject is part of
 * @param subject Who or what is part of study
 * @param assignedComparisonGroup What path should be followed
 * @param actualComparisonGroup What path was followed
 */
@SerialName("ResearchSubject")
@Serializable
public data class ResearchSubject(
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
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  public val progress: List<ResearchSubjectProgress> = emptyList(),
  /**
   * Start and end of participation
   */
  public val period: Period? = null,
  /**
   * Study subject is part of
   */
  public val study: Reference,
  /**
   * Who or what is part of study
   */
  public val subject: Reference,
  /**
   * What path should be followed
   */
  public val assignedComparisonGroup: String? = null,
  /**
   * What path was followed
   */
  public val actualComparisonGroup: String? = null,
  public val consent: List<Reference> = emptyList(),
) : DomainResource
