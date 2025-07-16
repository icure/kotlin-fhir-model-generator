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
 * Individual involved in exchange
 *
 * A system or person who shares or receives an instance within the scenario.
 *
 * @param id Unique id for inter-element referencing
 * @param key ID or acronym of the actor
 * @param type person | system
 * @param title Label for actor when rendering
 * @param description Details about actor
 */
@SerialName("ExampleScenarioActor")
@Serializable
public data class ExampleScenarioActor(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * ID or acronym of the actor
   */
  public val key: String? = null,
  /**
   * person | system
   */
  public val type: String? = null,
  /**
   * Label for actor when rendering
   */
  public val title: String? = null,
  /**
   * Details about actor
   */
  public val description: String? = null,
) : BackboneElement
