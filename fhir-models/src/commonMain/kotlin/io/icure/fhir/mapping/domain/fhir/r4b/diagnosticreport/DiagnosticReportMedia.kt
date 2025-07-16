//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.diagnosticreport

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Key images associated with this report
 *
 * A list of key images associated with this report. The images are generally created during the
 * diagnostic process, and may be directly of the patient, or of treated specimens (i.e. slides of
 * interest).
 *
 * @param id Unique id for inter-element referencing
 * @param comment Comment about the image (e.g. explanation)
 * @param link Reference to the image source
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
   * Comment about the image (e.g. explanation)
   */
  public val comment: String? = null,
  /**
   * Reference to the image source
   */
  public val link: Reference,
) : BackboneElement
