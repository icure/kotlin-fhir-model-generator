//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.contract

import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.timing.Timing
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Entity being ascribed responsibility
 *
 * An actor taking a role in an activity for which it can be assigned some degree of responsibility
 * for the activity taking place.
 *
 * @param id Unique id for inter-element referencing
 * @param doNotPerform True if the term prohibits the  action
 * @param type Type or form of the action
 * @param intent Purpose for the Contract Term Action
 * @param status State of the action
 * @param context Episode associated with action
 * @param occurrenceDateTime When action happens
 * @param occurrencePeriod When action happens
 * @param occurrenceTiming When action happens
 * @param performerRole Competency of the performer
 * @param performer Actor that wil execute (or not) the action
 */
@SerialName("ContractTermAction")
@Serializable
public data class ContractTermAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * True if the term prohibits the  action
   */
  public val doNotPerform: Boolean? = null,
  /**
   * Type or form of the action
   */
  public val type: CodeableConcept,
  public val subject: List<ContractTermActionSubject> = emptyList(),
  /**
   * Purpose for the Contract Term Action
   */
  public val intent: CodeableConcept,
  public val linkId: List<String> = emptyList(),
  /**
   * State of the action
   */
  public val status: CodeableConcept,
  /**
   * Episode associated with action
   */
  public val context: Reference? = null,
  public val contextLinkId: List<String> = emptyList(),
  /**
   * When action happens
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When action happens
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When action happens
   */
  public val occurrenceTiming: Timing? = null,
  public val requester: List<Reference> = emptyList(),
  public val requesterLinkId: List<String> = emptyList(),
  public val performerType: List<CodeableConcept> = emptyList(),
  /**
   * Competency of the performer
   */
  public val performerRole: CodeableConcept? = null,
  /**
   * Actor that wil execute (or not) the action
   */
  public val performer: Reference? = null,
  public val performerLinkId: List<String> = emptyList(),
  public val reason: List<CodeableReference> = emptyList(),
  public val reasonLinkId: List<String> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  public val securityLabelNumber: List<Int> = emptyList(),
) : BackboneElement
