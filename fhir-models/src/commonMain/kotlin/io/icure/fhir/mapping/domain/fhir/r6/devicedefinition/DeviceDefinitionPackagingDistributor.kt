//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
