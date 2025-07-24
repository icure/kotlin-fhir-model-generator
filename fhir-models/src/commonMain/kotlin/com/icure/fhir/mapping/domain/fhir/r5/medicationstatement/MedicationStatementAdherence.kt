//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicationstatement

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Indicates whether the medication is or is not being consumed or administered
 *
 * Indicates whether the medication is or is not being consumed or administered.
 *
 * @param id Unique id for inter-element referencing
 * @param code Type of adherence
 * @param reason Details of the reason for the current use of the medication
 */
@SerialName("MedicationStatementAdherence")
@Serializable
public data class MedicationStatementAdherence(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of adherence
   */
  public val code: CodeableConcept,
  /**
   * Details of the reason for the current use of the medication
   */
  public val reason: CodeableConcept? = null,
) : BackboneElement
