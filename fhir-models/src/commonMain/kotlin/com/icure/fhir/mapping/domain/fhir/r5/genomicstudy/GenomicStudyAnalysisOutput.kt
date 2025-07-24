//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.genomicstudy

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
