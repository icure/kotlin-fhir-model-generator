//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Minimal definition information about the medication
 *
 * Along with the link to a Medicinal Product Definition resource, this information provides common
 * definitional elements that are needed to understand the specific medication that is being described.
 *
 * @param id Unique id for inter-element referencing
 * @param doseForm powder | tablets | capsule +
 */
@SerialName("MedicationKnowledgeDefinitional")
@Serializable
public data class MedicationKnowledgeDefinitional(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val definition: List<Reference> = emptyList(),
  /**
   * powder | tablets | capsule +
   */
  public val doseForm: CodeableConcept? = null,
  public val intendedRoute: List<CodeableConcept> = emptyList(),
  public val ingredient: List<MedicationKnowledgeDefinitionalIngredient> = emptyList(),
  public val drugCharacteristic: List<MedicationKnowledgeDefinitionalDrugCharacteristic> =
      emptyList(),
) : BackboneElement
