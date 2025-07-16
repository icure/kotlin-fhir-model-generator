//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.detectedissue

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Supporting evidence
 *
 * Supporting evidence or manifestations that provide the basis for identifying the detected issue
 * such as a GuidanceResponse or MeasureReport.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("DetectedIssueEvidence")
@Serializable
public data class DetectedIssueEvidence(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val code: List<CodeableConcept> = emptyList(),
  public val detail: List<Reference> = emptyList(),
) : BackboneElement
