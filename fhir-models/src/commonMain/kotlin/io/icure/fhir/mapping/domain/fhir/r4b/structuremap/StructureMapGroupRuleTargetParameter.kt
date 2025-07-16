//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.structuremap

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Parameters to the transform
 *
 * Parameters to the transform.
 *
 * @param id Unique id for inter-element referencing
 * @param valueId Parameter value - variable or literal
 * @param valueString Parameter value - variable or literal
 * @param valueBoolean Parameter value - variable or literal
 * @param valueInteger Parameter value - variable or literal
 * @param valueDecimal Parameter value - variable or literal
 */
@SerialName("StructureMapGroupRuleTargetParameter")
@Serializable
public data class StructureMapGroupRuleTargetParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Parameter value - variable or literal
   */
  public val valueId: String? = null,
  /**
   * Parameter value - variable or literal
   */
  public val valueString: String? = null,
  /**
   * Parameter value - variable or literal
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Parameter value - variable or literal
   */
  public val valueInteger: Int? = null,
  /**
   * Parameter value - variable or literal
   */
  public val valueDecimal: Float? = null,
) : BackboneElement
