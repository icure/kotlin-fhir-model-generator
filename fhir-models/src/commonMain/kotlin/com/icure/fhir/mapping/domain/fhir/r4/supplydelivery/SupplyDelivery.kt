//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.supplydelivery

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Delivery of bulk Supplies
 *
 * Record of delivery of what is supplied.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status in-progress | completed | abandoned | entered-in-error
 * @param patient Patient for whom the item is supplied
 * @param type Category of dispense event
 * @param suppliedItem The item that is delivered or supplied
 * @param occurrenceDateTime When event occurred
 * @param occurrencePeriod When event occurred
 * @param occurrenceTiming When event occurred
 * @param supplier Dispenser
 * @param destination Where the Supply was sent
 */
@SerialName("SupplyDelivery")
@Serializable
public data class SupplyDelivery(
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
  public val partOf: List<Reference> = emptyList(),
  /**
   * in-progress | completed | abandoned | entered-in-error
   */
  public val status: String? = null,
  /**
   * Patient for whom the item is supplied
   */
  public val patient: Reference? = null,
  /**
   * Category of dispense event
   */
  public val type: CodeableConcept? = null,
  /**
   * The item that is delivered or supplied
   */
  public val suppliedItem: SupplyDeliverySuppliedItem? = null,
  /**
   * When event occurred
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When event occurred
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When event occurred
   */
  public val occurrenceTiming: Timing? = null,
  /**
   * Dispenser
   */
  public val supplier: Reference? = null,
  /**
   * Where the Supply was sent
   */
  public val destination: Reference? = null,
  public val `receiver`: List<Reference> = emptyList(),
) : DomainResource
