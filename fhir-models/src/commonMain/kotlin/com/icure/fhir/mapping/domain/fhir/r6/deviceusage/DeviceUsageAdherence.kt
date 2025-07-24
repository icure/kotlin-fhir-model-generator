//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.deviceusage

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * How device is being used
 *
 * This indicates how or if the device is being used.
 *
 * @param id Unique id for inter-element referencing
 * @param code always | never | sometimes
 */
@SerialName("DeviceUsageAdherence")
@Serializable
public data class DeviceUsageAdherence(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * always | never | sometimes
   */
  public val code: CodeableConcept,
  public val reason: List<CodeableConcept> = emptyList(),
) : BackboneElement
