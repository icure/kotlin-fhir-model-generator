//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.citation

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The defined version of the cited artifact
 *
 * The defined version of the cited artifact.
 *
 * @param id Unique id for inter-element referencing
 * @param value The version number or other version identifier
 * @param baseCitation Citation for the main version of the cited artifact
 */
@SerialName("CitationCitedArtifactVersion")
@Serializable
public data class CitationCitedArtifactVersion(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The version number or other version identifier
   */
  public val `value`: String? = null,
  /**
   * Citation for the main version of the cited artifact
   */
  public val baseCitation: Reference? = null,
) : BackboneElement
