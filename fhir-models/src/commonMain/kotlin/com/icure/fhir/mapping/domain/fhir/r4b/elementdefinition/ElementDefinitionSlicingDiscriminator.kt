//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.elementdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Element values that are used to distinguish the slices
 *
 * Designates which child elements are used to discriminate between the slices when processing an
 * instance. If one or more discriminators are provided, the value of the child elements in the
 * instance data SHALL completely distinguish which slice the element in the resource matches based on
 * the allowed values for those elements in each of the slices.
 *
 * @param id Unique id for inter-element referencing
 * @param type value | exists | pattern | type | profile
 * @param path Path to element value
 */
@SerialName("ElementDefinitionSlicingDiscriminator")
@Serializable
public data class ElementDefinitionSlicingDiscriminator(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * value | exists | pattern | type | profile
   */
  public val type: String? = null,
  /**
   * Path to element value
   */
  public val path: String? = null,
) : Element
