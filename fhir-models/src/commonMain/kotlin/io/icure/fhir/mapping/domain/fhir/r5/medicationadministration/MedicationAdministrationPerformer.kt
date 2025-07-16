//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.medicationadministration

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who or what performed the medication administration and what type of performance they did
 *
 * The performer of the medication treatment.  For devices this is the device that performed the
 * administration of the medication.  An IV Pump would be an example of a device that is performing the
 * administration. Both the IV Pump and the practitioner that set the rate or bolus on the pump can be
 * listed as performers.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of performance
 * @param actor Who or what performed the medication administration
 */
@SerialName("MedicationAdministrationPerformer")
@Serializable
public data class MedicationAdministrationPerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of performance
   */
  public val function: CodeableConcept? = null,
  /**
   * Who or what performed the medication administration
   */
  public val actor: CodeableReference,
) : BackboneElement
