//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.substancenucleicacid

import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Subunits are listed in order of decreasing length; sequences of the same length will be ordered
 * by molecular weight; subunits that have identical sequences will be repeated multiple times
 *
 * Subunits are listed in order of decreasing length; sequences of the same length will be ordered
 * by molecular weight; subunits that have identical sequences will be repeated multiple times.
 *
 * @param id Unique id for inter-element referencing
 * @param subunit Index of linear sequences of nucleic acids in order of decreasing length.
 * Sequences of the same length will be ordered by molecular weight. Subunits that have identical
 * sequences will be repeated and have sequential subscripts
 * @param sequence Actual nucleotide sequence notation from 5' to 3' end using standard single
 * letter codes. In addition to the base sequence, sugar and type of phosphate or non-phosphate linkage
 * should also be captured
 * @param length The length of the sequence shall be captured
 * @param sequenceAttachment (TBC)
 * @param fivePrime The nucleotide present at the 5’ terminal shall be specified based on a
 * controlled vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5’ prime
 * nucleotide is the letter at the first position in the sequence. A separate representation would be
 * redundant
 * @param threePrime The nucleotide present at the 3’ terminal shall be specified based on a
 * controlled vocabulary. Since the sequence is represented from the 5' to the 3' end, the 5’ prime
 * nucleotide is the letter at the last position in the sequence. A separate representation would be
 * redundant
 */
@SerialName("SubstanceNucleicAcidSubunit")
@Serializable
public data class SubstanceNucleicAcidSubunit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Index of linear sequences of nucleic acids in order of decreasing length. Sequences of the same
   * length will be ordered by molecular weight. Subunits that have identical sequences will be
   * repeated and have sequential subscripts
   */
  public val subunit: Int? = null,
  /**
   * Actual nucleotide sequence notation from 5' to 3' end using standard single letter codes. In
   * addition to the base sequence, sugar and type of phosphate or non-phosphate linkage should also be
   * captured
   */
  public val sequence: String? = null,
  /**
   * The length of the sequence shall be captured
   */
  public val length: Int? = null,
  /**
   * (TBC)
   */
  public val sequenceAttachment: Attachment? = null,
  /**
   * The nucleotide present at the 5’ terminal shall be specified based on a controlled vocabulary.
   * Since the sequence is represented from the 5' to the 3' end, the 5’ prime nucleotide is the letter
   * at the first position in the sequence. A separate representation would be redundant
   */
  public val fivePrime: CodeableConcept? = null,
  /**
   * The nucleotide present at the 3’ terminal shall be specified based on a controlled vocabulary.
   * Since the sequence is represented from the 5' to the 3' end, the 5’ prime nucleotide is the letter
   * at the last position in the sequence. A separate representation would be redundant
   */
  public val threePrime: CodeableConcept? = null,
  public val linkage: List<SubstanceNucleicAcidSubunitLinkage> = emptyList(),
  public val sugar: List<SubstanceNucleicAcidSubunitSugar> = emptyList(),
) : BackboneElement
