//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.messagedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Resource(s) that are the subject of the event
 *
 * Identifies the resource (or resources) that are being addressed by the event.  For example, the
 * Encounter for an admit message or two Account records for a merge.
 *
 * @param id Unique id for inter-element referencing
 * @param code Type of resource
 * @param profile Profile that must be adhered to by focus
 * @param min Minimum number of focuses of this type
 * @param max Maximum number of focuses of this type
 */
@SerialName("MessageDefinitionFocus")
@Serializable
public data class MessageDefinitionFocus(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of resource
   */
  public val code: String? = null,
  /**
   * Profile that must be adhered to by focus
   */
  public val profile: String? = null,
  /**
   * Minimum number of focuses of this type
   */
  public val min: Int? = null,
  /**
   * Maximum number of focuses of this type
   */
  public val max: String? = null,
) : BackboneElement
