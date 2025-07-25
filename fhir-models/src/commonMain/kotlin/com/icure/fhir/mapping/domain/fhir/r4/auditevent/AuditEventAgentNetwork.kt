//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.auditevent

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Logical network location for application activity
 *
 * Logical network location for application activity, if the activity has a network location.
 *
 * @param id Unique id for inter-element referencing
 * @param address Identifier for the network access point of the user device
 * @param type The type of network access point
 */
@SerialName("AuditEventAgentNetwork")
@Serializable
public data class AuditEventAgentNetwork(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifier for the network access point of the user device
   */
  public val address: String? = null,
  /**
   * The type of network access point
   */
  public val type: String? = null,
) : BackboneElement
