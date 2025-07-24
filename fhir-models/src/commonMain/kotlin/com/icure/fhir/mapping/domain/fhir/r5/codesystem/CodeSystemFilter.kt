//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.codesystem

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Filter that can be used in a value set
 *
 * A filter that can be used in a value set compose statement when selecting concepts using a
 * filter.
 *
 * @param id Unique id for inter-element referencing
 * @param code Code that identifies the filter
 * @param description How or why the filter is used
 * @param value What to use for the value
 */
@SerialName("CodeSystemFilter")
@Serializable
public data class CodeSystemFilter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that identifies the filter
   */
  public val code: String? = null,
  /**
   * How or why the filter is used
   */
  public val description: String? = null,
  public val `operator`: List<String> = emptyList(),
  /**
   * What to use for the value
   */
  public val `value`: String? = null,
) : BackboneElement
