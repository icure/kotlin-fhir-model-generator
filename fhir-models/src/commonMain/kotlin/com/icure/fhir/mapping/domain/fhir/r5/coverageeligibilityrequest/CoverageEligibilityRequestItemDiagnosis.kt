//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.coverageeligibilityrequest

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Applicable diagnosis
 *
 * Patient diagnosis for which care is sought.
 *
 * @param id Unique id for inter-element referencing
 * @param diagnosisCodeableConcept Nature of illness or problem
 * @param diagnosisReference Nature of illness or problem
 */
@SerialName("CoverageEligibilityRequestItemDiagnosis")
@Serializable
public data class CoverageEligibilityRequestItemDiagnosis(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Nature of illness or problem
   */
  public val diagnosisCodeableConcept: CodeableConcept? = null,
  /**
   * Nature of illness or problem
   */
  public val diagnosisReference: Reference? = null,
) : BackboneElement
