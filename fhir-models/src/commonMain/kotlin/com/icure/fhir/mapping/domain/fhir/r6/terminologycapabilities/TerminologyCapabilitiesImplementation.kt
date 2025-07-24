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
 * If this describes a specific instance
 *
 * Identifies a specific implementation instance that is described by the terminology capability
 * statement - i.e. a particular installation, rather than the capabilities of a software program.
 *
 * @param id Unique id for inter-element referencing
 * @param description Describes this specific instance
 * @param url Base URL for the implementation
 */
@SerialName("TerminologyCapabilitiesImplementation")
@Serializable
public data class TerminologyCapabilitiesImplementation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Describes this specific instance
   */
  public val description: String? = null,
  /**
   * Base URL for the implementation
   */
  public val url: String? = null,
) : BackboneElement
