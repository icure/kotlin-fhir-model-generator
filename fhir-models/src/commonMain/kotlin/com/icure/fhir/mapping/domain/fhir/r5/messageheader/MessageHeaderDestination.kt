//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.messageheader

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param endpointUrl Actual destination address or Endpoint resource
 * @param endpointReference Actual destination address or Endpoint resource
 * @param name Name of system
 * @param target Particular delivery destination within the destination
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
   * Actual destination address or Endpoint resource
   */
  public val endpointUrl: String? = null,
  /**
   * Actual destination address or Endpoint resource
   */
  public val endpointReference: Reference? = null,
  /**
   * Name of system
   */
  public val name: String? = null,
  /**
   * Particular delivery destination within the destination
   */
  public val target: Reference? = null,
  /**
   * Intended "real-world" recipient for the data
   */
  public val `receiver`: Reference? = null,
) : BackboneElement
