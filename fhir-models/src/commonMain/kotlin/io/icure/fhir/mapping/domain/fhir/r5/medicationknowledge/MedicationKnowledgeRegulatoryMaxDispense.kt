//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The maximum number of units of the medication that can be dispensed in a period
 *
 * The maximum number of units of the medication that can be dispensed in a period.
 *
 * @param id Unique id for inter-element referencing
 * @param quantity The maximum number of units of the medication that can be dispensed
 * @param period The period that applies to the maximum number of units
 */
@SerialName("MedicationKnowledgeRegulatoryMaxDispense")
@Serializable
public data class MedicationKnowledgeRegulatoryMaxDispense(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The maximum number of units of the medication that can be dispensed
   */
  public val quantity: Quantity,
  /**
   * The period that applies to the maximum number of units
   */
  public val period: Duration? = null,
) : BackboneElement
