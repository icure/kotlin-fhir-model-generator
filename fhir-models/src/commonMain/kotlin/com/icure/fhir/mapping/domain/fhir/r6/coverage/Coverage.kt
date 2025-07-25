//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.coverage

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

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
 * @param kind insurance | self-pay | other
 * @param type Coverage category such as medical or accident
 * @param policyHolder Owner of the policy
 * @param subscriber Subscriber to the policy
 * @param beneficiary Plan beneficiary
 * @param dependent Dependent number
 * @param relationship Beneficiary relationship to the subscriber
 * @param period Coverage start and end dates
 * @param insurer Issuer of the policy
 * @param order Relative order of the coverage
 * @param network Insurer network
 * @param subrogation Reimbursement to insurer
 * @param insurancePlan Insurance plan details
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
   * insurance | self-pay | other
   */
  public val kind: String? = null,
  public val paymentBy: List<CoveragePaymentBy> = emptyList(),
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
  public val subscriberId: List<Identifier> = emptyList(),
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
  /**
   * Issuer of the policy
   */
  public val insurer: Reference? = null,
  @SerialName("class")
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
  /**
   * Insurance plan details
   */
  public val insurancePlan: Reference? = null,
) : DomainResource
