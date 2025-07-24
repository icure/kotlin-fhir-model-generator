//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An associated device, attached to, used with, communicating with or linking a previous or new
 * device model to the focal device
 *
 * An associated device, attached to, used with, communicating with or linking a previous or new
 * device model to the focal device.
 *
 * @param id Unique id for inter-element referencing
 * @param relation The type indicates the relationship of the related device to the device instance
 * @param relatedDevice A reference to the linked device
 */
@SerialName("DeviceDefinitionLink")
@Serializable
public data class DeviceDefinitionLink(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type indicates the relationship of the related device to the device instance
   */
  public val relation: Coding,
  /**
   * A reference to the linked device
   */
  public val relatedDevice: CodeableReference,
) : BackboneElement
