//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.examplescenario

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Each major process - a group of operations
 *
 * Each major process - a group of operations.
 *
 * @param id Unique id for inter-element referencing
 * @param title The diagram title of the group of operations
 * @param description A longer description of the group of operations
 * @param preConditions Description of initial status before the process starts
 * @param postConditions Description of final status after the process ends
 */
@SerialName("ExampleScenarioProcess")
@Serializable
public data class ExampleScenarioProcess(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The diagram title of the group of operations
   */
  public val title: String? = null,
  /**
   * A longer description of the group of operations
   */
  public val description: String? = null,
  /**
   * Description of initial status before the process starts
   */
  public val preConditions: String? = null,
  /**
   * Description of final status after the process ends
   */
  public val postConditions: String? = null,
  public val step: List<ExampleScenarioProcessStep> = emptyList(),
) : BackboneElement
