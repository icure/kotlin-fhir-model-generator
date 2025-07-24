//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.explanationofbenefit

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Anatomical location
 *
 * Physical location where the service is performed or applies.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("ExplanationOfBenefitAddItemBodySite")
@Serializable
public data class ExplanationOfBenefitAddItemBodySite(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val site: List<CodeableReference> = emptyList(),
  public val subSite: List<CodeableConcept> = emptyList(),
) : BackboneElement
