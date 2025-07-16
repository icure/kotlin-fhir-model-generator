//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.adverseevent

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Medical care, research study or other healthcare event causing physical injury
 *
 * Actual or  potential/avoided event causing unintended physical injury resulting from or
 * contributed to by medical care, a research study or other healthcare setting factors that requires
 * additional monitoring, treatment, or hospitalization, or that results in death.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param identifier Business identifier for the event
 * @param actuality actual | potential
 * @param event Type of the event itself in relation to the subject
 * @param subject Subject impacted by event
 * @param encounter Encounter created as part of
 * @param date When the event occurred
 * @param detected When the event was detected
 * @param recordedDate When the event was recorded
 * @param location Location where adverse event occurred
 * @param seriousness Seriousness of the event
 * @param severity mild | moderate | severe
 * @param outcome resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
 * @param recorder Who recorded the adverse event
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
  /**
   * Business identifier for the event
   */
  public val identifier: Identifier? = null,
  /**
   * actual | potential
   */
  public val actuality: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Type of the event itself in relation to the subject
   */
  public val event: CodeableConcept? = null,
  /**
   * Subject impacted by event
   */
  public val subject: Reference,
  /**
   * Encounter created as part of
   */
  public val encounter: Reference? = null,
  /**
   * When the event occurred
   */
  public val date: String? = null,
  /**
   * When the event was detected
   */
  public val detected: String? = null,
  /**
   * When the event was recorded
   */
  public val recordedDate: String? = null,
  public val resultingCondition: List<Reference> = emptyList(),
  /**
   * Location where adverse event occurred
   */
  public val location: Reference? = null,
  /**
   * Seriousness of the event
   */
  public val seriousness: CodeableConcept? = null,
  /**
   * mild | moderate | severe
   */
  public val severity: CodeableConcept? = null,
  /**
   * resolved | recovering | ongoing | resolvedWithSequelae | fatal | unknown
   */
  public val outcome: CodeableConcept? = null,
  /**
   * Who recorded the adverse event
   */
  public val recorder: Reference? = null,
  public val contributor: List<Reference> = emptyList(),
  public val suspectEntity: List<AdverseEventSuspectEntity> = emptyList(),
  public val subjectMedicalHistory: List<Reference> = emptyList(),
  public val referenceDocument: List<Reference> = emptyList(),
  public val study: List<Reference> = emptyList(),
) : DomainResource
