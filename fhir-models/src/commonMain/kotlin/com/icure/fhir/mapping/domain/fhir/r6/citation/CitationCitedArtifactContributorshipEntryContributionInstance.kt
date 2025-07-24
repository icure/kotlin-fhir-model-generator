//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.citation

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contributions with accounting for time or number
 *
 * Contributions with accounting for time or number.
 *
 * @param id Unique id for inter-element referencing
 * @param type The specific contribution
 * @param time The time that the contribution was made
 */
@SerialName("CitationCitedArtifactContributorshipEntryContributionInstance")
@Serializable
public data class CitationCitedArtifactContributorshipEntryContributionInstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The specific contribution
   */
  public val type: CodeableConcept,
  /**
   * The time that the contribution was made
   */
  public val time: String? = null,
) : BackboneElement
