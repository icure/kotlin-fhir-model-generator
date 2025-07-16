//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.terminologycapabilities

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation
 *
 * Information about the [ConceptMap/$translate](conceptmap-operation-translate.html) operation.
 *
 * @param id Unique id for inter-element referencing
 * @param needsMap Whether the client must identify the map
 */
@SerialName("TerminologyCapabilitiesTranslation")
@Serializable
public data class TerminologyCapabilitiesTranslation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Whether the client must identify the map
   */
  public val needsMap: Boolean? = null,
) : BackboneElement
