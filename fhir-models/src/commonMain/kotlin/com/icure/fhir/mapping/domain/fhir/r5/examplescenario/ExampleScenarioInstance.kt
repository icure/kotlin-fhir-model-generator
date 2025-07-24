//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.examplescenario

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Data used in the scenario
 *
 * A single data collection that is shared as part of the scenario.
 *
 * @param id Unique id for inter-element referencing
 * @param key ID or acronym of the instance
 * @param structureType Data structure for example
 * @param structureVersion E.g. 4.0.1
 * @param structureProfileCanonical Rules instance adheres to
 * @param structureProfileUri Rules instance adheres to
 * @param title Label for instance
 * @param description Human-friendly description of the instance
 * @param content Example instance data
 */
@SerialName("ExampleScenarioInstance")
@Serializable
public data class ExampleScenarioInstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * ID or acronym of the instance
   */
  public val key: String? = null,
  /**
   * Data structure for example
   */
  public val structureType: Coding,
  /**
   * E.g. 4.0.1
   */
  public val structureVersion: String? = null,
  /**
   * Rules instance adheres to
   */
  public val structureProfileCanonical: String? = null,
  /**
   * Rules instance adheres to
   */
  public val structureProfileUri: String? = null,
  /**
   * Label for instance
   */
  public val title: String? = null,
  /**
   * Human-friendly description of the instance
   */
  public val description: String? = null,
  /**
   * Example instance data
   */
  public val content: Reference? = null,
  public val version: List<ExampleScenarioInstanceVersion> = emptyList(),
  public val containedInstance: List<ExampleScenarioInstanceContainedInstance> = emptyList(),
) : BackboneElement
