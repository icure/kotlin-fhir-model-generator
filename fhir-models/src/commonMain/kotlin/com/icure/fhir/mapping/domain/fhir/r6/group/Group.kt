//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.group

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Group of multiple entities
 *
 * Represents a defined collection of entities that may be discussed or acted upon collectively but
 * which are not expected to act collectively, and are not formally or legally recognized; i.e. a
 * collection of entities that isn't an Organization.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this Group, represented as an absolute URI (globally unique)
 * @param version Business version of the Group
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Label for Group
 * @param title Name for this Group (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher/steward (organization or individual)
 * @param description Natural language description of the group
 * @param purpose Why this Group is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param type person | animal | practitioner | device | careteam | healthcareservice | location |
 * organization | relatedperson | specimen
 * @param membership definitional | conceptual | enumerated
 * @param code Kind of Group members
 * @param quantity Number of members
 * @param managingEntity Entity that is the custodian of the Group's definition
 * @param combinationMethod all-of | any-of | at-least | at-most | except-subset
 * @param combinationThreshold Provides the value of "n" when "at-least" or "at-most" codes are used
 */
@SerialName("Group")
@Serializable
public data class Group(
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
   * Canonical identifier for this Group, represented as an absolute URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the Group
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
   * Label for Group
   */
  public val name: String? = null,
  /**
   * Name for this Group (human friendly)
   */
  public val title: String? = null,
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
   * Natural language description of the group
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  /**
   * Why this Group is defined
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
   * person | animal | practitioner | device | careteam | healthcareservice | location |
   * organization | relatedperson | specimen
   */
  public val type: String? = null,
  /**
   * definitional | conceptual | enumerated
   */
  public val membership: String? = null,
  /**
   * Kind of Group members
   */
  public val code: CodeableConcept? = null,
  /**
   * Number of members
   */
  public val quantity: Int? = null,
  /**
   * Entity that is the custodian of the Group's definition
   */
  public val managingEntity: Reference? = null,
  /**
   * all-of | any-of | at-least | at-most | except-subset
   */
  public val combinationMethod: String? = null,
  /**
   * Provides the value of "n" when "at-least" or "at-most" codes are used
   */
  public val combinationThreshold: Int? = null,
  public val characteristic: List<GroupCharacteristic> = emptyList(),
  public val member: List<GroupMember> = emptyList(),
) : DomainResource
