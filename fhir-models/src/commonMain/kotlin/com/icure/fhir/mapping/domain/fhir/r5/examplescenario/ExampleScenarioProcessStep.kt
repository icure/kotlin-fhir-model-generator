//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.examplescenario

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Event within of the process
 *
 * A significant action that occurs as part of the process.
 *
 * @param id Unique id for inter-element referencing
 * @param number Sequential number of the step
 * @param process Step is nested process
 * @param workflow Step is nested workflow
 * @param operation Step is simple action
 * @param pause Pause in the flow?
 */
@SerialName("ExampleScenarioProcessStep")
@Serializable
public data class ExampleScenarioProcessStep(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Sequential number of the step
   */
  public val number: String? = null,
  /**
   * Step is nested process
   */
  public val process: ExampleScenarioProcess? = null,
  /**
   * Step is nested workflow
   */
  public val workflow: String? = null,
  /**
   * Step is simple action
   */
  public val operation: ExampleScenarioProcessStepOperation? = null,
  public val alternative: List<ExampleScenarioProcessStepAlternative> = emptyList(),
  /**
   * Pause in the flow?
   */
  public val pause: Boolean? = null,
) : BackboneElement
