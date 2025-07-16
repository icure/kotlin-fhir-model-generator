//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substanceprotein

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination
 * of subunits that are either covalently linked or have a defined invariant stoichiometric
 * relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined
 * sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to
 * describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein
 * hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators
 *
 * A SubstanceProtein is defined as a single unit of a linear amino acid sequence, or a combination
 * of subunits that are either covalently linked or have a defined invariant stoichiometric
 * relationship. This includes all synthetic, recombinant and purified SubstanceProteins of defined
 * sequence, whether the use is therapeutic or prophylactic. This set of elements will be used to
 * describe albumins, coagulation factors, cytokines, growth factors, peptide/SubstanceProtein
 * hormones, enzymes, toxins, toxoids, recombinant vaccines, and immunomodulators.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param sequenceType The SubstanceProtein descriptive elements will only be used when a complete
 * or partial amino acid sequence is available or derivable from a nucleic acid sequence
 * @param numberOfSubunits Number of linear sequences of amino acids linked through peptide bonds.
 * The number of subunits constituting the SubstanceProtein shall be described. It is possible that the
 * number of subunits can be variable
 */
@SerialName("SubstanceProtein")
@Serializable
public data class SubstanceProtein(
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
   * The SubstanceProtein descriptive elements will only be used when a complete or partial amino
   * acid sequence is available or derivable from a nucleic acid sequence
   */
  public val sequenceType: CodeableConcept? = null,
  /**
   * Number of linear sequences of amino acids linked through peptide bonds. The number of subunits
   * constituting the SubstanceProtein shall be described. It is possible that the number of subunits
   * can be variable
   */
  public val numberOfSubunits: Int? = null,
  public val disulfideLinkage: List<String> = emptyList(),
  public val subunit: List<SubstanceProteinSubunit> = emptyList(),
) : DomainResource
