//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.account

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
 * @param type E.g. patient, expense, depreciation
 * @param name Human-readable label
 * @param servicePeriod Transaction window
 * @param owner Entity managing the Account
 * @param description Explanation of purpose/use
 * @param partOf Reference to a parent Account
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
  /**
   * Reference to a parent Account
   */
  public val partOf: Reference? = null,
) : DomainResource
