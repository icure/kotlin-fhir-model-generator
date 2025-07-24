//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.examplescenario

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Each interaction or action
 *
 * Each interaction or action.
 *
 * @param id Unique id for inter-element referencing
 * @param number The sequential number of the interaction
 * @param type The type of operation - CRUD
 * @param name The human-friendly name of the interaction
 * @param initiator Who starts the transaction
 * @param receiver Who receives the transaction
 * @param description A comment to be inserted in the diagram
 * @param initiatorActive Whether the initiator is deactivated right after the transaction
 * @param receiverActive Whether the receiver is deactivated right after the transaction
 * @param request Each resource instance used by the initiator
 * @param response Each resource instance used by the responder
 */
@SerialName("ExampleScenarioProcessStepOperation")
@Serializable
public data class ExampleScenarioProcessStepOperation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The sequential number of the interaction
   */
  public val number: String? = null,
  /**
   * The type of operation - CRUD
   */
  public val type: String? = null,
  /**
   * The human-friendly name of the interaction
   */
  public val name: String? = null,
  /**
   * Who starts the transaction
   */
  public val initiator: String? = null,
  /**
   * Who receives the transaction
   */
  public val `receiver`: String? = null,
  /**
   * A comment to be inserted in the diagram
   */
  public val description: String? = null,
  /**
   * Whether the initiator is deactivated right after the transaction
   */
  public val initiatorActive: Boolean? = null,
  /**
   * Whether the receiver is deactivated right after the transaction
   */
  public val receiverActive: Boolean? = null,
  /**
   * Each resource instance used by the initiator
   */
  public val request: ExampleScenarioInstanceContainedInstance? = null,
  /**
   * Each resource instance used by the responder
   */
  public val response: ExampleScenarioInstanceContainedInstance? = null,
) : BackboneElement
