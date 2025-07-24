//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.relatedartifact.RelatedArtifact
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
