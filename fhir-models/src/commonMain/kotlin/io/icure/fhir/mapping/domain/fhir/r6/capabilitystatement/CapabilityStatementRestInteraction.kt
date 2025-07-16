//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.capabilitystatement

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What operations are supported?
 *
 * A specification of restful operations supported by the system.
 *
 * @param id Unique id for inter-element referencing
 * @param code transaction | batch | search-system | history-system
 * @param documentation Anything special about operation behavior
 */
@SerialName("CapabilityStatementRestInteraction")
@Serializable
public data class CapabilityStatementRestInteraction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * transaction | batch | search-system | history-system
   */
  public val code: String? = null,
  /**
   * Anything special about operation behavior
   */
  public val documentation: String? = null,
) : BackboneElement
