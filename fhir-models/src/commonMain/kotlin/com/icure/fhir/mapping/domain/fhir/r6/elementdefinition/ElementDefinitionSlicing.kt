//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.elementdefinition

import com.icure.fhir.mapping.domain.fhir.r6.Element
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This element is sliced - slices follow
 *
 * Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure
 * definition, there are multiple different constraints on a single element in the base resource).
 * Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource
 * with a choice of types. The set of slices is any elements that come after this in the element
 * sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).
 *
 * @param id Unique id for inter-element referencing
 * @param description Text description of how slicing works (or not)
 * @param ordered If elements must be in same order as slices
 * @param rules closed | open | openAtEnd
 */
@SerialName("ElementDefinitionSlicing")
@Serializable
public data class ElementDefinitionSlicing(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  public val discriminator: List<ElementDefinitionSlicingDiscriminator> = emptyList(),
  /**
   * Text description of how slicing works (or not)
   */
  public val description: String? = null,
  /**
   * If elements must be in same order as slices
   */
  public val ordered: Boolean? = null,
  /**
   * closed | open | openAtEnd
   */
  public val rules: String? = null,
) : Element
