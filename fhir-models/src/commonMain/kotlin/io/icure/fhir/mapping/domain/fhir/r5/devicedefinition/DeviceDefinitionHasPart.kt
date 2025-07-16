//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A device, part of the current one
 *
 * A device that is part (for example a component) of the present device.
 *
 * @param id Unique id for inter-element referencing
 * @param reference Reference to the part
 * @param count Number of occurrences of the part
 */
@SerialName("DeviceDefinitionHasPart")
@Serializable
public data class DeviceDefinitionHasPart(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to the part
   */
  public val reference: Reference,
  /**
   * Number of occurrences of the part
   */
  public val count: Int? = null,
) : BackboneElement
