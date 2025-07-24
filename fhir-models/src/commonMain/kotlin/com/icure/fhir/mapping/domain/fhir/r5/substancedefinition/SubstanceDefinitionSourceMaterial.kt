//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Material or taxonomic/anatomical source
 *
 * Material or taxonomic/anatomical source for the substance.
 *
 * @param id Unique id for inter-element referencing
 * @param type Classification of the origin of the raw material. e.g. cat hair is an Animal source
 * type
 * @param genus The genus of an organism e.g. the Latin epithet of the plant/animal scientific name
 * @param species The species of an organism e.g. the Latin epithet of the species of the
 * plant/animal
 * @param part An anatomical origin of the source material within an organism
 */
@SerialName("SubstanceDefinitionSourceMaterial")
@Serializable
public data class SubstanceDefinitionSourceMaterial(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Classification of the origin of the raw material. e.g. cat hair is an Animal source type
   */
  public val type: CodeableConcept? = null,
  /**
   * The genus of an organism e.g. the Latin epithet of the plant/animal scientific name
   */
  public val genus: CodeableConcept? = null,
  /**
   * The species of an organism e.g. the Latin epithet of the species of the plant/animal
   */
  public val species: CodeableConcept? = null,
  /**
   * An anatomical origin of the source material within an organism
   */
  public val part: CodeableConcept? = null,
  public val countryOfOrigin: List<CodeableConcept> = emptyList(),
) : BackboneElement
