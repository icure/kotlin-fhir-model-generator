//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.genomicstudy

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Inputs for the analysis event
 *
 * Inputs for the analysis event.
 *
 * @param id Unique id for inter-element referencing
 * @param file File containing input data
 * @param type Type of input data (e.g., BAM, CRAM, or FASTA)
 * @param generatedByIdentifier The analysis event or other GenomicStudy that generated this input
 * file
 * @param generatedByReference The analysis event or other GenomicStudy that generated this input
 * file
 */
@SerialName("GenomicStudyAnalysisInput")
@Serializable
public data class GenomicStudyAnalysisInput(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * File containing input data
   */
  public val `file`: Reference? = null,
  /**
   * Type of input data (e.g., BAM, CRAM, or FASTA)
   */
  public val type: CodeableConcept? = null,
  /**
   * The analysis event or other GenomicStudy that generated this input file
   */
  public val generatedByIdentifier: Identifier? = null,
  /**
   * The analysis event or other GenomicStudy that generated this input file
   */
  public val generatedByReference: Reference? = null,
) : BackboneElement
