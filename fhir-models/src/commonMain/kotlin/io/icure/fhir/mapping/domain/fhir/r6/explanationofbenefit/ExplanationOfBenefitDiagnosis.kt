//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Pertinent diagnosis information
 *
 * Information about diagnoses relevant to the claim items.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Diagnosis instance identifier
 * @param diagnosisCodeableConcept Nature of illness or problem
 * @param diagnosisReference Nature of illness or problem
 * @param onAdmission Present on admission
 */
@SerialName("ExplanationOfBenefitDiagnosis")
@Serializable
public data class ExplanationOfBenefitDiagnosis(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Diagnosis instance identifier
   */
  public val sequence: Int? = null,
  /**
   * Nature of illness or problem
   */
  public val diagnosisCodeableConcept: CodeableConcept? = null,
  /**
   * Nature of illness or problem
   */
  public val diagnosisReference: Reference? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Present on admission
   */
  public val onAdmission: CodeableConcept? = null,
) : BackboneElement
