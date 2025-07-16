//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.genomicstudy

import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
