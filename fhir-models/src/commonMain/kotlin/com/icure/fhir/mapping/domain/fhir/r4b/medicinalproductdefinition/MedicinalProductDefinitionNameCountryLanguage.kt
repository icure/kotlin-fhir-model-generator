//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medicinalproductdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Country and jurisdiction where the name applies
 *
 * Country and jurisdiction where the name applies, and associated language.
 *
 * @param id Unique id for inter-element referencing
 * @param country Country code for where this name applies
 * @param jurisdiction Jurisdiction code for where this name applies
 * @param language Language code for this name
 */
@SerialName("MedicinalProductDefinitionNameCountryLanguage")
@Serializable
public data class MedicinalProductDefinitionNameCountryLanguage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Country code for where this name applies
   */
  public val country: CodeableConcept,
  /**
   * Jurisdiction code for where this name applies
   */
  public val jurisdiction: CodeableConcept? = null,
  /**
   * Language code for this name
   */
  public val language: CodeableConcept,
) : BackboneElement
