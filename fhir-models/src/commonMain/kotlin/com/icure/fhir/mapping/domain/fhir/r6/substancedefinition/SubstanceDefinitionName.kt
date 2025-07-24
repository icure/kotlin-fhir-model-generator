//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param type Name type e.g. 'systematic',  'scientific, 'brand'
 * @param status The status of the name e.g. 'current', 'proposed'
 * @param preferred If this is the preferred name for this substance
 */
@SerialName("SubstanceDefinitionName")
@Serializable
public data class SubstanceDefinitionName(
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
   * Name type e.g. 'systematic',  'scientific, 'brand'
   */
  public val type: CodeableConcept? = null,
  /**
   * The status of the name e.g. 'current', 'proposed'
   */
  public val status: CodeableConcept? = null,
  /**
   * If this is the preferred name for this substance
   */
  public val preferred: Boolean? = null,
  public val language: List<CodeableConcept> = emptyList(),
  public val domain: List<CodeableConcept> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  public val synonym: List<SubstanceDefinitionName> = emptyList(),
  public val translation: List<SubstanceDefinitionName> = emptyList(),
  public val official: List<SubstanceDefinitionNameOfficial> = emptyList(),
  public val source: List<Reference> = emptyList(),
) : BackboneElement
