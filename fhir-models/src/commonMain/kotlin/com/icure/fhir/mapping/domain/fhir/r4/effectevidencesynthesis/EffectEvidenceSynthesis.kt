//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.effectevidencesynthesis

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r4.usagecontext.UsageContext
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A quantified estimate of effect based on a body of evidence
 *
 * The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures
 * states in a population where the effect estimate is derived from a combination of research studies.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this effect evidence synthesis, represented as a URI
 * (globally unique)
 * @param version Business version of the effect evidence synthesis
 * @param name Name for this effect evidence synthesis (computer friendly)
 * @param title Name for this effect evidence synthesis (human friendly)
 * @param status draft | active | retired | unknown
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the effect evidence synthesis
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When the effect evidence synthesis was approved by publisher
 * @param lastReviewDate When the effect evidence synthesis was last reviewed
 * @param effectivePeriod When the effect evidence synthesis is expected to be used
 * @param synthesisType Type of synthesis
 * @param studyType Type of study
 * @param population What population?
 * @param exposure What exposure?
 * @param exposureAlternative What comparison exposure?
 * @param outcome What outcome?
 * @param sampleSize What sample size was involved?
 */
@SerialName("EffectEvidenceSynthesis")
@Serializable
public data class EffectEvidenceSynthesis(
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
   * Canonical identifier for this effect evidence synthesis, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the effect evidence synthesis
   */
  public val version: String? = null,
  /**
   * Name for this effect evidence synthesis (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this effect evidence synthesis (human friendly)
   */
  public val title: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
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
   * Natural language description of the effect evidence synthesis
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When the effect evidence synthesis was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the effect evidence synthesis was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * When the effect evidence synthesis is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val topic: List<CodeableConcept> = emptyList(),
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * Type of synthesis
   */
  public val synthesisType: CodeableConcept? = null,
  /**
   * Type of study
   */
  public val studyType: CodeableConcept? = null,
  /**
   * What population?
   */
  public val population: Reference,
  /**
   * What exposure?
   */
  public val exposure: Reference,
  /**
   * What comparison exposure?
   */
  public val exposureAlternative: Reference,
  /**
   * What outcome?
   */
  public val outcome: Reference,
  /**
   * What sample size was involved?
   */
  public val sampleSize: EffectEvidenceSynthesisSampleSize? = null,
  public val resultsByExposure: List<EffectEvidenceSynthesisResultsByExposure> = emptyList(),
  public val effectEstimate: List<EffectEvidenceSynthesisEffectEstimate> = emptyList(),
  public val certainty: List<EffectEvidenceSynthesisCertainty> = emptyList(),
) : DomainResource
