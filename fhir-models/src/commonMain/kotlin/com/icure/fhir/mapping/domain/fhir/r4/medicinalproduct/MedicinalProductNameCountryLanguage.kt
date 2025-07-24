//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproduct

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Country where the name applies
 *
 * Country where the name applies.
 *
 * @param id Unique id for inter-element referencing
 * @param country Country code for where this name applies
 * @param jurisdiction Jurisdiction code for where this name applies
 * @param language Language code for this name
 */
@SerialName("MedicinalProductNameCountryLanguage")
@Serializable
public data class MedicinalProductNameCountryLanguage(
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
