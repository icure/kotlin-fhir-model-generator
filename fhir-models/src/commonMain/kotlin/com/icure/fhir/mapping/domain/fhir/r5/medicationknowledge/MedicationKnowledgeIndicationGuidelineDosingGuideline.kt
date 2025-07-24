//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Guidelines for dosage of the medication
 *
 * The guidelines for the dosage of the medication for the indication.
 *
 * @param id Unique id for inter-element referencing
 * @param treatmentIntent Intention of the treatment
 * @param administrationTreatment Type of treatment the guideline applies to
 */
@SerialName("MedicationKnowledgeIndicationGuidelineDosingGuideline")
@Serializable
public data class MedicationKnowledgeIndicationGuidelineDosingGuideline(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Intention of the treatment
   */
  public val treatmentIntent: CodeableConcept? = null,
  public val dosage: List<MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage> =
      emptyList(),
  /**
   * Type of treatment the guideline applies to
   */
  public val administrationTreatment: CodeableConcept? = null,
  public val patientCharacteristic:
      List<MedicationKnowledgeIndicationGuidelineDosingGuidelinePatientCharacteristic> =
      emptyList(),
) : BackboneElement
