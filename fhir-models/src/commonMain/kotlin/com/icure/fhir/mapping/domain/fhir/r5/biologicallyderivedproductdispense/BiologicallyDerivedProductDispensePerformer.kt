//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.biologicallyderivedproductdispense

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Indicates who or what performed an action
 *
 * Indicates who or what performed an action.
 *
 * @param id Unique id for inter-element referencing
 * @param function Identifies the function of the performer during the dispense
 * @param actor Who performed the action
 */
@SerialName("BiologicallyDerivedProductDispensePerformer")
@Serializable
public data class BiologicallyDerivedProductDispensePerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifies the function of the performer during the dispense
   */
  public val function: CodeableConcept? = null,
  /**
   * Who performed the action
   */
  public val actor: Reference,
) : BackboneElement
