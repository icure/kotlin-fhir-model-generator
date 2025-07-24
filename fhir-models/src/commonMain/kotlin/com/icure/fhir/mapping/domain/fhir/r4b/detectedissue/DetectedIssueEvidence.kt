//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.detectedissue

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
