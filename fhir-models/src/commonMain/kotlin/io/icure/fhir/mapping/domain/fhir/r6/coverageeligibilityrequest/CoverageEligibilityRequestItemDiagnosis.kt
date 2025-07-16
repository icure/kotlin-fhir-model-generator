//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.coverageeligibilityrequest

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
