//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.devicedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
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
