//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.molecularsequence

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Changes in sequence from the starting sequence
 *
 * Changes in sequence from the starting sequence.
 *
 * @param id Unique id for inter-element referencing
 * @param start Start position of the edit on the starting sequence
 * @param end End position of the edit on the starting sequence
 * @param replacementSequence Allele that was observed
 * @param replacedSequence Allele in the starting sequence
 */
@SerialName("MolecularSequenceRelativeEdit")
@Serializable
public data class MolecularSequenceRelativeEdit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Start position of the edit on the starting sequence
   */
  public val start: Int? = null,
  /**
   * End position of the edit on the starting sequence
   */
  public val end: Int? = null,
  /**
   * Allele that was observed
   */
  public val replacementSequence: String? = null,
  /**
   * Allele in the starting sequence
   */
  public val replacedSequence: String? = null,
) : BackboneElement
