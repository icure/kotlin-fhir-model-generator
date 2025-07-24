//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.conceptmap

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Other elements required for this mapping (from context)
 *
 * A set of additional dependencies for this mapping to hold. This mapping is only applicable if the
 * specified element can be resolved, and it has the specified value.
 *
 * @param id Unique id for inter-element referencing
 * @param property Reference to property mapping depends on
 * @param system Code System (if necessary)
 * @param value Value of the referenced element
 * @param display Display for the code (if value is a code)
 */
@SerialName("ConceptMapGroupElementTargetDependsOn")
@Serializable
public data class ConceptMapGroupElementTargetDependsOn(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to property mapping depends on
   */
  public val `property`: String? = null,
  /**
   * Code System (if necessary)
   */
  public val system: String? = null,
  /**
   * Value of the referenced element
   */
  public val `value`: String? = null,
  /**
   * Display for the code (if value is a code)
   */
  public val display: String? = null,
) : BackboneElement
