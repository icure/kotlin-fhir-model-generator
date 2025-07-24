//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Guidelines for administration of the medication
 *
 * Guidelines for the administration of the medication.
 *
 * @param id Unique id for inter-element referencing
 * @param indicationCodeableConcept Indication for use that apply to the specific administration
 * guidelines
 * @param indicationReference Indication for use that apply to the specific administration
 * guidelines
 */
@SerialName("MedicationKnowledgeAdministrationGuidelines")
@Serializable
public data class MedicationKnowledgeAdministrationGuidelines(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val dosage: List<MedicationKnowledgeAdministrationGuidelinesDosage> = emptyList(),
  /**
   * Indication for use that apply to the specific administration guidelines
   */
  public val indicationCodeableConcept: CodeableConcept? = null,
  /**
   * Indication for use that apply to the specific administration guidelines
   */
  public val indicationReference: Reference? = null,
  public val patientCharacteristics:
      List<MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics> = emptyList(),
) : BackboneElement
