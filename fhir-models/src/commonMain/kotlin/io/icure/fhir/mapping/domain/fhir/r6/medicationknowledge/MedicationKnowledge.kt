//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param status active | entered-in-error | inactive
 * @param author Creator or owner of the knowledge or information about the medication
 * @param preparationInstruction The instructions for preparing the medication
 * @param definitional Minimal definition information about the medication
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Code that identifies this medication
   */
  public val code: CodeableConcept? = null,
  /**
   * active | entered-in-error | inactive
   */
  public val status: String? = null,
  /**
   * Creator or owner of the knowledge or information about the medication
   */
  public val author: Reference? = null,
  public val intendedJurisdiction: List<CodeableConcept> = emptyList(),
  public val name: List<String> = emptyList(),
  public val relatedMedicationKnowledge: List<MedicationKnowledgeRelatedMedicationKnowledge> =
      emptyList(),
  public val associatedMedication: List<Reference> = emptyList(),
  public val productType: List<CodeableConcept> = emptyList(),
  public val monograph: List<MedicationKnowledgeMonograph> = emptyList(),
  /**
   * The instructions for preparing the medication
   */
  public val preparationInstruction: String? = null,
  public val cost: List<MedicationKnowledgeCost> = emptyList(),
  public val monitoringProgram: List<MedicationKnowledgeMonitoringProgram> = emptyList(),
  public val indicationGuideline: List<MedicationKnowledgeIndicationGuideline> = emptyList(),
  public val medicineClassification: List<MedicationKnowledgeMedicineClassification> = emptyList(),
  public val packaging: List<MedicationKnowledgePackaging> = emptyList(),
  public val clinicalUseIssue: List<Reference> = emptyList(),
  public val storageGuideline: List<MedicationKnowledgeStorageGuideline> = emptyList(),
  public val regulatory: List<MedicationKnowledgeRegulatory> = emptyList(),
  /**
   * Minimal definition information about the medication
   */
  public val definitional: MedicationKnowledgeDefinitional? = null,
) : DomainResource
