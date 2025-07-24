//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.citation

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Used to record a display of the author/contributor list without separate coding for each list
 * member
 *
 * Used to record a display of the author/contributor list without separate coding for each list
 * member.
 *
 * @param id Unique id for inter-element referencing
 * @param type Either authorList or contributorshipStatement
 * @param style The format for the display string
 * @param source Used to code the producer or rule for creating the display string
 * @param value The display string for the author list, contributor list, or contributorship
 * statement
 */
@SerialName("CitationCitedArtifactContributorshipSummary")
@Serializable
public data class CitationCitedArtifactContributorshipSummary(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Either authorList or contributorshipStatement
   */
  public val type: CodeableConcept? = null,
  /**
   * The format for the display string
   */
  public val style: CodeableConcept? = null,
  /**
   * Used to code the producer or rule for creating the display string
   */
  public val source: CodeableConcept? = null,
  /**
   * The display string for the author list, contributor list, or contributorship statement
   */
  public val `value`: String? = null,
) : BackboneElement
