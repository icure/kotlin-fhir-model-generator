//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.evidencevariable

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A definition of an exposure, outcome, or other variable
 *
 * The EvidenceVariable resource describes an element that knowledge (Evidence) is about.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this evidence variable, represented as a URI (globally
 * unique)
 * @param version Business version of the evidence variable
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this evidence variable (computer friendly)
 * @param title Name for this evidence variable (human friendly)
 * @param shortTitle Title for use in informal contexts
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the evidence variable
 * @param purpose Why this EvidenceVariable is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param approvalDate When the resource was approved by publisher
 * @param lastReviewDate When the resource was last reviewed by the publisher
 * @param effectivePeriod When the resource is expected to be used
 * @param actual Actual or conceptual
 * @param definition Defines the variable with a concept and/or Reference
 * @param handling continuous | dichotomous | ordinal | polychotomous
 */
@SerialName("EvidenceVariable")
@Serializable
public data class EvidenceVariable(
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
   * Canonical identifier for this evidence variable, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the evidence variable
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
   * Name for this evidence variable (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this evidence variable (human friendly)
   */
  public val title: String? = null,
  /**
   * Title for use in informal contexts
   */
  public val shortTitle: String? = null,
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
   * Natural language description of the evidence variable
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val useContext: List<UsageContext> = emptyList(),
  /**
   * Why this EvidenceVariable is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * Copyright holder and year(s)
   */
  public val copyrightLabel: String? = null,
  /**
   * When the resource was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the resource was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * When the resource is expected to be used
   */
  public val effectivePeriod: Period? = null,
  public val author: List<ContactDetail> = emptyList(),
  public val editor: List<ContactDetail> = emptyList(),
  public val reviewer: List<ContactDetail> = emptyList(),
  public val endorser: List<ContactDetail> = emptyList(),
  public val relatedArtifact: List<RelatedArtifact> = emptyList(),
  /**
   * Actual or conceptual
   */
  public val `actual`: Boolean? = null,
  /**
   * Defines the variable with a concept and/or Reference
   */
  public val definition: CodeableReference? = null,
  /**
   * continuous | dichotomous | ordinal | polychotomous
   */
  public val handling: String? = null,
  public val category: List<EvidenceVariableCategory> = emptyList(),
) : DomainResource
