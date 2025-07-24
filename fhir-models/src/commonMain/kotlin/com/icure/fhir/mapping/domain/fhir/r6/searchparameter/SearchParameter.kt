//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.searchparameter

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Search parameter for a resource
 *
 * A search parameter that defines a named search item that can be used to search/filter on a
 * resource.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this search parameter, represented as a URI (globally unique)
 * @param version Business version of the search parameter
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this search parameter (computer friendly)
 * @param title Name for this search parameter (human friendly)
 * @param derivedFrom Original definition for the search parameter
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the search parameter
 * @param purpose Why this search parameter is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param code Recommended name for parameter in search url
 * @param type number | date | string | token | reference | composite | quantity | uri | special
 * @param expression FHIRPath expression that extracts the values
 * @param processingMode normal | phonetic | other
 * @param constraint FHIRPath expression that constraints the usage of this SearchParamete
 * @param multipleOr Allow multiple values per parameter (or)
 * @param multipleAnd Allow multiple parameters (and)
 */
@SerialName("SearchParameter")
@Serializable
public data class SearchParameter(
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
   * Canonical identifier for this search parameter, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the search parameter
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
   * Name for this search parameter (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this search parameter (human friendly)
   */
  public val title: String? = null,
  /**
   * Original definition for the search parameter
   */
  public val derivedFrom: String? = null,
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
   * Natural language description of the search parameter
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this search parameter is defined
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
   * Recommended name for parameter in search url
   */
  public val code: String? = null,
  public val base: List<String> = emptyList(),
  /**
   * number | date | string | token | reference | composite | quantity | uri | special
   */
  public val type: String? = null,
  /**
   * FHIRPath expression that extracts the values
   */
  public val expression: String? = null,
  /**
   * normal | phonetic | other
   */
  public val processingMode: String? = null,
  /**
   * FHIRPath expression that constraints the usage of this SearchParamete
   */
  public val constraint: String? = null,
  public val target: List<String> = emptyList(),
  /**
   * Allow multiple values per parameter (or)
   */
  public val multipleOr: Boolean? = null,
  /**
   * Allow multiple parameters (and)
   */
  public val multipleAnd: Boolean? = null,
  public val comparator: List<String> = emptyList(),
  public val modifier: List<String> = emptyList(),
  public val chain: List<String> = emptyList(),
  public val component: List<SearchParameterComponent> = emptyList(),
) : DomainResource
