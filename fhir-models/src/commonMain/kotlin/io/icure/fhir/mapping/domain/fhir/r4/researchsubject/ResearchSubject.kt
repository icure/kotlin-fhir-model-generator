//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.researchsubject

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
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
 * Physical entity which is the primary unit of interest in the study
 *
 * A physical entity which is the primary unit of operational and/or administrative interest in a
 * study.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status candidate | eligible | follow-up | ineligible | not-registered | off-study |
 * on-study | on-study-intervention | on-study-observation | pending-on-study | potential-candidate |
 * screening | withdrawn
 * @param period Start and end of participation
 * @param study Study subject is part of
 * @param individual Who is part of study
 * @param assignedArm What path should be followed
 * @param actualArm What path was followed
 * @param consent Agreement to participate in study
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
   * candidate | eligible | follow-up | ineligible | not-registered | off-study | on-study |
   * on-study-intervention | on-study-observation | pending-on-study | potential-candidate | screening
   * | withdrawn
   */
  public val status: String? = null,
  /**
   * Start and end of participation
   */
  public val period: Period? = null,
  /**
   * Study subject is part of
   */
  public val study: Reference,
  /**
   * Who is part of study
   */
  public val individual: Reference,
  /**
   * What path should be followed
   */
  public val assignedArm: String? = null,
  /**
   * What path was followed
   */
  public val actualArm: String? = null,
  /**
   * Agreement to participate in study
   */
  public val consent: Reference? = null,
) : DomainResource
