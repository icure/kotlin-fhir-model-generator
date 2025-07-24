//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.molecularsequence

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A sequence used as reference
 *
 * A sequence that is used as a reference to describe variants that are present in a sequence
 * analyzed.
 *
 * @param id Unique id for inter-element referencing
 * @param chromosome Chromosome containing genetic finding
 * @param genomeBuild The Genome Build used for reference, following GRCh build versions e.g. 'GRCh
 * 37'
 * @param orientation sense | antisense
 * @param referenceSeqId Reference identifier
 * @param referenceSeqPointer A pointer to another MolecularSequence entity as reference sequence
 * @param referenceSeqString A string to represent reference sequence
 * @param strand watson | crick
 * @param windowStart Start position of the window on the  reference sequence
 * @param windowEnd End position of the window on the reference sequence
 */
@SerialName("MolecularSequenceReferenceSeq")
@Serializable
public data class MolecularSequenceReferenceSeq(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Chromosome containing genetic finding
   */
  public val chromosome: CodeableConcept? = null,
  /**
   * The Genome Build used for reference, following GRCh build versions e.g. 'GRCh 37'
   */
  public val genomeBuild: String? = null,
  /**
   * sense | antisense
   */
  public val orientation: String? = null,
  /**
   * Reference identifier
   */
  public val referenceSeqId: CodeableConcept? = null,
  /**
   * A pointer to another MolecularSequence entity as reference sequence
   */
  public val referenceSeqPointer: Reference? = null,
  /**
   * A string to represent reference sequence
   */
  public val referenceSeqString: String? = null,
  /**
   * watson | crick
   */
  public val strand: String? = null,
  /**
   * Start position of the window on the  reference sequence
   */
  public val windowStart: Int? = null,
  /**
   * End position of the window on the reference sequence
   */
  public val windowEnd: Int? = null,
) : BackboneElement
