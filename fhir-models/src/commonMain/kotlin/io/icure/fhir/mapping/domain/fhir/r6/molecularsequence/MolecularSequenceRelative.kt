//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.molecularsequence

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A sequence defined relative to another sequence
 *
 * A sequence defined relative to another sequence.
 *
 * @param id Unique id for inter-element referencing
 * @param coordinateSystem Ways of identifying nucleotides or amino acids within a sequence
 * @param ordinalPosition Indicates the order in which the sequence should be considered when
 * putting multiple 'relative' elements together
 * @param sequenceRange Indicates the nucleotide range in the composed sequence when multiple
 * 'relative' elements are used together
 * @param startingSequence A sequence used as starting sequence
 */
@SerialName("MolecularSequenceRelative")
@Serializable
public data class MolecularSequenceRelative(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Ways of identifying nucleotides or amino acids within a sequence
   */
  public val coordinateSystem: CodeableConcept,
  /**
   * Indicates the order in which the sequence should be considered when putting multiple 'relative'
   * elements together
   */
  public val ordinalPosition: Int? = null,
  /**
   * Indicates the nucleotide range in the composed sequence when multiple 'relative' elements are
   * used together
   */
  public val sequenceRange: Range? = null,
  /**
   * A sequence used as starting sequence
   */
  public val startingSequence: MolecularSequenceRelativeStartingSequence? = null,
  public val edit: List<MolecularSequenceRelativeEdit> = emptyList(),
) : BackboneElement
