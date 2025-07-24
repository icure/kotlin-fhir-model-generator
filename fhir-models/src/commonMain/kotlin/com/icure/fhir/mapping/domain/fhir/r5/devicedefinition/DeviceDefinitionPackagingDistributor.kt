//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An organization that distributes the packaged device
 *
 * An organization that distributes the packaged device.
 *
 * @param id Unique id for inter-element referencing
 * @param name Distributor's human-readable name
 */
@SerialName("DeviceDefinitionPackagingDistributor")
@Serializable
public data class DeviceDefinitionPackagingDistributor(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Distributor's human-readable name
   */
  public val name: String? = null,
  public val organizationReference: List<Reference> = emptyList(),
) : BackboneElement
