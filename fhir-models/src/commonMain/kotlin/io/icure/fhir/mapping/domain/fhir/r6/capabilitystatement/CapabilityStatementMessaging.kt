//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.capabilitystatement

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * If messaging is supported
 *
 * A description of the messaging capabilities of the solution.
 *
 * @param id Unique id for inter-element referencing
 * @param reliableCache Reliable Message Cache Length (min)
 * @param documentation Messaging interface behavior details
 */
@SerialName("CapabilityStatementMessaging")
@Serializable
public data class CapabilityStatementMessaging(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val endpoint: List<CapabilityStatementMessagingEndpoint> = emptyList(),
  /**
   * Reliable Message Cache Length (min)
   */
  public val reliableCache: Int? = null,
  /**
   * Messaging interface behavior details
   */
  public val documentation: String? = null,
  public val supportedMessage: List<CapabilityStatementMessagingSupportedMessage> = emptyList(),
) : BackboneElement
