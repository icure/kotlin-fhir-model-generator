//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.auditevent

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Event record kept for security purposes
 *
 * A record of an event made for purposes of maintaining a security log. Typical uses include
 * detection of intrusion attempts and monitoring for inappropriate usage.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type Type/identifier of event
 * @param action Type of action performed during the event
 * @param period When the activity occurred
 * @param recorded Time when the event was recorded
 * @param outcome Whether the event succeeded or failed
 * @param outcomeDesc Description of the event outcome
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
  /**
   * Type/identifier of event
   */
  public val type: Coding,
  public val subtype: List<Coding> = emptyList(),
  /**
   * Type of action performed during the event
   */
  public val action: String? = null,
  /**
   * When the activity occurred
   */
  public val period: Period? = null,
  /**
   * Time when the event was recorded
   */
  public val recorded: String? = null,
  /**
   * Whether the event succeeded or failed
   */
  public val outcome: String? = null,
  /**
   * Description of the event outcome
   */
  public val outcomeDesc: String? = null,
  public val purposeOfEvent: List<CodeableConcept> = emptyList(),
  public val agent: List<AuditEventAgent> = emptyList(),
  /**
   * Audit Event Reporter
   */
  public val source: AuditEventSource,
  public val entity: List<AuditEventEntity> = emptyList(),
) : DomainResource
