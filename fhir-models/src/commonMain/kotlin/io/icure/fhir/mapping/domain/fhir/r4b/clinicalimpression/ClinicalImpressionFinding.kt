//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.clinicalimpression

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Possible or likely findings and diagnoses
 *
 * Specific findings or diagnoses that were considered likely or relevant to ongoing treatment.
 *
 * @param id Unique id for inter-element referencing
 * @param itemCodeableConcept What was found
 * @param itemReference What was found
 * @param basis Which investigations support finding
 */
@SerialName("ClinicalImpressionFinding")
@Serializable
public data class ClinicalImpressionFinding(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What was found
   */
  public val itemCodeableConcept: CodeableConcept? = null,
  /**
   * What was found
   */
  public val itemReference: Reference? = null,
  /**
   * Which investigations support finding
   */
  public val basis: String? = null,
) : BackboneElement
