//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.coverage

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * Insurance or medical plan or a payment agreement
 *
 * Financial instrument which may be used to reimburse or pay for health care products and services.
 * Includes both insurance and self-payment.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | cancelled | draft | entered-in-error
 * @param type Coverage category such as medical or accident
 * @param policyHolder Owner of the policy
 * @param subscriber Subscriber to the policy
 * @param subscriberId ID assigned to the subscriber
 * @param beneficiary Plan beneficiary
 * @param dependent Dependent number
 * @param relationship Beneficiary relationship to the subscriber
 * @param period Coverage start and end dates
 * @param order Relative order of the coverage
 * @param network Insurer network
 * @param subrogation Reimbursement to insurer
 */
@SerialName("Coverage")
@Serializable
public data class Coverage(
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
   * active | cancelled | draft | entered-in-error
   */
  public val status: String? = null,
  /**
   * Coverage category such as medical or accident
   */
  public val type: CodeableConcept? = null,
  /**
   * Owner of the policy
   */
  public val policyHolder: Reference? = null,
  /**
   * Subscriber to the policy
   */
  public val subscriber: Reference? = null,
  /**
   * ID assigned to the subscriber
   */
  public val subscriberId: String? = null,
  /**
   * Plan beneficiary
   */
  public val beneficiary: Reference,
  /**
   * Dependent number
   */
  public val dependent: String? = null,
  /**
   * Beneficiary relationship to the subscriber
   */
  public val relationship: CodeableConcept? = null,
  /**
   * Coverage start and end dates
   */
  public val period: Period? = null,
  public val payor: List<Reference> = emptyList(),
  @JsonNames("class")
  public val class_fhir: List<CoverageClass> = emptyList(),
  /**
   * Relative order of the coverage
   */
  public val order: Int? = null,
  /**
   * Insurer network
   */
  public val network: String? = null,
  public val costToBeneficiary: List<CoverageCostToBeneficiary> = emptyList(),
  /**
   * Reimbursement to insurer
   */
  public val subrogation: Boolean? = null,
  public val contract: List<Reference> = emptyList(),
) : DomainResource
