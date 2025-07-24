//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductauthorization

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The regulatory authorization of a medicinal product
 *
 * The regulatory authorization of a medicinal product.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param subject The medicinal product that is being authorized
 * @param status The status of the marketing authorization
 * @param statusDate The date at which the given status has become applicable
 * @param restoreDate The date when a suspended the marketing or the marketing authorization of the
 * product is anticipated to be restored
 * @param validityPeriod The beginning of the time period in which the marketing authorization is in
 * the specific status shall be specified A complete date consisting of day, month and year shall be
 * specified using the ISO 8601 date format
 * @param dataExclusivityPeriod A period of time after authorization before generic product
 * applicatiosn can be submitted
 * @param dateOfFirstAuthorization The date when the first authorization was granted by a Medicines
 * Regulatory Agency
 * @param internationalBirthDate Date of first marketing authorization for a company's new medicinal
 * product in any country in the World
 * @param legalBasis The legal framework against which this authorization is granted
 * @param holder Marketing Authorization Holder
 * @param regulator Medicines Regulatory Agency
 * @param procedure The regulatory procedure for granting or amending a marketing authorization
 */
@SerialName("MedicinalProductAuthorization")
@Serializable
public data class MedicinalProductAuthorization(
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
   * The medicinal product that is being authorized
   */
  public val subject: Reference? = null,
  public val country: List<CodeableConcept> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * The status of the marketing authorization
   */
  public val status: CodeableConcept? = null,
  /**
   * The date at which the given status has become applicable
   */
  public val statusDate: String? = null,
  /**
   * The date when a suspended the marketing or the marketing authorization of the product is
   * anticipated to be restored
   */
  public val restoreDate: String? = null,
  /**
   * The beginning of the time period in which the marketing authorization is in the specific status
   * shall be specified A complete date consisting of day, month and year shall be specified using the
   * ISO 8601 date format
   */
  public val validityPeriod: Period? = null,
  /**
   * A period of time after authorization before generic product applicatiosn can be submitted
   */
  public val dataExclusivityPeriod: Period? = null,
  /**
   * The date when the first authorization was granted by a Medicines Regulatory Agency
   */
  public val dateOfFirstAuthorization: String? = null,
  /**
   * Date of first marketing authorization for a company's new medicinal product in any country in
   * the World
   */
  public val internationalBirthDate: String? = null,
  /**
   * The legal framework against which this authorization is granted
   */
  public val legalBasis: CodeableConcept? = null,
  public val jurisdictionalAuthorization:
      List<MedicinalProductAuthorizationJurisdictionalAuthorization> = emptyList(),
  /**
   * Marketing Authorization Holder
   */
  public val holder: Reference? = null,
  /**
   * Medicines Regulatory Agency
   */
  public val regulator: Reference? = null,
  /**
   * The regulatory procedure for granting or amending a marketing authorization
   */
  public val procedure: MedicinalProductAuthorizationProcedure? = null,
) : DomainResource
