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
 * Identifies a restful operation supported by the solution.
 *
 * @param id Unique id for inter-element referencing
 * @param code read | vread | update | update-conditional | patch | patch-conditional | delete |
 * delete-conditional-single | delete-conditional-multiple | delete-history | delete-history-version |
 * history-instance | history-type | create | create-conditional | search-type
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
   * read | vread | update | update-conditional | patch | patch-conditional | delete |
   * delete-conditional-single | delete-conditional-multiple | delete-history | delete-history-version
   * | history-instance | history-type | create | create-conditional | search-type
   */
  public val code: String? = null,
  /**
   * Anything special about operation behavior
   */
  public val documentation: String? = null,
) : BackboneElement
