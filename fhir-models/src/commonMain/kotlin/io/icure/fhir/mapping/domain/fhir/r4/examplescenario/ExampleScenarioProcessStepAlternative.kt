//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.examplescenario

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Alternate non-typical step action
 *
 * Indicates an alternative step that can be taken instead of the operations on the base step in
 * exceptional/atypical circumstances.
 *
 * @param id Unique id for inter-element referencing
 * @param title Label for alternative
 * @param description A human-readable description of each option
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
   * A human-readable description of each option
   */
  public val description: String? = null,
  public val step: List<ExampleScenarioProcessStep> = emptyList(),
) : BackboneElement
