//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
