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
 * Each resource and each version that is present in the workflow
 *
 * Each resource and each version that is present in the workflow.
 *
 * @param id Unique id for inter-element referencing
 * @param resourceId The id of the resource for referencing
 * @param resourceType The type of the resource
 * @param name A short name for the resource instance
 * @param description Human-friendly description of the resource instance
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
   * The id of the resource for referencing
   */
  public val resourceId: String? = null,
  /**
   * The type of the resource
   */
  public val resourceType: String? = null,
  /**
   * A short name for the resource instance
   */
  public val name: String? = null,
  /**
   * Human-friendly description of the resource instance
   */
  public val description: String? = null,
  public val version: List<ExampleScenarioInstanceVersion> = emptyList(),
  public val containedInstance: List<ExampleScenarioInstanceContainedInstance> = emptyList(),
) : BackboneElement
