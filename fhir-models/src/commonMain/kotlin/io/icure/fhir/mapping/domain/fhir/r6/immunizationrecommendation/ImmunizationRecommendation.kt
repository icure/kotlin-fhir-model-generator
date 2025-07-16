//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.immunizationrecommendation

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r6.servicelike.ServiceLike
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Guidance or advice relating to an immunization
 *
 * A patient's point-in-time set of recommendations (i.e. forecasting) according to a published
 * schedule with optional supporting justification.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param patient Who this profile is for
 * @param date Date recommendation(s) created
 * @param authority Who is responsible for protocol
 */
@SerialName("ImmunizationRecommendation")
@Serializable
public data class ImmunizationRecommendation(
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
   * Who this profile is for
   */
  public val patient: Reference,
  /**
   * Date recommendation(s) created
   */
  public val date: String? = null,
  /**
   * Who is responsible for protocol
   */
  public val authority: Reference? = null,
  public val recommendation: List<ImmunizationRecommendationRecommendation> = emptyList(),
) : ServiceLike, DomainResource
