//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.measurereport

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param type individual | subject-list | summary | data-collection
 * @param measure What measure was calculated
 * @param subject What individual(s) the report is for
 * @param date When the report was generated
 * @param reporter Who is reporting the data
 * @param period What period the report covers
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
   * individual | subject-list | summary | data-collection
   */
  public val type: String? = null,
  /**
   * What measure was calculated
   */
  public val measure: String? = null,
  /**
   * What individual(s) the report is for
   */
  public val subject: Reference? = null,
  /**
   * When the report was generated
   */
  public val date: String? = null,
  /**
   * Who is reporting the data
   */
  public val reporter: Reference? = null,
  /**
   * What period the report covers
   */
  public val period: Period,
  /**
   * increase | decrease
   */
  public val improvementNotation: CodeableConcept? = null,
  public val group: List<MeasureReportGroup> = emptyList(),
  public val evaluatedResource: List<Reference> = emptyList(),
) : DomainResource
