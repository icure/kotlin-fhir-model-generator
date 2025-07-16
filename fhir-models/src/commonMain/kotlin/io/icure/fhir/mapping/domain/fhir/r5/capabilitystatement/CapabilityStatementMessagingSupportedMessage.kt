//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.capabilitystatement

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Messages supported by this system
 *
 * References to message definitions for messages this system can send or receive.
 *
 * @param id Unique id for inter-element referencing
 * @param mode sender | receiver
 * @param definition Message supported by this system
 */
@SerialName("CapabilityStatementMessagingSupportedMessage")
@Serializable
public data class CapabilityStatementMessagingSupportedMessage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * sender | receiver
   */
  public val mode: String? = null,
  /**
   * Message supported by this system
   */
  public val definition: String? = null,
) : BackboneElement
