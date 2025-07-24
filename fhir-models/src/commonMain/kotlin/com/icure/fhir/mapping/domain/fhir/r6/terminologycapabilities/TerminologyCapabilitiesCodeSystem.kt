//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.terminologycapabilities

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A code system supported by the server
 *
 * Identifies a code system that is supported by the server. If there is a no code system URL, then
 * this declares the general assumptions a client can make about support for any CodeSystem resource.
 *
 * @param id Unique id for inter-element referencing
 * @param uri Canonical identifier for the code system, represented as a URI
 * @param content not-present | example | fragment | complete | supplement
 * @param subsumption Whether subsumption is supported
 */
@SerialName("TerminologyCapabilitiesCodeSystem")
@Serializable
public data class TerminologyCapabilitiesCodeSystem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Canonical identifier for the code system, represented as a URI
   */
  public val uri: String? = null,
  public val version: List<TerminologyCapabilitiesCodeSystemVersion> = emptyList(),
  /**
   * not-present | example | fragment | complete | supplement
   */
  public val content: String? = null,
  /**
   * Whether subsumption is supported
   */
  public val subsumption: Boolean? = null,
) : BackboneElement
