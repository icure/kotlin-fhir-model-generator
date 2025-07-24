//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
