//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.clinicalimpression

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param item What was found
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
  public val item: CodeableReference? = null,
  /**
   * Which investigations support finding
   */
  public val basis: String? = null,
) : BackboneElement
