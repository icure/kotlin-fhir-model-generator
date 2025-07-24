//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.terminologycapabilities

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Supported expansion parameter
 *
 * Supported expansion parameter.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name of the supported expansion parameter
 * @param documentation Description of support for parameter
 */
@SerialName("TerminologyCapabilitiesExpansionParameter")
@Serializable
public data class TerminologyCapabilitiesExpansionParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of the supported expansion parameter
   */
  public val name: String? = null,
  /**
   * Description of support for parameter
   */
  public val documentation: String? = null,
) : BackboneElement
