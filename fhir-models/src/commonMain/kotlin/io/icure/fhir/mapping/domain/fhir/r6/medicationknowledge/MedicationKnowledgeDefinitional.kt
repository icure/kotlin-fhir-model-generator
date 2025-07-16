//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
