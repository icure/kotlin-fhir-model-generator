//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.device

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Identifies the standards, specifications, or formal guidances for the capabilities supported by
 * the device
 *
 * Identifies the standards, specifications, or formal guidances for the capabilities supported by
 * the device. The device may be certified as conformant to these specifications e.g., communication,
 * performance, process, measurement, or specialization standards.
 *
 * @param id Unique id for inter-element referencing
 * @param category Describes the common type of the standard, specification, or formal guidance. 
 * communication | performance | measurement
 * @param specification Identifies the standard, specification, or formal guidance that the device
 * adheres to
 * @param version Specific form or variant of the standard
 */
@SerialName("DeviceConformsTo")
@Serializable
public data class DeviceConformsTo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Describes the common type of the standard, specification, or formal guidance.  communication |
   * performance | measurement
   */
  public val category: CodeableConcept? = null,
  /**
   * Identifies the standard, specification, or formal guidance that the device adheres to
   */
  public val specification: CodeableConcept,
  /**
   * Specific form or variant of the standard
   */
  public val version: String? = null,
) : BackboneElement
