//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.genomicstudy

import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Genomic Analysis Event
 *
 * The details about a specific analysis that was performed in this GenomicStudy.
 *
 * @param id Unique id for inter-element referencing
 * @param genomeBuild Genome build that is used in this analysis
 * @param instantiatesCanonical The defined protocol that describes the analysis
 * @param instantiatesUri The URL pointing to an externally maintained protocol that describes the
 * analysis
 * @param title Name of the analysis event (human friendly)
 * @param date The date of the analysis event
 * @param protocolPerformed The protocol that was performed for the analysis event
 */
@SerialName("GenomicStudyAnalysis")
@Serializable
public data class GenomicStudyAnalysis(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  public val methodType: List<CodeableConcept> = emptyList(),
  public val changeType: List<CodeableConcept> = emptyList(),
  /**
   * Genome build that is used in this analysis
   */
  public val genomeBuild: CodeableConcept? = null,
  /**
   * The defined protocol that describes the analysis
   */
  public val instantiatesCanonical: String? = null,
  /**
   * The URL pointing to an externally maintained protocol that describes the analysis
   */
  public val instantiatesUri: String? = null,
  /**
   * Name of the analysis event (human friendly)
   */
  public val title: String? = null,
  public val focus: List<Reference> = emptyList(),
  public val specimen: List<Reference> = emptyList(),
  /**
   * The date of the analysis event
   */
  public val date: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * The protocol that was performed for the analysis event
   */
  public val protocolPerformed: Reference? = null,
  public val regionsStudied: List<Reference> = emptyList(),
  public val regionsCalled: List<Reference> = emptyList(),
  public val input: List<GenomicStudyAnalysisInput> = emptyList(),
  public val output: List<GenomicStudyAnalysisOutput> = emptyList(),
  public val performer: List<GenomicStudyAnalysisPerformer> = emptyList(),
  public val device: List<GenomicStudyAnalysisDevice> = emptyList(),
) : BackboneElement
