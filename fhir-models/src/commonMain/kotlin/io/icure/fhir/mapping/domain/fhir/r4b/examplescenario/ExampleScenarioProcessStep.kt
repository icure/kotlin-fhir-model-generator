//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.examplescenario

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Each step of the process
 *
 * Each step of the process.
 *
 * @param id Unique id for inter-element referencing
 * @param pause If there is a pause in the flow
 * @param operation Each interaction or action
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
  public val process: List<ExampleScenarioProcess> = emptyList(),
  /**
   * If there is a pause in the flow
   */
  public val pause: Boolean? = null,
  /**
   * Each interaction or action
   */
  public val operation: ExampleScenarioProcessStepOperation? = null,
  public val alternative: List<ExampleScenarioProcessStepAlternative> = emptyList(),
) : BackboneElement
