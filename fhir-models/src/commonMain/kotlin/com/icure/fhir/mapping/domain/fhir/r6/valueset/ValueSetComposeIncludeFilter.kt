//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.valueset

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Select codes/concepts by their properties (including relationships)
 *
 * Select concepts by specifying a matching criterion based on the properties (including
 * relationships) defined by the system, or on filters defined by the system. If multiple filters are
 * specified within the include, they SHALL all be true.
 *
 * @param id Unique id for inter-element referencing
 * @param property A property/filter defined by the code system
 * @param op = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | child-of |
 * descendent-leaf | exists
 * @param value Code from the system, or regex criteria, or boolean value for exists
 */
@SerialName("ValueSetComposeIncludeFilter")
@Serializable
public data class ValueSetComposeIncludeFilter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A property/filter defined by the code system
   */
  public val `property`: String? = null,
  /**
   * = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | child-of |
   * descendent-leaf | exists
   */
  public val op: String? = null,
  /**
   * Code from the system, or regex criteria, or boolean value for exists
   */
  public val `value`: String? = null,
) : BackboneElement
