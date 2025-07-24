//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.substancesourcematerial

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This subclause describes the organism which the substance is derived from. For vaccines, the
 * parent organism shall be specified based on these subclause elements. As an example, full taxonomy
 * will be described for the Substance Name: ., Leaf
 *
 * This subclause describes the organism which the substance is derived from. For vaccines, the
 * parent organism shall be specified based on these subclause elements. As an example, full taxonomy
 * will be described for the Substance Name: ., Leaf.
 *
 * @param id Unique id for inter-element referencing
 * @param family The family of an organism shall be specified
 * @param genus The genus of an organism shall be specified; refers to the Latin epithet of the
 * genus element of the plant/animal scientific name; it is present in names for genera, species and
 * infraspecies
 * @param species The species of an organism shall be specified; refers to the Latin epithet of the
 * species of the plant/animal; it is present in names for species and infraspecies
 * @param intraspecificType The Intraspecific type of an organism shall be specified
 * @param intraspecificDescription The intraspecific description of an organism shall be specified
 * based on a controlled vocabulary. For Influenza Vaccine, the intraspecific description shall contain
 * the syntax of the antigen in line with the WHO convention
 * @param hybrid 4.9.13.8.1 Hybrid species maternal organism ID (Optional)
 * @param organismGeneral 4.9.13.7.1 Kingdom (Conditional)
 */
@SerialName("SubstanceSourceMaterialOrganism")
@Serializable
public data class SubstanceSourceMaterialOrganism(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The family of an organism shall be specified
   */
  public val family: CodeableConcept? = null,
  /**
   * The genus of an organism shall be specified; refers to the Latin epithet of the genus element
   * of the plant/animal scientific name; it is present in names for genera, species and infraspecies
   */
  public val genus: CodeableConcept? = null,
  /**
   * The species of an organism shall be specified; refers to the Latin epithet of the species of
   * the plant/animal; it is present in names for species and infraspecies
   */
  public val species: CodeableConcept? = null,
  /**
   * The Intraspecific type of an organism shall be specified
   */
  public val intraspecificType: CodeableConcept? = null,
  /**
   * The intraspecific description of an organism shall be specified based on a controlled
   * vocabulary. For Influenza Vaccine, the intraspecific description shall contain the syntax of the
   * antigen in line with the WHO convention
   */
  public val intraspecificDescription: String? = null,
  public val author: List<SubstanceSourceMaterialOrganismAuthor> = emptyList(),
  /**
   * 4.9.13.8.1 Hybrid species maternal organism ID (Optional)
   */
  public val hybrid: SubstanceSourceMaterialOrganismHybrid? = null,
  /**
   * 4.9.13.7.1 Kingdom (Conditional)
   */
  public val organismGeneral: SubstanceSourceMaterialOrganismOrganismGeneral? = null,
) : BackboneElement
