//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.questionnaire

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A structured set of questions
 *
 * A structured set of questions intended to guide the collection of answers from end-users.
 * Questionnaires provide detailed control over order, presentation, phraseology and grouping to allow
 * coherent, consistent data collection.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this questionnaire, represented as a URI (globally unique)
 * @param version Business version of the questionnaire
 * @param name Name for this questionnaire (computer friendly)
 * @param title Name for this questionnaire (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the questionnaire
 * @param purpose Why this questionnaire is defined
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When the questionnaire was approved by publisher
 * @param lastReviewDate When the questionnaire was last reviewed
 * @param effectivePeriod When the questionnaire is expected to be used
 */
@SerialName("Questionnaire")
@Serializable
public data class Questionnaire(
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
   * Canonical identifier for this questionnaire, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the questionnaire
   */
  public val version: String? = null,
  /**
   * Name for this questionnaire (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this questionnaire (human friendly)
   */
  public val title: String? = null,
  public val derivedFrom: List<String> = emptyList(),
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * For testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  public val subjectType: List<String> = emptyList(),
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * Name of the publisher (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the questionnaire
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this questionnaire is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When the questionnaire was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the questionnaire was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * When the questionnaire is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val code: List<Coding> = emptyList(),
  public val item: List<QuestionnaireItem> = emptyList(),
) : DomainResource
