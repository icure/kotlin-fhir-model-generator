//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.contract

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Legal Agreement
 *
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or
 * agreement.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Basal definition
 * @param version Business edition
 * @param status amended | appended | cancelled | disputed | entered-in-error | executable +
 * @param legalState Negotiation status
 * @param instantiatesCanonical Source Contract Definition
 * @param instantiatesUri External Contract Definition
 * @param contentDerivative Content derived from the basal information
 * @param issued When this Contract was issued
 * @param applies Effective time
 * @param expirationType Contract cessation cause
 * @param name Computer friendly designation
 * @param title Human Friendly name
 * @param subtitle Subordinate Friendly name
 * @param author Source of Contract
 * @param scope Range of Legal Concerns
 * @param topicCodeableConcept Focus of contract interest
 * @param topicReference Focus of contract interest
 * @param type Legal instrument category
 * @param contentDefinition Contract precursor content
 * @param legallyBindingAttachment Binding Contract
 * @param legallyBindingReference Binding Contract
 */
@SerialName("Contract")
@Serializable
public data class Contract(
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
   * Basal definition
   */
  public val url: String? = null,
  /**
   * Business edition
   */
  public val version: String? = null,
  /**
   * amended | appended | cancelled | disputed | entered-in-error | executable +
   */
  public val status: String? = null,
  /**
   * Negotiation status
   */
  public val legalState: CodeableConcept? = null,
  /**
   * Source Contract Definition
   */
  public val instantiatesCanonical: Reference? = null,
  /**
   * External Contract Definition
   */
  public val instantiatesUri: String? = null,
  /**
   * Content derived from the basal information
   */
  public val contentDerivative: CodeableConcept? = null,
  /**
   * When this Contract was issued
   */
  public val issued: String? = null,
  /**
   * Effective time
   */
  public val applies: Period? = null,
  /**
   * Contract cessation cause
   */
  public val expirationType: CodeableConcept? = null,
  public val subject: List<Reference> = emptyList(),
  public val authority: List<Reference> = emptyList(),
  public val domain: List<Reference> = emptyList(),
  public val site: List<Reference> = emptyList(),
  /**
   * Computer friendly designation
   */
  public val name: String? = null,
  /**
   * Human Friendly name
   */
  public val title: String? = null,
  /**
   * Subordinate Friendly name
   */
  public val subtitle: String? = null,
  public val alias: List<String> = emptyList(),
  /**
   * Source of Contract
   */
  public val author: Reference? = null,
  /**
   * Range of Legal Concerns
   */
  public val scope: CodeableConcept? = null,
  /**
   * Focus of contract interest
   */
  public val topicCodeableConcept: CodeableConcept? = null,
  /**
   * Focus of contract interest
   */
  public val topicReference: Reference? = null,
  /**
   * Legal instrument category
   */
  public val type: CodeableConcept? = null,
  public val subType: List<CodeableConcept> = emptyList(),
  /**
   * Contract precursor content
   */
  public val contentDefinition: ContractContentDefinition? = null,
  public val term: List<ContractTerm> = emptyList(),
  public val supportingInfo: List<Reference> = emptyList(),
  public val relevantHistory: List<Reference> = emptyList(),
  public val signer: List<ContractSigner> = emptyList(),
  public val friendly: List<ContractFriendly> = emptyList(),
  public val legal: List<ContractLegal> = emptyList(),
  public val rule: List<ContractRule> = emptyList(),
  /**
   * Binding Contract
   */
  public val legallyBindingAttachment: Attachment? = null,
  /**
   * Binding Contract
   */
  public val legallyBindingReference: Reference? = null,
) : DomainResource
