//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.capabilitystatement

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Software that is covered by this capability statement
 *
 * Software that is covered by this capability statement.  It is used when the capability statement
 * describes the capabilities of a particular software version, independent of an installation.
 *
 * @param id Unique id for inter-element referencing
 * @param name A name the software is known by
 * @param version Version covered by this statement
 * @param releaseDate Date this version was released
 */
@SerialName("CapabilityStatementSoftware")
@Serializable
public data class CapabilityStatementSoftware(
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
  /**
   * Date this version was released
   */
  public val releaseDate: String? = null,
) : BackboneElement
