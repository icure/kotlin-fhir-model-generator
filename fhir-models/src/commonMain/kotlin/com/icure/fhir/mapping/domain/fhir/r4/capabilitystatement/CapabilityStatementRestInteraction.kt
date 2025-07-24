//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
