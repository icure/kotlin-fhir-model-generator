//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.chargeitem

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.money.Money
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Item containing charge code(s) associated with the provision of healthcare provider products
 *
 * The resource ChargeItem describes the provision of healthcare provider products for a certain
 * patient, therefore referring not only to the product, but containing in addition details of the
 * provision, like date, time, amounts and participating organizations and persons. Main Usage of the
 * ChargeItem is to enable the billing process and internal cost allocation.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status planned | billable | not-billable | aborted | billed | entered-in-error | unknown
 * @param code A code that identifies the charge, like a billing code
 * @param subject Individual service was done for/to
 * @param context Encounter / Episode associated with event
 * @param occurrenceDateTime When the charged service was applied
 * @param occurrencePeriod When the charged service was applied
 * @param occurrenceTiming When the charged service was applied
 * @param performingOrganization Organization providing the charged service
 * @param requestingOrganization Organization requesting the charged service
 * @param costCenter Organization that has ownership of the (potential, future) revenue
 * @param quantity Quantity of which the charge item has been serviced
 * @param factorOverride Factor overriding the associated rules
 * @param priceOverride Price overriding the associated rules
 * @param overrideReason Reason for overriding the list price/factor
 * @param enterer Individual who was entering
 * @param enteredDate Date the charge item was entered
 * @param productReference Product charged
 * @param productCodeableConcept Product charged
 */
@SerialName("ChargeItem")
@Serializable
public data class ChargeItem(
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
  public val definitionUri: List<String> = emptyList(),
  public val definitionCanonical: List<String> = emptyList(),
  /**
   * planned | billable | not-billable | aborted | billed | entered-in-error | unknown
   */
  public val status: String? = null,
  public val partOf: List<Reference> = emptyList(),
  /**
   * A code that identifies the charge, like a billing code
   */
  public val code: CodeableConcept,
  /**
   * Individual service was done for/to
   */
  public val subject: Reference,
  /**
   * Encounter / Episode associated with event
   */
  public val context: Reference? = null,
  /**
   * When the charged service was applied
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When the charged service was applied
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When the charged service was applied
   */
  public val occurrenceTiming: Timing? = null,
  public val performer: List<ChargeItemPerformer> = emptyList(),
  /**
   * Organization providing the charged service
   */
  public val performingOrganization: Reference? = null,
  /**
   * Organization requesting the charged service
   */
  public val requestingOrganization: Reference? = null,
  /**
   * Organization that has ownership of the (potential, future) revenue
   */
  public val costCenter: Reference? = null,
  /**
   * Quantity of which the charge item has been serviced
   */
  public val quantity: Quantity? = null,
  public val bodysite: List<CodeableConcept> = emptyList(),
  /**
   * Factor overriding the associated rules
   */
  public val factorOverride: Float? = null,
  /**
   * Price overriding the associated rules
   */
  public val priceOverride: Money? = null,
  /**
   * Reason for overriding the list price/factor
   */
  public val overrideReason: String? = null,
  /**
   * Individual who was entering
   */
  public val enterer: Reference? = null,
  /**
   * Date the charge item was entered
   */
  public val enteredDate: String? = null,
  public val reason: List<CodeableConcept> = emptyList(),
  public val service: List<Reference> = emptyList(),
  /**
   * Product charged
   */
  public val productReference: Reference? = null,
  /**
   * Product charged
   */
  public val productCodeableConcept: CodeableConcept? = null,
  public val account: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val supportingInformation: List<Reference> = emptyList(),
) : DomainResource
