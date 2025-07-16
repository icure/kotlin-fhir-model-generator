//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.dosage.Dosage
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Dosage for the medication for the specific guidelines
 *
 * Dosage for the medication for the specific guidelines.
 *
 * @param id Unique id for inter-element referencing
 * @param type Category of dosage for a medication
 */
@SerialName("MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage")
@Serializable
public data class MedicationKnowledgeIndicationGuidelineDosingGuidelineDosage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Category of dosage for a medication
   */
  public val type: CodeableConcept,
  public val dosage: List<Dosage> = emptyList(),
) : BackboneElement
