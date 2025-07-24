//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.account

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Tracks balance, charges, for patient or cost center
 *
 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field,
 * used to track charges for a patient, cost centers, etc.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | inactive | entered-in-error | on-hold | unknown
 * @param billingStatus Tracks the lifecycle of the account through the billing process
 * @param type E.g. patient, expense, depreciation
 * @param name Human-readable label
 * @param servicePeriod Transaction window
 * @param owner Entity managing the Account
 * @param description Explanation of purpose/use
 * @param currency The base or default currency
 * @param calculatedAt Time the balance amount was calculated
 */
@SerialName("Account")
@Serializable
public data class Account(
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
   * active | inactive | entered-in-error | on-hold | unknown
   */
  public val status: String? = null,
  /**
   * Tracks the lifecycle of the account through the billing process
   */
  public val billingStatus: CodeableConcept? = null,
  /**
   * E.g. patient, expense, depreciation
   */
  public val type: CodeableConcept? = null,
  /**
   * Human-readable label
   */
  public val name: String? = null,
  public val subject: List<Reference> = emptyList(),
  /**
   * Transaction window
   */
  public val servicePeriod: Period? = null,
  public val coverage: List<AccountCoverage> = emptyList(),
  /**
   * Entity managing the Account
   */
  public val owner: Reference? = null,
  /**
   * Explanation of purpose/use
   */
  public val description: String? = null,
  public val guarantor: List<AccountGuarantor> = emptyList(),
  public val diagnosis: List<AccountDiagnosis> = emptyList(),
  public val procedure: List<AccountProcedure> = emptyList(),
  public val relatedAccount: List<AccountRelatedAccount> = emptyList(),
  /**
   * The base or default currency
   */
  public val currency: CodeableConcept? = null,
  public val balance: List<AccountBalance> = emptyList(),
  /**
   * Time the balance amount was calculated
   */
  public val calculatedAt: String? = null,
) : DomainResource
