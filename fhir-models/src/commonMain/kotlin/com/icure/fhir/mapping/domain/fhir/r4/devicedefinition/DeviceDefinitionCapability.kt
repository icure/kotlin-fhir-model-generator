//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Device capabilities
 *
 * Device capabilities.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type of capability
 */
@SerialName("DeviceDefinitionCapability")
@Serializable
public data class DeviceDefinitionCapability(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of capability
   */
  public val type: CodeableConcept,
  public val description: List<CodeableConcept> = emptyList(),
) : BackboneElement
