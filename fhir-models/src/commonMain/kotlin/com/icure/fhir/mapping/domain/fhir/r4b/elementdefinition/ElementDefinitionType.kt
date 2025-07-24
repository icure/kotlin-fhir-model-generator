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
 * Data type and Profile for this element
 *
 * The data type or resource that the value of this element is permitted to be.
 *
 * @param id Unique id for inter-element referencing
 * @param code Data type or Resource (reference to definition)
 * @param versioning either | independent | specific
 */
@SerialName("ElementDefinitionType")
@Serializable
public data class ElementDefinitionType(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Data type or Resource (reference to definition)
   */
  public val code: String? = null,
  public val profile: List<String> = emptyList(),
  public val targetProfile: List<String> = emptyList(),
  public val aggregation: List<String> = emptyList(),
  /**
   * either | independent | specific
   */
  public val versioning: String? = null,
) : Element
