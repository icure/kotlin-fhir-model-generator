//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.examplescenario

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Major process within scenario
 *
 * A group of operations that represents a significant step within a scenario.
 *
 * @param id Unique id for inter-element referencing
 * @param title Label for procss
 * @param description Human-friendly description of the process
 * @param preConditions Status before process starts
 * @param postConditions Status after successful completion
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
   * Label for procss
   */
  public val title: String? = null,
  /**
   * Human-friendly description of the process
   */
  public val description: String? = null,
  /**
   * Status before process starts
   */
  public val preConditions: String? = null,
  /**
   * Status after successful completion
   */
  public val postConditions: String? = null,
  public val step: List<ExampleScenarioProcessStep> = emptyList(),
) : BackboneElement
