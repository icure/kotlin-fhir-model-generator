//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.dosage.Dosage
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
 * @param type Type of dosage
 */
@SerialName("MedicationKnowledgeAdministrationGuidelinesDosage")
@Serializable
public data class MedicationKnowledgeAdministrationGuidelinesDosage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of dosage
   */
  public val type: CodeableConcept,
  public val dosage: List<Dosage> = emptyList(),
) : BackboneElement
