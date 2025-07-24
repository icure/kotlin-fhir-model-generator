//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.genomicstudy

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Genomic Study
 *
 * A GenomicStudy is a set of analyses performed to analyze and generate genomic data.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status registered | available | cancelled | entered-in-error | unknown
 * @param subject The primary subject of the genomic study
 * @param encounter The healthcare event with which this genomics study is associated
 * @param startDate When the genomic study was started
 * @param referrer Healthcare professional who requested or referred the genomic study
 * @param instantiatesCanonical The defined protocol that describes the study
 * @param instantiatesUri The URL pointing to an externally maintained protocol that describes the
 * study
 * @param description Description of the genomic study
 */
@SerialName("GenomicStudy")
@Serializable
public data class GenomicStudy(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * registered | available | cancelled | entered-in-error | unknown
   */
  public val status: String? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * The primary subject of the genomic study
   */
  public val subject: Reference,
  /**
   * The healthcare event with which this genomics study is associated
   */
  public val encounter: Reference? = null,
  /**
   * When the genomic study was started
   */
  public val startDate: String? = null,
  public val basedOn: List<Reference> = emptyList(),
  /**
   * Healthcare professional who requested or referred the genomic study
   */
  public val referrer: Reference? = null,
  public val interpreter: List<Reference> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  /**
   * The defined protocol that describes the study
   */
  public val instantiatesCanonical: String? = null,
  /**
   * The URL pointing to an externally maintained protocol that describes the study
   */
  public val instantiatesUri: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * Description of the genomic study
   */
  public val description: String? = null,
  public val analysis: List<GenomicStudyAnalysis> = emptyList(),
) : DomainResource
