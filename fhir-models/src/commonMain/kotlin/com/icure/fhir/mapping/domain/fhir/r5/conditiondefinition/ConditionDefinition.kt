//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.conditiondefinition

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A definition of a condition
 *
 * A definition of a condition and information relevant to managing it.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this condition definition, represented as a URI (globally
 * unique)
 * @param version Business version of the condition definition
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this condition definition (computer friendly)
 * @param title Name for this condition definition (human friendly)
 * @param subtitle Subordinate title of the event definition
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the condition definition
 * @param code Identification of the condition, problem or diagnosis
 * @param severity Subjective severity of condition
 * @param bodySite Anatomical location, if relevant
 * @param stage Stage/grade, usually assessed formally
 * @param hasSeverity Whether Severity is appropriate
 * @param hasBodySite Whether bodySite is appropriate
 * @param hasStage Whether stage is appropriate
 */
@SerialName("ConditionDefinition")
@Serializable
public data class ConditionDefinition(
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
   * Canonical identifier for this condition definition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the condition definition
   */
  public val version: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmString: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmCoding: Coding? = null,
  /**
   * Name for this condition definition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this condition definition (human friendly)
   */
  public val title: String? = null,
  /**
   * Subordinate title of the event definition
   */
  public val subtitle: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * For testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * Name of the publisher/steward (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the condition definition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Identification of the condition, problem or diagnosis
   */
  public val code: CodeableConcept,
  /**
   * Subjective severity of condition
   */
  public val severity: CodeableConcept? = null,
  /**
   * Anatomical location, if relevant
   */
  public val bodySite: CodeableConcept? = null,
  /**
   * Stage/grade, usually assessed formally
   */
  public val stage: CodeableConcept? = null,
  /**
   * Whether Severity is appropriate
   */
  public val hasSeverity: Boolean? = null,
  /**
   * Whether bodySite is appropriate
   */
  public val hasBodySite: Boolean? = null,
  /**
   * Whether stage is appropriate
   */
  public val hasStage: Boolean? = null,
  public val definition: List<String> = emptyList(),
  public val observation: List<ConditionDefinitionObservation> = emptyList(),
  public val medication: List<ConditionDefinitionMedication> = emptyList(),
  public val precondition: List<ConditionDefinitionPrecondition> = emptyList(),
  public val team: List<Reference> = emptyList(),
  public val questionnaire: List<ConditionDefinitionQuestionnaire> = emptyList(),
  public val plan: List<ConditionDefinitionPlan> = emptyList(),
) : DomainResource
