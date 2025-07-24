//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.diagnosticreport

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional information supporting the diagnostic report
 *
 * This backbone element contains supporting information that was used in the creation of the report
 * not included in the results already included in the report.
 *
 * @param id Unique id for inter-element referencing
 * @param type Supporting information role code
 * @param reference Supporting information reference
 */
@SerialName("DiagnosticReportSupportingInfo")
@Serializable
public data class DiagnosticReportSupportingInfo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Supporting information role code
   */
  public val type: CodeableConcept,
  /**
   * Supporting information reference
   */
  public val reference: Reference,
) : BackboneElement
