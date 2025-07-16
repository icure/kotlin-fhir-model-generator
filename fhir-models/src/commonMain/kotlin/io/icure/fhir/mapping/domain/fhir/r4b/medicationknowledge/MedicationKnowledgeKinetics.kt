//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The time course of drug absorption, distribution, metabolism and excretion of a medication from
 * the body
 *
 * The time course of drug absorption, distribution, metabolism and excretion of a medication from
 * the body.
 *
 * @param id Unique id for inter-element referencing
 * @param halfLifePeriod Time required for concentration in the body to decrease by half
 */
@SerialName("MedicationKnowledgeKinetics")
@Serializable
public data class MedicationKnowledgeKinetics(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val areaUnderCurve: List<Quantity> = emptyList(),
  public val lethalDose50: List<Quantity> = emptyList(),
  /**
   * Time required for concentration in the body to decrease by half
   */
  public val halfLifePeriod: Duration? = null,
) : BackboneElement
