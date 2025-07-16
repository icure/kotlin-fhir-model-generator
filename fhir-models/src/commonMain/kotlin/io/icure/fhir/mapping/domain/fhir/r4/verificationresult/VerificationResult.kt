//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.verificationresult

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Describes validation requirements, source(s), status and dates for one or more elements
 *
 * Describes validation requirements, source(s), status and dates for one or more elements.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param need none | initial | periodic
 * @param status attested | validated | in-process | req-revalid | val-fail | reval-fail
 * @param statusDate When the validation status was updated
 * @param validationType nothing | primary | multiple
 * @param frequency Frequency of revalidation
 * @param lastPerformed The date/time validation was last completed (including failed validations)
 * @param nextScheduled The date when target is next validated, if appropriate
 * @param failureAction fatal | warn | rec-only | none
 * @param attestation Information about the entity attesting to information
 */
@SerialName("VerificationResult")
@Serializable
public data class VerificationResult(
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
  public val target: List<Reference> = emptyList(),
  public val targetLocation: List<String> = emptyList(),
  /**
   * none | initial | periodic
   */
  public val need: CodeableConcept? = null,
  /**
   * attested | validated | in-process | req-revalid | val-fail | reval-fail
   */
  public val status: String? = null,
  /**
   * When the validation status was updated
   */
  public val statusDate: String? = null,
  /**
   * nothing | primary | multiple
   */
  public val validationType: CodeableConcept? = null,
  public val validationProcess: List<CodeableConcept> = emptyList(),
  /**
   * Frequency of revalidation
   */
  public val frequency: Timing? = null,
  /**
   * The date/time validation was last completed (including failed validations)
   */
  public val lastPerformed: String? = null,
  /**
   * The date when target is next validated, if appropriate
   */
  public val nextScheduled: String? = null,
  /**
   * fatal | warn | rec-only | none
   */
  public val failureAction: CodeableConcept? = null,
  public val primarySource: List<VerificationResultPrimarySource> = emptyList(),
  /**
   * Information about the entity attesting to information
   */
  public val attestation: VerificationResultAttestation? = null,
  public val validator: List<VerificationResultValidator> = emptyList(),
) : DomainResource
