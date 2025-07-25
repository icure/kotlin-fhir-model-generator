//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.examplescenario

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Actor participating in the resource
 *
 * Actor participating in the resource.
 *
 * @param id Unique id for inter-element referencing
 * @param actorId ID or acronym of the actor
 * @param type person | entity
 * @param name The name of the actor as shown in the page
 * @param description The description of the actor
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
  public val actorId: String? = null,
  /**
   * person | entity
   */
  public val type: String? = null,
  /**
   * The name of the actor as shown in the page
   */
  public val name: String? = null,
  /**
   * The description of the actor
   */
  public val description: String? = null,
) : BackboneElement
