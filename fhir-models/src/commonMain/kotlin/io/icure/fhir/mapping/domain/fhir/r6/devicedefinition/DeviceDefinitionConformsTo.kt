//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
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
 * @param category Describes the common type of the standard, specification, or formal guidance
 * @param specification Identifies the standard, specification, or formal guidance that the device
 * adheres to the Device Specification type
 */
@SerialName("DeviceDefinitionConformsTo")
@Serializable
public data class DeviceDefinitionConformsTo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Describes the common type of the standard, specification, or formal guidance
   */
  public val category: CodeableConcept? = null,
  /**
   * Identifies the standard, specification, or formal guidance that the device adheres to the
   * Device Specification type
   */
  public val specification: CodeableConcept,
  public val version: List<String> = emptyList(),
  public val source: List<RelatedArtifact> = emptyList(),
) : BackboneElement
