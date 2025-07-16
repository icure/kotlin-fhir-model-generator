//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationdispense

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who performed event
 *
 * Indicates who or what performed the event.
 *
 * @param id Unique id for inter-element referencing
 * @param function Who performed the dispense and what they did
 * @param actor Individual who was performing
 */
@SerialName("MedicationDispensePerformer")
@Serializable
public data class MedicationDispensePerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Who performed the dispense and what they did
   */
  public val function: CodeableConcept? = null,
  /**
   * Individual who was performing
   */
  public val actor: Reference,
) : BackboneElement
