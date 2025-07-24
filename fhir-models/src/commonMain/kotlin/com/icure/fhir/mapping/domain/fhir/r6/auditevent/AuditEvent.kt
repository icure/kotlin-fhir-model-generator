//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.auditevent

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Record of an event
 *
 * A record of an event relevant for purposes such as operations, privacy, security, maintenance,
 * and performance analysis.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param code Specific type of event
 * @param action Type of action performed during the event
 * @param severity emergency | alert | critical | error | warning | notice | informational | debug
 * @param occurredPeriod When the activity occurred
 * @param occurredDateTime When the activity occurred
 * @param recorded Time when the event was recorded
 * @param outcome Whether the event succeeded or failed
 * @param patient The patient is the subject of the data used/created/updated/deleted during the
 * activity
 * @param encounter Encounter within which this event occurred or which the event is tightly
 * associated
 * @param source Audit Event Reporter
 */
@SerialName("AuditEvent")
@Serializable
public data class AuditEvent(
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
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Specific type of event
   */
  public val code: CodeableConcept,
  /**
   * Type of action performed during the event
   */
  public val action: String? = null,
  /**
   * emergency | alert | critical | error | warning | notice | informational | debug
   */
  public val severity: String? = null,
  /**
   * When the activity occurred
   */
  public val occurredPeriod: Period? = null,
  /**
   * When the activity occurred
   */
  public val occurredDateTime: String? = null,
  /**
   * Time when the event was recorded
   */
  public val recorded: String? = null,
  /**
   * Whether the event succeeded or failed
   */
  public val outcome: AuditEventOutcome? = null,
  public val authorization: List<CodeableConcept> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  /**
   * The patient is the subject of the data used/created/updated/deleted during the activity
   */
  public val patient: Reference? = null,
  /**
   * Encounter within which this event occurred or which the event is tightly associated
   */
  public val encounter: Reference? = null,
  public val agent: List<AuditEventAgent> = emptyList(),
  /**
   * Audit Event Reporter
   */
  public val source: AuditEventSource,
  public val entity: List<AuditEventEntity> = emptyList(),
) : DomainResource
