//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.narrative

import io.icure.fhir.mapping.domain.fhir.r4b.Element
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Human-readable summary of the resource (essential clinical and business information)
 *
 * A human-readable summary of the resource conveying the essential clinical and business
 * information for the resource.
 *
 * @param id Unique id for inter-element referencing
 * @param status generated | extensions | additional | empty
 * @param div Limited xhtml content
 */
@SerialName("Narrative")
@Serializable
public data class Narrative(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * generated | extensions | additional | empty
   */
  public val status: String? = null,
  /**
   * Limited xhtml content
   */
  public val div: String? = null,
) : Element
