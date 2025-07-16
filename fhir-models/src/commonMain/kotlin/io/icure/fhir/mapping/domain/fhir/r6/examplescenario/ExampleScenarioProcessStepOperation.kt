//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.examplescenario

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Step is simple action
 *
 * The step represents a single operation invoked on receiver by sender.
 *
 * @param id Unique id for inter-element referencing
 * @param type Kind of action
 * @param title Label for step
 * @param initiator Who starts the operation
 * @param receiver Who receives the operation
 * @param description Human-friendly description of the operation
 * @param initiatorActive Initiator stays active?
 * @param receiverActive Receiver stays active?
 * @param request Instance transmitted on invocation
 * @param response Instance transmitted on invocation response
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
   * Kind of action
   */
  public val type: Coding? = null,
  /**
   * Label for step
   */
  public val title: String? = null,
  /**
   * Who starts the operation
   */
  public val initiator: String? = null,
  /**
   * Who receives the operation
   */
  public val `receiver`: String? = null,
  /**
   * Human-friendly description of the operation
   */
  public val description: String? = null,
  /**
   * Initiator stays active?
   */
  public val initiatorActive: Boolean? = null,
  /**
   * Receiver stays active?
   */
  public val receiverActive: Boolean? = null,
  /**
   * Instance transmitted on invocation
   */
  public val request: ExampleScenarioInstanceContainedInstance? = null,
  /**
   * Instance transmitted on invocation response
   */
  public val response: ExampleScenarioInstanceContainedInstance? = null,
) : BackboneElement
