//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.deviceassociation

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The details about the device when it is in use to describe its operation
 *
 * The details about the device when it is in use to describe its operation.
 *
 * @param id Unique id for inter-element referencing
 * @param status Device operational condition
 * @param period Begin and end dates and times for the device's operation
 */
@SerialName("DeviceAssociationOperation")
@Serializable
public data class DeviceAssociationOperation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Device operational condition
   */
  public val status: CodeableConcept,
  public val `operator`: List<Reference> = emptyList(),
  /**
   * Begin and end dates and times for the device's operation
   */
  public val period: Period? = null,
) : BackboneElement
