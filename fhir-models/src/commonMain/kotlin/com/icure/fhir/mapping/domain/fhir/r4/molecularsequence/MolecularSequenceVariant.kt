//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.molecularsequence

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Variant in sequence
 *
 * The definition of variant here originates from Sequence ontology
 * ([variant_of](http://www.sequenceontology.org/browser/current_svn/term/variant_of)). This element
 * can represent amino acid or nucleic sequence change(including insertion,deletion,SNP,etc.)  It can
 * represent some complex mutation or segment variation with the assist of CIGAR string.
 *
 * @param id Unique id for inter-element referencing
 * @param start Start position of the variant on the  reference sequence
 * @param end End position of the variant on the reference sequence
 * @param observedAllele Allele that was observed
 * @param referenceAllele Allele in the reference sequence
 * @param cigar Extended CIGAR string for aligning the sequence with reference bases
 * @param variantPointer Pointer to observed variant information
 */
@SerialName("MolecularSequenceVariant")
@Serializable
public data class MolecularSequenceVariant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Start position of the variant on the  reference sequence
   */
  public val start: Int? = null,
  /**
   * End position of the variant on the reference sequence
   */
  public val end: Int? = null,
  /**
   * Allele that was observed
   */
  public val observedAllele: String? = null,
  /**
   * Allele in the reference sequence
   */
  public val referenceAllele: String? = null,
  /**
   * Extended CIGAR string for aligning the sequence with reference bases
   */
  public val cigar: String? = null,
  /**
   * Pointer to observed variant information
   */
  public val variantPointer: Reference? = null,
) : BackboneElement
