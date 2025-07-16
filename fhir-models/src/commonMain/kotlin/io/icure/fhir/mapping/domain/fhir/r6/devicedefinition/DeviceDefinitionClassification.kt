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
 * What kind of device or device system this is
 *
 * What kind of device or device system this is.
 *
 * @param id Unique id for inter-element referencing
 * @param type A classification or risk class of the device model
 */
@SerialName("DeviceDefinitionClassification")
@Serializable
public data class DeviceDefinitionClassification(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A classification or risk class of the device model
   */
  public val type: CodeableConcept,
  public val justification: List<RelatedArtifact> = emptyList(),
) : BackboneElement
