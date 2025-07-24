//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.structuremap

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Source inputs to the mapping
 *
 * Source inputs to the mapping.
 *
 * @param id Unique id for inter-element referencing
 * @param context Type or variable this rule applies to
 * @param min Specified minimum cardinality
 * @param max Specified maximum cardinality (number or *)
 * @param type Rule only applies if source has this type
 * @param defaultValue Default value if no value exists
 * @param element Optional field for this source
 * @param listMode first | not_first | last | not_last | only_one
 * @param variable Named context for field, if a field is specified
 * @param condition FHIRPath expression  - must be true or the rule does not apply
 * @param check FHIRPath expression  - must be true or the mapping engine throws an error instead of
 * completing
 * @param logMessage Message to put in log if source exists (FHIRPath)
 */
@SerialName("StructureMapGroupRuleSource")
@Serializable
public data class StructureMapGroupRuleSource(
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
   * Specified minimum cardinality
   */
  public val min: Int? = null,
  /**
   * Specified maximum cardinality (number or *)
   */
  public val max: String? = null,
  /**
   * Rule only applies if source has this type
   */
  public val type: String? = null,
  /**
   * Default value if no value exists
   */
  public val defaultValue: String? = null,
  /**
   * Optional field for this source
   */
  public val element: String? = null,
  /**
   * first | not_first | last | not_last | only_one
   */
  public val listMode: String? = null,
  /**
   * Named context for field, if a field is specified
   */
  public val variable: String? = null,
  /**
   * FHIRPath expression  - must be true or the rule does not apply
   */
  public val condition: String? = null,
  /**
   * FHIRPath expression  - must be true or the mapping engine throws an error instead of completing
   */
  public val check: String? = null,
  /**
   * Message to put in log if source exists (FHIRPath)
   */
  public val logMessage: String? = null,
) : BackboneElement
