//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.group

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who or what is in group
 *
 * Identifies the resource instances that are members of the group.
 *
 * @param id Unique id for inter-element referencing
 * @param entity Reference to the group member
 * @param period Period member belonged to the group
 * @param inactive If member is no longer in group
 */
@SerialName("GroupMember")
@Serializable
public data class GroupMember(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to the group member
   */
  public val entity: Reference,
  /**
   * Period member belonged to the group
   */
  public val period: Period? = null,
  /**
   * If member is no longer in group
   */
  public val inactive: Boolean? = null,
) : BackboneElement
