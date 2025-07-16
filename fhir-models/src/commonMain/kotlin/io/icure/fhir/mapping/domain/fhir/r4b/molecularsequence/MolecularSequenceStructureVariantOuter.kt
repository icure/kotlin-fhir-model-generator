//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.molecularsequence

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Structural variant outer
 *
 * Structural variant outer.
 *
 * @param id Unique id for inter-element referencing
 * @param start Structural variant outer start
 * @param end Structural variant outer end
 */
@SerialName("MolecularSequenceStructureVariantOuter")
@Serializable
public data class MolecularSequenceStructureVariantOuter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Structural variant outer start
   */
  public val start: Int? = null,
  /**
   * Structural variant outer end
   */
  public val end: Int? = null,
) : BackboneElement
