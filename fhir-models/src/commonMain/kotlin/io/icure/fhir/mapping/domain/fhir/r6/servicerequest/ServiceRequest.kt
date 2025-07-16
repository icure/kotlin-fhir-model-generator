//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.servicerequest

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
import io.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r6.timing.Timing
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A request for a service to be performed
 *
 * A record of a request for service such as diagnostic investigations, treatments, or operations to
 * be performed.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param requisition Composite Request ID
 * @param status draft | active | on-hold | revoked | completed | entered-in-error | unknown
 * @param intent proposal | plan | directive | order +
 * @param priority routine | urgent | asap | stat
 * @param doNotPerform True if service/procedure should not be performed
 * @param code What is being requested/ordered
 * @param quantityQuantity Service amount
 * @param quantityRatio Service amount
 * @param quantityRange Service amount
 * @param subject Individual or Entity the service is ordered for
 * @param encounter Encounter in which the request was created
 * @param occurrenceDateTime When service should occur
 * @param occurrencePeriod When service should occur
 * @param occurrenceTiming When service should occur
 * @param asNeededBoolean Preconditions for service
 * @param asNeededCodeableConcept Preconditions for service
 * @param authoredOn Date request signed
 * @param requester Who/what is requesting service
 * @param performerType Performer role
 * @param bodyStructure BodyStructure-based location on the body
 */
@SerialName("ServiceRequest")
@Serializable
public data class ServiceRequest(
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
  public val instantiatesCanonical: List<String> = emptyList(),
  public val instantiatesUri: List<String> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  public val replaces: List<Reference> = emptyList(),
  /**
   * Composite Request ID
   */
  public val requisition: Identifier? = null,
  /**
   * draft | active | on-hold | revoked | completed | entered-in-error | unknown
   */
  public val status: String? = null,
  /**
   * proposal | plan | directive | order +
   */
  public val intent: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * routine | urgent | asap | stat
   */
  public val priority: String? = null,
  /**
   * True if service/procedure should not be performed
   */
  public val doNotPerform: Boolean? = null,
  /**
   * What is being requested/ordered
   */
  public val code: CodeableReference? = null,
  public val orderDetail: List<ServiceRequestOrderDetail> = emptyList(),
  /**
   * Service amount
   */
  public val quantityQuantity: Quantity? = null,
  /**
   * Service amount
   */
  public val quantityRatio: Ratio? = null,
  /**
   * Service amount
   */
  public val quantityRange: Range? = null,
  /**
   * Individual or Entity the service is ordered for
   */
  public val subject: Reference,
  public val focus: List<Reference> = emptyList(),
  /**
   * Encounter in which the request was created
   */
  public val encounter: Reference? = null,
  /**
   * When service should occur
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When service should occur
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When service should occur
   */
  public val occurrenceTiming: Timing? = null,
  /**
   * Preconditions for service
   */
  public val asNeededBoolean: Boolean? = null,
  /**
   * Preconditions for service
   */
  public val asNeededCodeableConcept: CodeableConcept? = null,
  /**
   * Date request signed
   */
  public val authoredOn: String? = null,
  /**
   * Who/what is requesting service
   */
  public val requester: Reference? = null,
  /**
   * Performer role
   */
  public val performerType: CodeableConcept? = null,
  public val performer: List<Reference> = emptyList(),
  public val location: List<CodeableReference> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  public val insurance: List<Reference> = emptyList(),
  public val supportingInfo: List<CodeableReference> = emptyList(),
  public val specimen: List<Reference> = emptyList(),
  public val bodySite: List<CodeableConcept> = emptyList(),
  /**
   * BodyStructure-based location on the body
   */
  public val bodyStructure: Reference? = null,
  public val note: List<Annotation> = emptyList(),
  public val patientInstruction: List<ServiceRequestPatientInstruction> = emptyList(),
  public val relevantHistory: List<Reference> = emptyList(),
) : DomainResource
