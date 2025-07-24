//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.plandefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Output data definition
 *
 * Defines the outputs of the action, if any.
 *
 * @param id Unique id for inter-element referencing
 * @param title User-visible title
 * @param requirement What data is provided
 * @param relatedData What data is provided
 */
@SerialName("PlanDefinitionActionOutput")
@Serializable
public data class PlanDefinitionActionOutput(
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
