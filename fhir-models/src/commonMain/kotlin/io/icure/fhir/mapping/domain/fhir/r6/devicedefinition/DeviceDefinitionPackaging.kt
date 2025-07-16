//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the packaging of the device, i.e. how the device is packaged
 *
 * Information about the packaging of the device, i.e. how the device is packaged.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Business identifier of the packaged medication
 * @param type A code that defines the specific type of packaging
 * @param count The number of items contained in the package (devices or sub-packages)
 */
@SerialName("DeviceDefinitionPackaging")
@Serializable
public data class DeviceDefinitionPackaging(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Business identifier of the packaged medication
   */
  public val identifier: Identifier? = null,
  /**
   * A code that defines the specific type of packaging
   */
  public val type: CodeableConcept? = null,
  /**
   * The number of items contained in the package (devices or sub-packages)
   */
  public val count: Int? = null,
  public val distributor: List<DeviceDefinitionPackagingDistributor> = emptyList(),
  public val udiDeviceIdentifier: List<DeviceDefinitionUdiDeviceIdentifier> = emptyList(),
  public val packaging: List<DeviceDefinitionPackaging> = emptyList(),
) : BackboneElement
