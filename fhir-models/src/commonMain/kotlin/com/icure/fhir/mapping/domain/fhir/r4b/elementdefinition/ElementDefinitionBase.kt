//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.elementdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Base definition information for tools
 *
 * Information about the base definition of the element, provided to make it unnecessary for tools
 * to trace the deviation of the element through the derived and related profiles. When the element
 * definition is not the original definition of an element - i.g. either in a constraint on another
 * type, or for elements from a super type in a snap shot - then the information in provided in the
 * element definition may be different to the base definition. On the original definition of the
 * element, it will be same.
 *
 * @param id Unique id for inter-element referencing
 * @param path Path that identifies the base element
 * @param min Min cardinality of the base element
 * @param max Max cardinality of the base element
 */
@SerialName("ElementDefinitionBase")
@Serializable
public data class ElementDefinitionBase(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Path that identifies the base element
   */
  public val path: String? = null,
  /**
   * Min cardinality of the base element
   */
  public val min: Int? = null,
  /**
   * Max cardinality of the base element
   */
  public val max: String? = null,
) : Element
