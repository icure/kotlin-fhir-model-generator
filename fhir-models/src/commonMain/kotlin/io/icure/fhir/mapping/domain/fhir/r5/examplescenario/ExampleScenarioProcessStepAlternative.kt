//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.examplescenario

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Alternate non-typical step action
 *
 * Indicates an alternative step that can be taken instead of the sub-process, scenario or
 * operation.  E.g. to represent non-happy-path/exceptional/atypical circumstances.
 *
 * @param id Unique id for inter-element referencing
 * @param title Label for alternative
 * @param description Human-readable description of option
 */
@SerialName("ExampleScenarioProcessStepAlternative")
@Serializable
public data class ExampleScenarioProcessStepAlternative(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Label for alternative
   */
  public val title: String? = null,
  /**
   * Human-readable description of option
   */
  public val description: String? = null,
  public val step: List<ExampleScenarioProcessStep> = emptyList(),
) : BackboneElement
