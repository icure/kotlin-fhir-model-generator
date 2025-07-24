//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.measurereport

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Results of a measure evaluation
 *
 * The MeasureReport resource contains the results of the calculation of a measure; and optionally a
 * reference to the resources involved in that calculation.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status complete | pending | error
 * @param type individual | subject-list | summary | data-exchange
 * @param dataUpdateType incremental | snapshot
 * @param measure What measure was calculated
 * @param subject What individual(s) the report is for
 * @param date When the measure was calculated
 * @param reporter Who is reporting the data
 * @param reportingVendor What vendor prepared the data
 * @param location Where the reported data is from
 * @param period What period the report covers
 * @param inputParameters What parameters were provided to the report
 * @param scoring What scoring method (e.g. proportion, ratio, continuous-variable)
 * @param improvementNotation increase | decrease
 */
@SerialName("MeasureReport")
@Serializable
public data class MeasureReport(
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
  /**
   * complete | pending | error
   */
  public val status: String? = null,
  /**
   * individual | subject-list | summary | data-exchange
   */
  public val type: String? = null,
  /**
   * incremental | snapshot
   */
  public val dataUpdateType: String? = null,
  /**
   * What measure was calculated
   */
  public val measure: String? = null,
  /**
   * What individual(s) the report is for
   */
  public val subject: Reference? = null,
  /**
   * When the measure was calculated
   */
  public val date: String? = null,
  /**
   * Who is reporting the data
   */
  public val reporter: Reference? = null,
  /**
   * What vendor prepared the data
   */
  public val reportingVendor: Reference? = null,
  /**
   * Where the reported data is from
   */
  public val location: Reference? = null,
  /**
   * What period the report covers
   */
  public val period: Period,
  /**
   * What parameters were provided to the report
   */
  public val inputParameters: Reference? = null,
  /**
   * What scoring method (e.g. proportion, ratio, continuous-variable)
   */
  public val scoring: CodeableConcept? = null,
  /**
   * increase | decrease
   */
  public val improvementNotation: CodeableConcept? = null,
  public val group: List<MeasureReportGroup> = emptyList(),
  public val supplementalData: List<Reference> = emptyList(),
  public val evaluatedResource: List<Reference> = emptyList(),
) : DomainResource
