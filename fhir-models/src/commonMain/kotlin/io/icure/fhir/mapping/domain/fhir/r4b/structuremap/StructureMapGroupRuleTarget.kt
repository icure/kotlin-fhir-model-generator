//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.structuremap

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Content to create because of this mapping rule
 *
 * Content to create because of this mapping rule.
 *
 * @param id Unique id for inter-element referencing
 * @param context Type or variable this rule applies to
 * @param contextType type | variable
 * @param element Field to create in the context
 * @param variable Named context for field, if desired, and a field is specified
 * @param listRuleId Internal rule reference for shared list items
 * @param transform create | copy +
 */
@SerialName("StructureMapGroupRuleTarget")
@Serializable
public data class StructureMapGroupRuleTarget(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type or variable this rule applies to
   */
  public val context: String? = null,
  /**
   * type | variable
   */
  public val contextType: String? = null,
  /**
   * Field to create in the context
   */
  public val element: String? = null,
  /**
   * Named context for field, if desired, and a field is specified
   */
  public val variable: String? = null,
  public val listMode: List<String> = emptyList(),
  /**
   * Internal rule reference for shared list items
   */
  public val listRuleId: String? = null,
  /**
   * create | copy +
   */
  public val transform: String? = null,
  public val parameter: List<StructureMapGroupRuleTargetParameter> = emptyList(),
) : BackboneElement
