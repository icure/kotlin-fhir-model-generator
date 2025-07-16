//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.biologicallyderivedproductdispense

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
