//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.group

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param active Whether this group's record is in active use
 * @param type person | animal | practitioner | device | medication | substance
 * @param actual Descriptive or actual
 * @param code Kind of Group members
 * @param name Label for Group
 * @param quantity Number of members
 * @param managingEntity Entity that is the custodian of the Group's definition
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Whether this group's record is in active use
   */
  public val active: Boolean? = null,
  /**
   * person | animal | practitioner | device | medication | substance
   */
  public val type: String? = null,
  /**
   * Descriptive or actual
   */
  public val `actual`: Boolean? = null,
  /**
   * Kind of Group members
   */
  public val code: CodeableConcept? = null,
  /**
   * Label for Group
   */
  public val name: String? = null,
  /**
   * Number of members
   */
  public val quantity: Int? = null,
  /**
   * Entity that is the custodian of the Group's definition
   */
  public val managingEntity: Reference? = null,
  public val characteristic: List<GroupCharacteristic> = emptyList(),
  public val member: List<GroupMember> = emptyList(),
) : DomainResource
