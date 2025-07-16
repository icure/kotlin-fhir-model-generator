//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.diagnosticreport

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A Diagnostic report - a combination of request information, atomic results, images,
 * interpretation, as well as formatted reports
 *
 * The findings and interpretation of diagnostic tests performed on patients, groups of patients,
 * products, substances, devices, and locations, and/or specimens derived from these. The report
 * includes clinical context such as requesting provider information, and some mix of atomic results,
 * images, textual and coded interpretations, and formatted representation of diagnostic reports. The
 * report also includes non-clinical context such as batch analysis and stability reporting of products
 * and substances.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status registered | partial | preliminary | modified | final | amended | corrected |
 * appended | cancelled | entered-in-error | unknown
 * @param code Name/Code for this diagnostic report
 * @param subject The subject of the report - usually, but not always, the patient
 * @param encounter Health care event when test ordered
 * @param effectiveDateTime Clinically relevant time/time-period for report
 * @param effectivePeriod Clinically relevant time/time-period for report
 * @param issued DateTime this version was made
 * @param composition Reference to a Composition resource for the DiagnosticReport structure
 * @param conclusion Clinical conclusion (interpretation) of test results
 */
@SerialName("DiagnosticReport")
@Serializable
public data class DiagnosticReport(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  /**
   * registered | partial | preliminary | modified | final | amended | corrected | appended |
   * cancelled | entered-in-error | unknown
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Name/Code for this diagnostic report
   */
  public val code: CodeableConcept,
  /**
   * The subject of the report - usually, but not always, the patient
   */
  public val subject: Reference? = null,
  /**
   * Health care event when test ordered
   */
  public val encounter: Reference? = null,
  /**
   * Clinically relevant time/time-period for report
   */
  public val effectiveDateTime: String? = null,
  /**
   * Clinically relevant time/time-period for report
   */
  public val effectivePeriod: Period? = null,
  /**
   * DateTime this version was made
   */
  public val issued: String? = null,
  public val performer: List<Reference> = emptyList(),
  public val resultsInterpreter: List<Reference> = emptyList(),
  public val specimen: List<Reference> = emptyList(),
  public val result: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val study: List<Reference> = emptyList(),
  public val supportingInfo: List<DiagnosticReportSupportingInfo> = emptyList(),
  public val media: List<DiagnosticReportMedia> = emptyList(),
  /**
   * Reference to a Composition resource for the DiagnosticReport structure
   */
  public val composition: Reference? = null,
  /**
   * Clinical conclusion (interpretation) of test results
   */
  public val conclusion: String? = null,
  public val conclusionCode: List<CodeableConcept> = emptyList(),
  public val presentedForm: List<Attachment> = emptyList(),
) : DomainResource
