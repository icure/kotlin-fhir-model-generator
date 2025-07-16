//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.capabilitystatement

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
