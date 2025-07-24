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
 * Associated documentation about the medication
 *
 * Associated documentation about the medication.
 *
 * @param id Unique id for inter-element referencing
 * @param type The category of medication document
 * @param source Associated documentation about the medication
 */
@SerialName("MedicationKnowledgeMonograph")
@Serializable
public data class MedicationKnowledgeMonograph(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The category of medication document
   */
  public val type: CodeableConcept? = null,
  /**
   * Associated documentation about the medication
   */
  public val source: Reference? = null,
) : BackboneElement
