//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.consent

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
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
 * A healthcare consumer's  choices to permit or deny recipients or roles to perform actions for
 * specific purposes and periods of time
 *
 * A record of a healthcare consumer’s  choices, which permits or denies identified recipient(s) or
 * recipient role(s) to perform one or more actions within a given policy context, for specific
 * purposes and periods of time.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | proposed | active | rejected | inactive | entered-in-error
 * @param scope Which of the four areas this resource covers (extensible)
 * @param patient Who the consent applies to
 * @param dateTime When this Consent was created or indexed
 * @param sourceAttachment Source from which this consent is taken
 * @param sourceReference Source from which this consent is taken
 * @param policyRule Regulation that this consents to
 * @param provision Constraints to the base Consent.policyRule
 */
@SerialName("Consent")
@Serializable
public data class Consent(
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
   * draft | proposed | active | rejected | inactive | entered-in-error
   */
  public val status: String? = null,
  /**
   * Which of the four areas this resource covers (extensible)
   */
  public val scope: CodeableConcept,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Who the consent applies to
   */
  public val patient: Reference? = null,
  /**
   * When this Consent was created or indexed
   */
  public val dateTime: String? = null,
  public val performer: List<Reference> = emptyList(),
  public val organization: List<Reference> = emptyList(),
  /**
   * Source from which this consent is taken
   */
  public val sourceAttachment: Attachment? = null,
  /**
   * Source from which this consent is taken
   */
  public val sourceReference: Reference? = null,
  public val policy: List<ConsentPolicy> = emptyList(),
  /**
   * Regulation that this consents to
   */
  public val policyRule: CodeableConcept? = null,
  public val verification: List<ConsentVerification> = emptyList(),
  /**
   * Constraints to the base Consent.policyRule
   */
  public val provision: ConsentProvision? = null,
) : DomainResource
