//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Tracking of latest field safety corrective action
 *
 * Tracking of latest field safety corrective action.
 *
 * @param id Unique id for inter-element referencing
 * @param recall Whether the corrective action was a recall
 * @param scope model | lot-numbers | serial-numbers
 * @param period Start and end dates of the  corrective action
 */
@SerialName("DeviceDefinitionCorrectiveAction")
@Serializable
public data class DeviceDefinitionCorrectiveAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Whether the corrective action was a recall
   */
  public val recall: Boolean? = null,
  /**
   * model | lot-numbers | serial-numbers
   */
  public val scope: String? = null,
  /**
   * Start and end dates of the  corrective action
   */
  public val period: Period,
) : BackboneElement
