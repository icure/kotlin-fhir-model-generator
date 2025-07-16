//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.capabilitystatement

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Where messages should be sent
 *
 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
 *
 * @param id Unique id for inter-element referencing
 * @param protocol http | ftp | mllp +
 * @param address Network address or identifier of the end-point
 */
@SerialName("CapabilityStatementMessagingEndpoint")
@Serializable
public data class CapabilityStatementMessagingEndpoint(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * http | ftp | mllp +
   */
  public val protocol: Coding,
  /**
   * Network address or identifier of the end-point
   */
  public val address: String? = null,
) : BackboneElement
