//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.structuremap

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
 * @param valueDate Parameter value - variable or literal
 * @param valueTime Parameter value - variable or literal
 * @param valueDateTime Parameter value - variable or literal
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
  /**
   * Parameter value - variable or literal
   */
  public val valueDate: String? = null,
  /**
   * Parameter value - variable or literal
   */
  public val valueTime: String? = null,
  /**
   * Parameter value - variable or literal
   */
  public val valueDateTime: String? = null,
) : BackboneElement
