//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.supplyrequest

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Request for a medication, substance or device
 *
 * A record of a request for a medication, substance or device used in the healthcare setting.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | active | suspended +
 * @param category The kind of supply (central, non-stock, etc.)
 * @param priority routine | urgent | asap | stat
 * @param itemCodeableConcept Medication, Substance, or Device requested to be supplied
 * @param itemReference Medication, Substance, or Device requested to be supplied
 * @param quantity The requested amount of the item indicated
 * @param occurrenceDateTime When the request should be fulfilled
 * @param occurrencePeriod When the request should be fulfilled
 * @param occurrenceTiming When the request should be fulfilled
 * @param authoredOn When the request was made
 * @param requester Individual making the request
 * @param deliverFrom The origin of the supply
 * @param deliverTo The destination of the supply
 */
@SerialName("SupplyRequest")
@Serializable
public data class SupplyRequest(
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
   * draft | active | suspended +
   */
  public val status: String? = null,
  /**
   * The kind of supply (central, non-stock, etc.)
   */
  public val category: CodeableConcept? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * Medication, Substance, or Device requested to be supplied
   */
  public val itemCodeableConcept: CodeableConcept? = null,
  /**
   * Medication, Substance, or Device requested to be supplied
   */
  public val itemReference: Reference? = null,
  /**
   * The requested amount of the item indicated
   */
  public val quantity: Quantity,
  public val parameter: List<SupplyRequestParameter> = emptyList(),
  /**
   * When the request should be fulfilled
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When the request should be fulfilled
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When the request should be fulfilled
   */
  public val occurrenceTiming: Timing? = null,
  /**
   * When the request was made
   */
  public val authoredOn: String? = null,
  /**
   * Individual making the request
   */
  public val requester: Reference? = null,
  public val supplier: List<Reference> = emptyList(),
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  /**
   * The origin of the supply
   */
  public val deliverFrom: Reference? = null,
  /**
   * The destination of the supply
   */
  public val deliverTo: Reference? = null,
) : DomainResource
