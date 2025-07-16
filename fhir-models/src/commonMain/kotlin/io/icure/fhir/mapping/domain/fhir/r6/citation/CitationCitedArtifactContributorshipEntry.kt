//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.citation

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
