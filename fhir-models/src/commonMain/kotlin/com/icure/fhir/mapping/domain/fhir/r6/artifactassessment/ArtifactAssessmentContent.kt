//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.artifactassessment

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Comment, classifier, or rating content
 *
 * A component comment, classifier, or rating of the artifact.
 *
 * @param id Unique id for inter-element referencing
 * @param informationType comment | classifier | rating | container | response | change-request
 * @param summary Brief summary of the content
 * @param type What type of content
 * @param quantity Quantitative rating
 * @param author Who authored the content
 * @param freeToShare Acceptable to publicly share the resource content
 */
@SerialName("ArtifactAssessmentContent")
@Serializable
public data class ArtifactAssessmentContent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * comment | classifier | rating | container | response | change-request
   */
  public val informationType: String? = null,
  /**
   * Brief summary of the content
   */
  public val summary: String? = null,
  /**
   * What type of content
   */
  public val type: CodeableConcept? = null,
  public val classifier: List<CodeableConcept> = emptyList(),
  /**
   * Quantitative rating
   */
  public val quantity: Quantity? = null,
  /**
   * Who authored the content
   */
  public val author: Reference? = null,
  public val path: List<String> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * Acceptable to publicly share the resource content
   */
  public val freeToShare: Boolean? = null,
  public val component: List<ArtifactAssessmentContent> = emptyList(),
) : BackboneElement
