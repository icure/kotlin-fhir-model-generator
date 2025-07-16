//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The actual configuration settings of a device as it actually operates, e.g., regulation status,
 * time properties
 *
 * The actual configuration settings of a device as it actually operates, e.g., regulation status,
 * time properties.
 *
 * @param id Unique id for inter-element referencing
 * @param type Code that specifies the property DeviceDefinitionPropetyCode (Extensible)
 */
@SerialName("DeviceDefinitionProperty")
@Serializable
public data class DeviceDefinitionProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that specifies the property DeviceDefinitionPropetyCode (Extensible)
   */
  public val type: CodeableConcept,
  public val valueQuantity: List<Quantity> = emptyList(),
  public val valueCode: List<CodeableConcept> = emptyList(),
) : BackboneElement
