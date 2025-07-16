//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.supplyrequest

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r6.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Request for a medication, substance or device
 *
 * A record of a request to deliver a medication, substance or device used in the healthcare setting
 * to a particular destination for a particular person or organization.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | active | suspended +
 * @param category The kind of supply (central, non-stock, etc.)
 * @param priority routine | urgent | asap | stat
 * @param deliverFor The patient for who the supply request is for
 * @param item Medication, Substance, or Device requested to be supplied
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
  public val basedOn: List<Reference> = emptyList(),
  /**
   * The kind of supply (central, non-stock, etc.)
   */
  public val category: CodeableConcept? = null,
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * The patient for who the supply request is for
   */
  public val deliverFor: Reference? = null,
  /**
   * Medication, Substance, or Device requested to be supplied
   */
  public val item: CodeableReference,
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
  public val reason: List<CodeableReference> = emptyList(),
  /**
   * The origin of the supply
   */
  public val deliverFrom: Reference? = null,
  /**
   * The destination of the supply
   */
  public val deliverTo: Reference? = null,
) : DomainResource
