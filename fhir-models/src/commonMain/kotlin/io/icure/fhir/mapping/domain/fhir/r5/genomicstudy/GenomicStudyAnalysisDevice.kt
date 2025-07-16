//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.genomicstudy

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Devices used for the analysis (e.g., instruments, software), with settings and parameters
 *
 * Devices used for the analysis (e.g., instruments, software), with settings and parameters.
 *
 * @param id Unique id for inter-element referencing
 * @param device Device used for the analysis
 * @param function Specific function for the device used for the analysis
 */
@SerialName("GenomicStudyAnalysisDevice")
@Serializable
public data class GenomicStudyAnalysisDevice(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Device used for the analysis
   */
  public val device: Reference? = null,
  /**
   * Specific function for the device used for the analysis
   */
  public val function: CodeableConcept? = null,
) : BackboneElement
