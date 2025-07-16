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
 * One or more sets of investigations (signs, symptoms, etc.)
 *
 * One or more sets of investigations (signs, symptoms, etc.). The actual grouping of investigations
 * varies greatly depending on the type and context of the assessment. These investigations may include
 * data generated during the assessment process, or data previously generated and recorded that is
 * pertinent to the outcomes.
 *
 * @param id Unique id for inter-element referencing
 * @param code A name/code for the set
 */
@SerialName("ClinicalImpressionInvestigation")
@Serializable
public data class ClinicalImpressionInvestigation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A name/code for the set
   */
  public val code: CodeableConcept,
  public val item: List<Reference> = emptyList(),
) : BackboneElement
