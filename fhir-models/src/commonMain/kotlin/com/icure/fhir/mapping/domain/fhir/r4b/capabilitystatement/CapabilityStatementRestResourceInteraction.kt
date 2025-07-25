//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What operations are supported?
 *
 * Identifies a restful operation supported by the solution.
 *
 * @param id Unique id for inter-element referencing
 * @param code read | vread | update | patch | delete | history-instance | history-type | create |
 * search-type
 * @param documentation Anything special about operation behavior
 */
@SerialName("CapabilityStatementRestResourceInteraction")
@Serializable
public data class CapabilityStatementRestResourceInteraction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * read | vread | update | patch | delete | history-instance | history-type | create | search-type
   */
  public val code: String? = null,
  /**
   * Anything special about operation behavior
   */
  public val documentation: String? = null,
) : BackboneElement
