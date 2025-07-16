//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.supplydelivery

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r5.timing.Timing
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
 * @param type Category of supply event
 * @param occurrenceDateTime When event occurred
 * @param occurrencePeriod When event occurred
 * @param occurrenceTiming When event occurred
 * @param supplier The item supplier
 * @param destination Where the delivery was sent
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
   * Category of supply event
   */
  public val type: CodeableConcept? = null,
  public val suppliedItem: List<SupplyDeliverySuppliedItem> = emptyList(),
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
   * The item supplier
   */
  public val supplier: Reference? = null,
  /**
   * Where the delivery was sent
   */
  public val destination: Reference? = null,
  public val `receiver`: List<Reference> = emptyList(),
) : DomainResource
