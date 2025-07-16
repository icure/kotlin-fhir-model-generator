//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.terminologycapabilities

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
