//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.narrative

import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
) : DataType
