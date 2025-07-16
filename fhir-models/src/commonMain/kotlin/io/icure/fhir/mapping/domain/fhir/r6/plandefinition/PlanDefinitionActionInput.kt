//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.plandefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.datarequirement.DataRequirement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Input data requirements
 *
 * Defines input data requirements for the action.
 *
 * @param id Unique id for inter-element referencing
 * @param title User-visible title
 * @param requirement What data is provided
 * @param relatedData What data is provided
 */
@SerialName("PlanDefinitionActionInput")
@Serializable
public data class PlanDefinitionActionInput(
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
   * What data is provided
   */
  public val requirement: DataRequirement? = null,
  /**
   * What data is provided
   */
  public val relatedData: String? = null,
) : BackboneElement
