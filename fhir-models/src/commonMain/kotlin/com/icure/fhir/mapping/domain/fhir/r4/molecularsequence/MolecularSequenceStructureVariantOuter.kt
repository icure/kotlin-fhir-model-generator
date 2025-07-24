//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.molecularsequence

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
