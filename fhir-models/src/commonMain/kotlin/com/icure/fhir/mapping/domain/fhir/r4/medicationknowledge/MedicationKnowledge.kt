//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of Medication Knowledge
 *
 * Information about a medication that is used to support knowledge.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param code Code that identifies this medication
 * @param status active | inactive | entered-in-error
 * @param manufacturer Manufacturer of the item
 * @param doseForm powder | tablets | capsule +
 * @param amount Amount of drug in package
 * @param preparationInstruction The instructions for preparing the medication
 * @param packaging Details about packaged medications
 */
@SerialName("MedicationKnowledge")
@Serializable
public data class MedicationKnowledge(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that identifies this medication
   */
  public val code: CodeableConcept? = null,
  /**
   * active | inactive | entered-in-error
   */
  public val status: String? = null,
  /**
   * Manufacturer of the item
   */
  public val manufacturer: Reference? = null,
  /**
   * powder | tablets | capsule +
   */
  public val doseForm: CodeableConcept? = null,
  /**
   * Amount of drug in package
   */
  public val amount: Quantity? = null,
  public val synonym: List<String> = emptyList(),
  public val relatedMedicationKnowledge: List<MedicationKnowledgeRelatedMedicationKnowledge> =
      emptyList(),
  public val associatedMedication: List<Reference> = emptyList(),
  public val productType: List<CodeableConcept> = emptyList(),
  public val monograph: List<MedicationKnowledgeMonograph> = emptyList(),
  public val ingredient: List<MedicationKnowledgeIngredient> = emptyList(),
  /**
   * The instructions for preparing the medication
   */
  public val preparationInstruction: String? = null,
  public val intendedRoute: List<CodeableConcept> = emptyList(),
  public val cost: List<MedicationKnowledgeCost> = emptyList(),
  public val monitoringProgram: List<MedicationKnowledgeMonitoringProgram> = emptyList(),
  public val administrationGuidelines: List<MedicationKnowledgeAdministrationGuidelines> =
      emptyList(),
  public val medicineClassification: List<MedicationKnowledgeMedicineClassification> = emptyList(),
  /**
   * Details about packaged medications
   */
  public val packaging: MedicationKnowledgePackaging? = null,
  public val drugCharacteristic: List<MedicationKnowledgeDrugCharacteristic> = emptyList(),
  public val contraindication: List<Reference> = emptyList(),
  public val regulatory: List<MedicationKnowledgeRegulatory> = emptyList(),
  public val kinetics: List<MedicationKnowledgeKinetics> = emptyList(),
) : DomainResource
