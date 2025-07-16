//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.valueset

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Select codes/concepts by their properties (including relationships)
 *
 * Select concepts by specify a matching criterion based on the properties (including relationships)
 * defined by the system, or on filters defined by the system. If multiple filters are specified, they
 * SHALL all be true.
 *
 * @param id Unique id for inter-element referencing
 * @param property A property/filter defined by the code system
 * @param op = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | exists
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
   * = | is-a | descendent-of | is-not-a | regex | in | not-in | generalizes | exists
   */
  public val op: String? = null,
  /**
   * Code from the system, or regex criteria, or boolean value for exists
   */
  public val `value`: String? = null,
) : BackboneElement
