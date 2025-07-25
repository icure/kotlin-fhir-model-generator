//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.activitydefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Dynamic aspects of the definition
 *
 * Dynamic values that will be evaluated to produce values for elements of the resulting resource.
 * For example, if the dosage of a medication must be computed based on the patient's weight, a dynamic
 * value would be used to specify an expression that calculated the weight, and the path on the request
 * resource that would contain the result.
 *
 * @param id Unique id for inter-element referencing
 * @param path The path to the element to be set dynamically
 * @param expression An expression that provides the dynamic value for the customization
 */
@SerialName("ActivityDefinitionDynamicValue")
@Serializable
public data class ActivityDefinitionDynamicValue(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The path to the element to be set dynamically
   */
  public val path: String? = null,
  /**
   * An expression that provides the dynamic value for the customization
   */
  public val expression: Expression,
) : BackboneElement
