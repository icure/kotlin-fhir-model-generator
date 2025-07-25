//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.messageheader

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Message destination application(s)
 *
 * The destination application which the message is intended for.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name of system
 * @param target Particular delivery destination within the destination
 * @param endpoint Actual destination address or id
 * @param receiver Intended "real-world" recipient for the data
 */
@SerialName("MessageHeaderDestination")
@Serializable
public data class MessageHeaderDestination(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of system
   */
  public val name: String? = null,
  /**
   * Particular delivery destination within the destination
   */
  public val target: Reference? = null,
  /**
   * Actual destination address or id
   */
  public val endpoint: String? = null,
  /**
   * Intended "real-world" recipient for the data
   */
  public val `receiver`: Reference? = null,
) : BackboneElement
