//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.genomicstudy

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Outputs for the analysis event
 *
 * Outputs for the analysis event.
 *
 * @param id Unique id for inter-element referencing
 * @param file File containing output data
 * @param type Type of output data (e.g., VCF, MAF, or BAM)
 */
@SerialName("GenomicStudyAnalysisOutput")
@Serializable
public data class GenomicStudyAnalysisOutput(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * File containing output data
   */
  public val `file`: Reference? = null,
  /**
   * Type of output data (e.g., VCF, MAF, or BAM)
   */
  public val type: CodeableConcept? = null,
) : BackboneElement
