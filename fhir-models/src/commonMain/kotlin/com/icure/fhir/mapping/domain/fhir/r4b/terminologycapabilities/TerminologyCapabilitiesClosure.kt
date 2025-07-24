//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.terminologycapabilities

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the [ConceptMap/$closure](conceptmap-operation-closure.html) operation
 *
 * Whether the $closure operation is supported.
 *
 * @param id Unique id for inter-element referencing
 * @param translation If cross-system closure is supported
 */
@SerialName("TerminologyCapabilitiesClosure")
@Serializable
public data class TerminologyCapabilitiesClosure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * If cross-system closure is supported
   */
  public val translation: Boolean? = null,
) : BackboneElement
