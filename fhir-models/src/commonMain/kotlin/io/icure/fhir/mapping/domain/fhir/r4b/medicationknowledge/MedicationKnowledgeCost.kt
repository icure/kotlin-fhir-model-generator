//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.money.Money
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The pricing of the medication
 *
 * The price of the medication.
 *
 * @param id Unique id for inter-element referencing
 * @param type The category of the cost information
 * @param source The source or owner for the price information
 * @param cost The price of the medication
 */
@SerialName("MedicationKnowledgeCost")
@Serializable
public data class MedicationKnowledgeCost(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The category of the cost information
   */
  public val type: CodeableConcept,
  /**
   * The source or owner for the price information
   */
  public val source: String? = null,
  /**
   * The price of the medication
   */
  public val cost: Money,
) : BackboneElement
