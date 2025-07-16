//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.plandefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Actors within the plan
 *
 * Actors represent the individuals or groups involved in the execution of the defined set of
 * activities.
 *
 * @param id Unique id for inter-element referencing
 * @param title User-visible title
 * @param description Describes the actor
 */
@SerialName("PlanDefinitionActor")
@Serializable
public data class PlanDefinitionActor(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * User-visible title
   */
  public val title: String? = null,
  /**
   * Describes the actor
   */
  public val description: String? = null,
  public val option: List<PlanDefinitionActorOption> = emptyList(),
) : BackboneElement
