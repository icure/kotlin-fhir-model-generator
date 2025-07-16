//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.molecularsequence

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about a biological sequence
 *
 * Raw data describing a biological sequence.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type aa | dna | rna
 * @param coordinateSystem Base number of coordinate system (0 for 0-based numbering or coordinates,
 * inclusive start, exclusive end, 1 for 1-based numbering, inclusive start, inclusive end)
 * @param patient Who and/or what this is about
 * @param specimen Specimen used for sequencing
 * @param device The method for sequencing
 * @param performer Who should be responsible for test result
 * @param quantity The number of copies of the sequence of interest.  (RNASeq)
 * @param referenceSeq A sequence used as reference
 * @param observedSeq Sequence that was observed
 * @param readCoverage Average number of reads representing a given nucleotide in the reconstructed
 * sequence
 */
@SerialName("MolecularSequence")
@Serializable
public data class MolecularSequence(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * aa | dna | rna
   */
  public val type: String? = null,
  /**
   * Base number of coordinate system (0 for 0-based numbering or coordinates, inclusive start,
   * exclusive end, 1 for 1-based numbering, inclusive start, inclusive end)
   */
  public val coordinateSystem: Int? = null,
  /**
   * Who and/or what this is about
   */
  public val patient: Reference? = null,
  /**
   * Specimen used for sequencing
   */
  public val specimen: Reference? = null,
  /**
   * The method for sequencing
   */
  public val device: Reference? = null,
  /**
   * Who should be responsible for test result
   */
  public val performer: Reference? = null,
  /**
   * The number of copies of the sequence of interest.  (RNASeq)
   */
  public val quantity: Quantity? = null,
  /**
   * A sequence used as reference
   */
  public val referenceSeq: MolecularSequenceReferenceSeq? = null,
  public val variant: List<MolecularSequenceVariant> = emptyList(),
  /**
   * Sequence that was observed
   */
  public val observedSeq: String? = null,
  public val quality: List<MolecularSequenceQuality> = emptyList(),
  /**
   * Average number of reads representing a given nucleotide in the reconstructed sequence
   */
  public val readCoverage: Int? = null,
  public val repository: List<MolecularSequenceRepository> = emptyList(),
  public val pointer: List<Reference> = emptyList(),
  public val structureVariant: List<MolecularSequenceStructureVariant> = emptyList(),
) : DomainResource
