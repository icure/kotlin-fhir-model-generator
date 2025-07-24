//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.observationdefinition

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r5.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of an observation
 *
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed
 * by an orderable health care service.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Logical canonical URL to reference this ObservationDefinition (globally unique)
 * @param identifier Business identifier of the ObservationDefinition
 * @param version Business version of the ObservationDefinition
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this ObservationDefinition (computer friendly)
 * @param title Name for this ObservationDefinition (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental If for testing purposes, not real usage
 * @param date Date last changed
 * @param publisher The name of the individual or organization that published the
 * ObservationDefinition
 * @param description Natural language description of the ObservationDefinition
 * @param purpose Why this ObservationDefinition is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param approvalDate When ObservationDefinition was approved by publisher
 * @param lastReviewDate Date on which the asset content was last reviewed by the publisher
 * @param effectivePeriod The effective date range for the ObservationDefinition
 * @param performerType Desired kind of performer for such kind of observation
 * @param code Type of observation
 * @param multipleResultsAllowed Multiple results allowed for conforming observations
 * @param bodySite Body part to be observed
 * @param method Method used to produce the observation
 * @param preferredReportName The preferred name to be used when reporting the observation results
 */
@SerialName("ObservationDefinition")
@Serializable
public data class ObservationDefinition(
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
   * Logical canonical URL to reference this ObservationDefinition (globally unique)
   */
  public val url: String? = null,
  /**
   * Business identifier of the ObservationDefinition
   */
  public val identifier: Identifier? = null,
  /**
   * Business version of the ObservationDefinition
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
   * Name for this ObservationDefinition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this ObservationDefinition (human friendly)
   */
  public val title: String? = null,
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * If for testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * The name of the individual or organization that published the ObservationDefinition
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the ObservationDefinition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this ObservationDefinition is defined
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
   * When ObservationDefinition was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * Date on which the asset content was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * The effective date range for the ObservationDefinition
   */
  public val effectivePeriod: Period? = null,
  public val derivedFromCanonical: List<String> = emptyList(),
  public val derivedFromUri: List<String> = emptyList(),
  public val subject: List<CodeableConcept> = emptyList(),
  /**
   * Desired kind of performer for such kind of observation
   */
  public val performerType: CodeableConcept? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Type of observation
   */
  public val code: CodeableConcept,
  public val permittedDataType: List<String> = emptyList(),
  /**
   * Multiple results allowed for conforming observations
   */
  public val multipleResultsAllowed: Boolean? = null,
  /**
   * Body part to be observed
   */
  public val bodySite: CodeableConcept? = null,
  /**
   * Method used to produce the observation
   */
  public val method: CodeableConcept? = null,
  public val specimen: List<Reference> = emptyList(),
  public val device: List<Reference> = emptyList(),
  /**
   * The preferred name to be used when reporting the observation results
   */
  public val preferredReportName: String? = null,
  public val permittedUnit: List<Coding> = emptyList(),
  public val qualifiedValue: List<ObservationDefinitionQualifiedValue> = emptyList(),
  public val hasMember: List<Reference> = emptyList(),
  public val component: List<ObservationDefinitionComponent> = emptyList(),
) : DomainResource
