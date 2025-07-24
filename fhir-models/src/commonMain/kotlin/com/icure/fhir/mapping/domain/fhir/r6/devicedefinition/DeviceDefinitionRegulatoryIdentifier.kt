//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Regulatory identifier(s) associated with this device
 *
 * Identifier associated with the regulatory documentation (certificates, technical documentation,
 * post-market surveillance documentation and reports) of a set of device models sharing the same
 * intended purpose, risk class and essential design and manufacturing characteristics. One example is
 * the Basic UDI-DI in Europe.
 *
 * @param id Unique id for inter-element referencing
 * @param type basic | master | license
 * @param deviceIdentifier The identifier itself
 * @param issuer The organization that issued this identifier
 * @param jurisdiction The jurisdiction to which the deviceIdentifier applies
 */
@SerialName("DeviceDefinitionRegulatoryIdentifier")
@Serializable
public data class DeviceDefinitionRegulatoryIdentifier(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * basic | master | license
   */
  public val type: String? = null,
  /**
   * The identifier itself
   */
  public val deviceIdentifier: String? = null,
  /**
   * The organization that issued this identifier
   */
  public val issuer: String? = null,
  /**
   * The jurisdiction to which the deviceIdentifier applies
   */
  public val jurisdiction: String? = null,
) : BackboneElement
