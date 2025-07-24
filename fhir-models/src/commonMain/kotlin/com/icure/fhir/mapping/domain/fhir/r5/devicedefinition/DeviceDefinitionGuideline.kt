//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information aimed at providing directions for the usage of this model of device
 *
 * Information aimed at providing directions for the usage of this model of device.
 *
 * @param id Unique id for inter-element referencing
 * @param usageInstruction Detailed written and visual directions for the user on how to use the
 * device
 * @param intendedUse A description of the general purpose or medical use of the device or its
 * function
 */
@SerialName("DeviceDefinitionGuideline")
@Serializable
public data class DeviceDefinitionGuideline(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val useContext: List<UsageContext> = emptyList(),
  /**
   * Detailed written and visual directions for the user on how to use the device
   */
  public val usageInstruction: String? = null,
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  public val indication: List<CodeableConcept> = emptyList(),
  public val contraindication: List<CodeableConcept> = emptyList(),
  public val warning: List<CodeableConcept> = emptyList(),
  /**
   * A description of the general purpose or medical use of the device or its function
   */
  public val intendedUse: String? = null,
) : BackboneElement
