//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.healthcareservice

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Not available during this time due to provided reason
 *
 * The HealthcareService is not available during this period of time due to the provided reason.
 *
 * @param id Unique id for inter-element referencing
 * @param description Reason presented to the user explaining why time not available
 * @param during Service not available from this date
 */
@SerialName("HealthcareServiceNotAvailable")
@Serializable
public data class HealthcareServiceNotAvailable(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reason presented to the user explaining why time not available
   */
  public val description: String? = null,
  /**
   * Service not available from this date
   */
  public val during: Period? = null,
) : BackboneElement
