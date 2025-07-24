//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancenucleicacid

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual
 * substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be
 * always entered in the 5’-3’ direction
 *
 * Nucleic acids are defined by three distinct elements: the base, sugar and linkage. Individual
 * substance/moiety IDs will be created for each of these elements. The nucleotide sequence will be
 * always entered in the 5’-3’ direction.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param sequenceType The type of the sequence shall be specified based on a controlled vocabulary
 * @param numberOfSubunits The number of linear sequences of nucleotides linked through
 * phosphodiester bonds shall be described. Subunits would be strands of nucleic acids that are tightly
 * associated typically through Watson-Crick base pairing. NOTE: If not specified in the reference
 * source, the assumption is that there is 1 subunit
 * @param areaOfHybridisation The area of hybridisation shall be described if applicable for double
 * stranded RNA or DNA. The number associated with the subunit followed by the number associated to the
 * residue shall be specified in increasing order. The underscore “” shall be used as separator as
 * follows: “Subunitnumber Residue”
 * @param oligoNucleotideType (TBC)
 */
@SerialName("SubstanceNucleicAcid")
@Serializable
public data class SubstanceNucleicAcid(
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
  /**
   * The type of the sequence shall be specified based on a controlled vocabulary
   */
  public val sequenceType: CodeableConcept? = null,
  /**
   * The number of linear sequences of nucleotides linked through phosphodiester bonds shall be
   * described. Subunits would be strands of nucleic acids that are tightly associated typically
   * through Watson-Crick base pairing. NOTE: If not specified in the reference source, the assumption
   * is that there is 1 subunit
   */
  public val numberOfSubunits: Int? = null,
  /**
   * The area of hybridisation shall be described if applicable for double stranded RNA or DNA. The
   * number associated with the subunit followed by the number associated to the residue shall be
   * specified in increasing order. The underscore “” shall be used as separator as follows:
   * “Subunitnumber Residue”
   */
  public val areaOfHybridisation: String? = null,
  /**
   * (TBC)
   */
  public val oligoNucleotideType: CodeableConcept? = null,
  public val subunit: List<SubstanceNucleicAcidSubunit> = emptyList(),
) : DomainResource
