//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.devicedefinition

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Billing code or reference associated with the device
 *
 * Billing code or reference associated with the device.
 *
 * @param id Unique id for inter-element referencing
 * @param chargeItemCode The code or reference for the charge item
 * @param count Coefficient applicable to the billing code
 * @param effectivePeriod A specific time period in which this charge item applies
 */
@SerialName("DeviceDefinitionChargeItem")
@Serializable
public data class DeviceDefinitionChargeItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The code or reference for the charge item
   */
  public val chargeItemCode: CodeableReference,
  /**
   * Coefficient applicable to the billing code
   */
  public val count: Quantity,
  /**
   * A specific time period in which this charge item applies
   */
  public val effectivePeriod: Period? = null,
  public val useContext: List<UsageContext> = emptyList(),
) : BackboneElement
