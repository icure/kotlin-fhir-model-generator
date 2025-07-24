//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.citation

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Organizational affiliation
 *
 * Organization affiliated with the entity.
 *
 * @param id Unique id for inter-element referencing
 * @param affiliation Display for the organization
 * @param role Role within the organization, such as professional title
 */
@SerialName("CitationCitedArtifactContributorshipEntryAffiliationInfo")
@Serializable
public data class CitationCitedArtifactContributorshipEntryAffiliationInfo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Display for the organization
   */
  public val affiliation: String? = null,
  /**
   * Role within the organization, such as professional title
   */
  public val role: String? = null,
  public val identifier: List<Identifier> = emptyList(),
) : BackboneElement
