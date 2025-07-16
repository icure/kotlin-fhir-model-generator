//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.detectedissue

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Clinical issue with action
 *
 * Indicates an actual or potential clinical issue with or between one or more active or proposed
 * clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency,
 * Procedure-condition conflict, gaps in care, etc.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preliminary | final | entered-in-error | mitigated
 * @param code Specific type of detected issue, e.g. drug-drug, duplicate therapy, etc
 * @param severity high | moderate | low
 * @param subject Associated subject
 * @param encounter Encounter detected issue is part of
 * @param identifiedDateTime When identified
 * @param identifiedPeriod When identified
 * @param author The provider or device that identified the issue
 * @param detail Description and context
 * @param reference Authority for issue
 */
@SerialName("DetectedIssue")
@Serializable
public data class DetectedIssue(
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
   * preliminary | final | entered-in-error | mitigated
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Specific type of detected issue, e.g. drug-drug, duplicate therapy, etc
   */
  public val code: CodeableConcept? = null,
  /**
   * high | moderate | low
   */
  public val severity: String? = null,
  /**
   * Associated subject
   */
  public val subject: Reference? = null,
  /**
   * Encounter detected issue is part of
   */
  public val encounter: Reference? = null,
  /**
   * When identified
   */
  public val identifiedDateTime: String? = null,
  /**
   * When identified
   */
  public val identifiedPeriod: Period? = null,
  /**
   * The provider or device that identified the issue
   */
  public val author: Reference? = null,
  public val implicated: List<Reference> = emptyList(),
  public val evidence: List<DetectedIssueEvidence> = emptyList(),
  /**
   * Description and context
   */
  public val detail: String? = null,
  /**
   * Authority for issue
   */
  public val reference: String? = null,
  public val mitigation: List<DetectedIssueMitigation> = emptyList(),
) : DomainResource
