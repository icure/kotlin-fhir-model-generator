//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.activitydefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
