//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancesourcematerial

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Source material shall capture information on the taxonomic and anatomical origins as well as the
 * fraction of a material that can result in or can be modified to form a substance. This set of data
 * elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and
 * anatomical origins shall be described using a controlled vocabulary as required. This information is
 * captured for naturally derived polymers ( . starch) and structurally diverse substances. For
 * Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a
 * single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations,
 * the fraction information will be captured at the Substance information level and additional
 * information for herbal extracts will be captured at the Specified Substance Group 1 information
 * level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex
 *
 * Source material shall capture information on the taxonomic and anatomical origins as well as the
 * fraction of a material that can result in or can be modified to form a substance. This set of data
 * elements shall be used to define polymer substances isolated from biological matrices. Taxonomic and
 * anatomical origins shall be described using a controlled vocabulary as required. This information is
 * captured for naturally derived polymers ( . starch) and structurally diverse substances. For
 * Organisms belonging to the Kingdom Plantae the Substance level defines the fresh material of a
 * single species or infraspecies, the Herbal Drug and the Herbal preparation. For Herbal preparations,
 * the fraction information will be captured at the Substance information level and additional
 * information for herbal extracts will be captured at the Specified Substance Group 1 information
 * level. See for further explanation the Substance Class: Structurally Diverse and the herbal annex.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param sourceMaterialClass General high level classification of the source material specific to
 * the origin of the material
 * @param sourceMaterialType The type of the source material shall be specified based on a
 * controlled vocabulary. For vaccines, this subclause refers to the class of infectious agent
 * @param sourceMaterialState The state of the source material when extracted
 * @param organismId The unique identifier associated with the source material parent organism shall
 * be specified
 * @param organismName The organism accepted Scientific name shall be provided based on the organism
 * taxonomy
 * @param developmentStage Stage of life for animals, plants, insects and microorganisms. This
 * information shall be provided only when the substance is significantly different in these stages
 * (e.g. foetal bovine serum)
 * @param organism This subclause describes the organism which the substance is derived from. For
 * vaccines, the parent organism shall be specified based on these subclause elements. As an example,
 * full taxonomy will be described for the Substance Name: ., Leaf
 */
@SerialName("SubstanceSourceMaterial")
@Serializable
public data class SubstanceSourceMaterial(
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
   * General high level classification of the source material specific to the origin of the material
   */
  public val sourceMaterialClass: CodeableConcept? = null,
  /**
   * The type of the source material shall be specified based on a controlled vocabulary. For
   * vaccines, this subclause refers to the class of infectious agent
   */
  public val sourceMaterialType: CodeableConcept? = null,
  /**
   * The state of the source material when extracted
   */
  public val sourceMaterialState: CodeableConcept? = null,
  /**
   * The unique identifier associated with the source material parent organism shall be specified
   */
  public val organismId: Identifier? = null,
  /**
   * The organism accepted Scientific name shall be provided based on the organism taxonomy
   */
  public val organismName: String? = null,
  public val parentSubstanceId: List<Identifier> = emptyList(),
  public val parentSubstanceName: List<String> = emptyList(),
  public val countryOfOrigin: List<CodeableConcept> = emptyList(),
  public val geographicalLocation: List<String> = emptyList(),
  /**
   * Stage of life for animals, plants, insects and microorganisms. This information shall be
   * provided only when the substance is significantly different in these stages (e.g. foetal bovine
   * serum)
   */
  public val developmentStage: CodeableConcept? = null,
  public val fractionDescription: List<SubstanceSourceMaterialFractionDescription> = emptyList(),
  /**
   * This subclause describes the organism which the substance is derived from. For vaccines, the
   * parent organism shall be specified based on these subclause elements. As an example, full taxonomy
   * will be described for the Substance Name: ., Leaf
   */
  public val organism: SubstanceSourceMaterialOrganism? = null,
  public val partDescription: List<SubstanceSourceMaterialPartDescription> = emptyList(),
) : DomainResource
