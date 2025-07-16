//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.adverseevent

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r5.timing.Timing
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An event that may be related to unintended effects on a patient or research participant
 *
 * An event (i.e. any change to current patient status) that may be related to unintended effects on
 * a patient or research participant. The unintended effects may require additional monitoring,
 * treatment, hospitalization, or may result in death. The AdverseEvent resource also extends to
 * potential or avoided events that could have had such effects. There are two major domains where the
 * AdverseEvent resource is expected to be used. One is in clinical care reported adverse events and
 * the other is in reporting adverse events in clinical  research trial management. Adverse events can
 * be reported by healthcare providers, patients, caregivers or by medical products manufacturers.
 * Given the differences between these two concepts, we recommend consulting the domain specific
 * implementation guides when implementing the AdverseEvent Resource. The implementation guides include
 * specific extensions, value sets and constraints.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status in-progress | completed | entered-in-error | unknown
 * @param actuality actual | potential
 * @param code Event or incident that occurred or was averted
 * @param subject Subject impacted by event
 * @param encounter The Encounter associated with the start of the AdverseEvent
 * @param occurrenceDateTime When the event occurred
 * @param occurrencePeriod When the event occurred
 * @param occurrenceTiming When the event occurred
 * @param detected When the event was detected
 * @param recordedDate When the event was recorded
 * @param location Location where adverse event occurred
 * @param seriousness Seriousness or gravity of the event
 * @param recorder Who recorded the adverse event
 * @param expectedInResearchStudy Considered likely or probable or anticipated in the research study
 */
@SerialName("AdverseEvent")
@Serializable
public data class AdverseEvent(
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
   * in-progress | completed | entered-in-error | unknown
   */
  public val status: String? = null,
  /**
   * actual | potential
   */
  public val actuality: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Event or incident that occurred or was averted
   */
  public val code: CodeableConcept? = null,
  /**
   * Subject impacted by event
   */
  public val subject: Reference,
  /**
   * The Encounter associated with the start of the AdverseEvent
   */
  public val encounter: Reference? = null,
  /**
   * When the event occurred
   */
  public val occurrenceDateTime: String? = null,
  /**
   * When the event occurred
   */
  public val occurrencePeriod: Period? = null,
  /**
   * When the event occurred
   */
  public val occurrenceTiming: Timing? = null,
  /**
   * When the event was detected
   */
  public val detected: String? = null,
  /**
   * When the event was recorded
   */
  public val recordedDate: String? = null,
  public val resultingEffect: List<Reference> = emptyList(),
  /**
   * Location where adverse event occurred
   */
  public val location: Reference? = null,
  /**
   * Seriousness or gravity of the event
   */
  public val seriousness: CodeableConcept? = null,
  public val outcome: List<CodeableConcept> = emptyList(),
  /**
   * Who recorded the adverse event
   */
  public val recorder: Reference? = null,
  public val participant: List<AdverseEventParticipant> = emptyList(),
  public val study: List<Reference> = emptyList(),
  /**
   * Considered likely or probable or anticipated in the research study
   */
  public val expectedInResearchStudy: Boolean? = null,
  public val suspectEntity: List<AdverseEventSuspectEntity> = emptyList(),
  public val contributingFactor: List<AdverseEventContributingFactor> = emptyList(),
  public val preventiveAction: List<AdverseEventPreventiveAction> = emptyList(),
  public val mitigatingAction: List<AdverseEventMitigatingAction> = emptyList(),
  public val supportingInfo: List<AdverseEventSupportingInfo> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
