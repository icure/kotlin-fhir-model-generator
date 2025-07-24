//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.terminologycapabilities

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Version of Code System supported
 *
 * For the code system, a list of versions that are supported by the server.
 *
 * @param id Unique id for inter-element referencing
 * @param code Version identifier for this version
 * @param isDefault If this is the default version for this code system
 * @param compositional If compositional grammar is supported
 */
@SerialName("TerminologyCapabilitiesCodeSystemVersion")
@Serializable
public data class TerminologyCapabilitiesCodeSystemVersion(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Version identifier for this version
   */
  public val code: String? = null,
  /**
   * If this is the default version for this code system
   */
  public val isDefault: Boolean? = null,
  /**
   * If compositional grammar is supported
   */
  public val compositional: Boolean? = null,
  public val language: List<String> = emptyList(),
  public val filter: List<TerminologyCapabilitiesCodeSystemVersionFilter> = emptyList(),
  public val `property`: List<String> = emptyList(),
) : BackboneElement
