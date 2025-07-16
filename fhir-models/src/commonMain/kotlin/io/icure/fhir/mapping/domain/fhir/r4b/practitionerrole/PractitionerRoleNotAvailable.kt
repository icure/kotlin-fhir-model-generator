//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.practitionerrole

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Not available during this time due to provided reason
 *
 * The practitioner is not available or performing this role during this period of time due to the
 * provided reason.
 *
 * @param id Unique id for inter-element referencing
 * @param description Reason presented to the user explaining why time not available
 * @param during Service not available from this date
 */
@SerialName("PractitionerRoleNotAvailable")
@Serializable
public data class PractitionerRoleNotAvailable(
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
