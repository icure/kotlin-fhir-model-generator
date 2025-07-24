//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationadministration

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
