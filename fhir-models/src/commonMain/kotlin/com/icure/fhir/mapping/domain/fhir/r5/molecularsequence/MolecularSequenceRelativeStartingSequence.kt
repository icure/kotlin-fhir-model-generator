//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.molecularsequence

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A sequence used as starting sequence
 *
 * A sequence that is used as a starting sequence to describe variants that are present in a
 * sequence analyzed.
 *
 * @param id Unique id for inter-element referencing
 * @param genomeAssembly The genome assembly used for starting sequence, e.g. GRCh38
 * @param chromosome Chromosome Identifier
 * @param sequenceCodeableConcept The reference sequence that represents the starting sequence
 * @param sequenceString The reference sequence that represents the starting sequence
 * @param sequenceReference The reference sequence that represents the starting sequence
 * @param windowStart Start position of the window on the starting sequence
 * @param windowEnd End position of the window on the starting sequence
 * @param orientation sense | antisense
 * @param strand watson | crick
 */
@SerialName("MolecularSequenceRelativeStartingSequence")
@Serializable
public data class MolecularSequenceRelativeStartingSequence(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The genome assembly used for starting sequence, e.g. GRCh38
   */
  public val genomeAssembly: CodeableConcept? = null,
  /**
   * Chromosome Identifier
   */
  public val chromosome: CodeableConcept? = null,
  /**
   * The reference sequence that represents the starting sequence
   */
  public val sequenceCodeableConcept: CodeableConcept? = null,
  /**
   * The reference sequence that represents the starting sequence
   */
  public val sequenceString: String? = null,
  /**
   * The reference sequence that represents the starting sequence
   */
  public val sequenceReference: Reference? = null,
  /**
   * Start position of the window on the starting sequence
   */
  public val windowStart: Int? = null,
  /**
   * End position of the window on the starting sequence
   */
  public val windowEnd: Int? = null,
  /**
   * sense | antisense
   */
  public val orientation: String? = null,
  /**
   * watson | crick
   */
  public val strand: String? = null,
) : BackboneElement
