//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.chargeitem

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.monetarycomponent.MonetaryComponent
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.timing.Timing
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
 * @param encounter Encounter associated with this ChargeItem
 * @param occurrenceDateTime When the charged service was applied
 * @param occurrencePeriod When the charged service was applied
 * @param occurrenceTiming When the charged service was applied
 * @param performingOrganization Organization providing the charged service
 * @param requestingOrganization Organization requesting the charged service
 * @param costCenter Organization that has ownership of the (potential, future) revenue
 * @param quantity Quantity of which the charge item has been serviced
 * @param unitPriceComponent Unit price overriding the associated rules
 * @param totalPriceComponent Total price overriding the associated rules
 * @param overrideReason Reason for overriding the list price/factor
 * @param enterer Individual who was entering
 * @param enteredDate Date the charge item was entered
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
   * Encounter associated with this ChargeItem
   */
  public val encounter: Reference? = null,
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
   * Unit price overriding the associated rules
   */
  public val unitPriceComponent: MonetaryComponent? = null,
  /**
   * Total price overriding the associated rules
   */
  public val totalPriceComponent: MonetaryComponent? = null,
  /**
   * Reason for overriding the list price/factor
   */
  public val overrideReason: CodeableConcept? = null,
  /**
   * Individual who was entering
   */
  public val enterer: Reference? = null,
  /**
   * Date the charge item was entered
   */
  public val enteredDate: String? = null,
  public val reason: List<CodeableConcept> = emptyList(),
  public val service: List<CodeableReference> = emptyList(),
  public val product: List<CodeableReference> = emptyList(),
  public val account: List<Reference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val supportingInformation: List<Reference> = emptyList(),
) : DomainResource
