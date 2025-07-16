//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.terminologycapabilities

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Filter Properties supported
 *
 * Filter Properties supported.
 *
 * @param id Unique id for inter-element referencing
 * @param code Code of the property supported
 */
@SerialName("TerminologyCapabilitiesCodeSystemVersionFilter")
@Serializable
public data class TerminologyCapabilitiesCodeSystemVersionFilter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code of the property supported
   */
  public val code: String? = null,
  public val op: List<String> = emptyList(),
) : BackboneElement
