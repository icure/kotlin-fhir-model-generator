//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancespecification

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Names applicable to this substance
 *
 * Names applicable to this substance.
 *
 * @param id Unique id for inter-element referencing
 * @param name The actual name
 * @param type Name type
 * @param status The status of the name
 * @param preferred If this is the preferred name for this substance
 */
@SerialName("SubstanceSpecificationName")
@Serializable
public data class SubstanceSpecificationName(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The actual name
   */
  public val name: String? = null,
  /**
   * Name type
   */
  public val type: CodeableConcept? = null,
  /**
   * The status of the name
   */
  public val status: CodeableConcept? = null,
  /**
   * If this is the preferred name for this substance
   */
  public val preferred: Boolean? = null,
  public val language: List<CodeableConcept> = emptyList(),
  public val domain: List<CodeableConcept> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  public val synonym: List<SubstanceSpecificationName> = emptyList(),
  public val translation: List<SubstanceSpecificationName> = emptyList(),
  public val official: List<SubstanceSpecificationNameOfficial> = emptyList(),
  public val source: List<Reference> = emptyList(),
) : BackboneElement
