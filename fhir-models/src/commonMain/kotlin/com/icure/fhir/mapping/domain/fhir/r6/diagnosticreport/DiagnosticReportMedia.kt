//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.diagnosticreport

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Key images or data associated with this report
 *
 * A list of key images or data associated with this report. The images or data are generally
 * created during the diagnostic process, and may be directly of the patient, or of treated specimens
 * (i.e. slides of interest).
 *
 * @param id Unique id for inter-element referencing
 * @param comment Comment about the image or data (e.g. explanation)
 * @param link Reference to the image or data source
 */
@SerialName("DiagnosticReportMedia")
@Serializable
public data class DiagnosticReportMedia(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Comment about the image or data (e.g. explanation)
   */
  public val comment: String? = null,
  /**
   * Reference to the image or data source
   */
  public val link: Reference,
) : BackboneElement
