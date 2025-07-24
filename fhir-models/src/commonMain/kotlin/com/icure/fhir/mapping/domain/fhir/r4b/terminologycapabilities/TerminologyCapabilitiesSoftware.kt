//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.terminologycapabilities

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Software that is covered by this terminology capability statement
 *
 * Software that is covered by this terminology capability statement.  It is used when the statement
 * describes the capabilities of a particular software version, independent of an installation.
 *
 * @param id Unique id for inter-element referencing
 * @param name A name the software is known by
 * @param version Version covered by this statement
 */
@SerialName("TerminologyCapabilitiesSoftware")
@Serializable
public data class TerminologyCapabilitiesSoftware(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A name the software is known by
   */
  public val name: String? = null,
  /**
   * Version covered by this statement
   */
  public val version: String? = null,
) : BackboneElement
