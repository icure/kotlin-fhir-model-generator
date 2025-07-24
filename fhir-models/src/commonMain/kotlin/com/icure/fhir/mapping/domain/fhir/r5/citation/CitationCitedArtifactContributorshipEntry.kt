//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.citation

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An individual entity named as a contributor
 *
 * An individual entity named as a contributor, for example in the author list or contributor list.
 *
 * @param id Unique id for inter-element referencing
 * @param contributor The identity of the individual contributor
 * @param forenameInitials For citation styles that use initials
 * @param role The role of the contributor (e.g. author, editor, reviewer, funder)
 * @param correspondingContact Whether the contributor is the corresponding contributor for the role
 * @param rankingOrder Ranked order of contribution
 */
@SerialName("CitationCitedArtifactContributorshipEntry")
@Serializable
public data class CitationCitedArtifactContributorshipEntry(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The identity of the individual contributor
   */
  public val contributor: Reference,
  /**
   * For citation styles that use initials
   */
  public val forenameInitials: String? = null,
  public val affiliation: List<Reference> = emptyList(),
  public val contributionType: List<CodeableConcept> = emptyList(),
  /**
   * The role of the contributor (e.g. author, editor, reviewer, funder)
   */
  public val role: CodeableConcept? = null,
  public val contributionInstance:
      List<CitationCitedArtifactContributorshipEntryContributionInstance> = emptyList(),
  /**
   * Whether the contributor is the corresponding contributor for the role
   */
  public val correspondingContact: Boolean? = null,
  /**
   * Ranked order of contribution
   */
  public val rankingOrder: Int? = null,
) : BackboneElement
