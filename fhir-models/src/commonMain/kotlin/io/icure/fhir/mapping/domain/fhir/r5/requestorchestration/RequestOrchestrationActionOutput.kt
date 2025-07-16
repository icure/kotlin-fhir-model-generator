//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.requestorchestration

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.datarequirement.DataRequirement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
@SerialName("RequestOrchestrationActionOutput")
@Serializable
public data class RequestOrchestrationActionOutput(
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
