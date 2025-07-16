//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.diagnosticreport

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
