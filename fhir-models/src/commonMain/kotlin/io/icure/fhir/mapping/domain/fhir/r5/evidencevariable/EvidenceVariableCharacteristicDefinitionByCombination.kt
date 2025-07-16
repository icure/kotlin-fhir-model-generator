//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.evidencevariable

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Used to specify how two or more characteristics are combined
 *
 * Defines the characteristic as a combination of two or more characteristics.
 *
 * @param id Unique id for inter-element referencing
 * @param code all-of | any-of | at-least | at-most | statistical | net-effect | dataset
 * @param threshold Provides the value of "n" when "at-least" or "at-most" codes are used
 */
@SerialName("EvidenceVariableCharacteristicDefinitionByCombination")
@Serializable
public data class EvidenceVariableCharacteristicDefinitionByCombination(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * all-of | any-of | at-least | at-most | statistical | net-effect | dataset
   */
  public val code: String? = null,
  /**
   * Provides the value of "n" when "at-least" or "at-most" codes are used
   */
  public val threshold: Int? = null,
  public val characteristic: List<EvidenceVariableCharacteristic> = emptyList(),
) : BackboneElement
