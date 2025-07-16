//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.molecularsequence

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Structural variant inner
 *
 * Structural variant inner.
 *
 * @param id Unique id for inter-element referencing
 * @param start Structural variant inner start
 * @param end Structural variant inner end
 */
@SerialName("MolecularSequenceStructureVariantInner")
@Serializable
public data class MolecularSequenceStructureVariantInner(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Structural variant inner start
   */
  public val start: Int? = null,
  /**
   * Structural variant inner end
   */
  public val end: Int? = null,
) : BackboneElement
