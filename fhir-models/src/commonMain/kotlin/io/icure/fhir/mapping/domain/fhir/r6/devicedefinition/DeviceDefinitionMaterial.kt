//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A substance used to create the material(s) of which the device is made
 *
 * A substance used to create the material(s) of which the device is made.
 *
 * @param id Unique id for inter-element referencing
 * @param substance A relevant substance that the device contains, may contain, or is made of
 * @param alternate Indicates an alternative material of the device
 * @param allergenicIndicator Whether the substance is a known or suspected allergen
 */
@SerialName("DeviceDefinitionMaterial")
@Serializable
public data class DeviceDefinitionMaterial(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A relevant substance that the device contains, may contain, or is made of
   */
  public val substance: CodeableConcept,
  /**
   * Indicates an alternative material of the device
   */
  public val alternate: Boolean? = null,
  /**
   * Whether the substance is a known or suspected allergen
   */
  public val allergenicIndicator: Boolean? = null,
) : BackboneElement
