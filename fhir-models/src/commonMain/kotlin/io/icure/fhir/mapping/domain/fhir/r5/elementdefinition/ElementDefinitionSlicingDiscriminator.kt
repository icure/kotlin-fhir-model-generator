//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.elementdefinition

import io.icure.fhir.mapping.domain.fhir.r5.Element
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
 * @param type value | exists | type | profile | position
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
   * value | exists | type | profile | position
   */
  public val type: String? = null,
  /**
   * Path to element value
   */
  public val path: String? = null,
) : Element
