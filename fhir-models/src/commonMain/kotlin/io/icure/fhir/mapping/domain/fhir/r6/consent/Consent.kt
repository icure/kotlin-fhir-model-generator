//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.consent

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A healthcare consumer's  or third party's choices to permit or deny recipients or roles to
 * perform actions for specific purposes and periods of time
 *
 * A record of a healthcare consumer’s  choices  or choices made on their behalf by a third party,
 * which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions
 * within a given policy context, for specific purposes and periods of time.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | active | inactive | not-done | entered-in-error | unknown
 * @param subject Who the consent applies to
 * @param date Fully executed date of the consent
 * @param period Effective period for this Consent
 * @param policyBasis Computable version of the backing policy
 * @param decision deny | permit
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
   * draft | active | inactive | not-done | entered-in-error | unknown
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Who the consent applies to
   */
  public val subject: Reference? = null,
  /**
   * Fully executed date of the consent
   */
  public val date: String? = null,
  /**
   * Effective period for this Consent
   */
  public val period: Period? = null,
  public val grantor: List<Reference> = emptyList(),
  public val grantee: List<Reference> = emptyList(),
  public val manager: List<Reference> = emptyList(),
  public val controller: List<Reference> = emptyList(),
  public val sourceAttachment: List<Attachment> = emptyList(),
  public val sourceReference: List<Reference> = emptyList(),
  public val regulatoryBasis: List<CodeableConcept> = emptyList(),
  /**
   * Computable version of the backing policy
   */
  public val policyBasis: ConsentPolicyBasis? = null,
  public val policyText: List<Reference> = emptyList(),
  public val verification: List<ConsentVerification> = emptyList(),
  /**
   * deny | permit
   */
  public val decision: String? = null,
  public val provision: List<ConsentProvision> = emptyList(),
) : DomainResource
