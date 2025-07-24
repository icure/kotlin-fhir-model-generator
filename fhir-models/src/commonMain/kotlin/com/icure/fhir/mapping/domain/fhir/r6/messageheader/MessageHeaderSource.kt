//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.messageheader

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Message source application
 *
 * The source application from which this message originated.
 *
 * @param id Unique id for inter-element referencing
 * @param endpointUrl Actual source address or Endpoint resource
 * @param endpointReference Actual source address or Endpoint resource
 * @param name Name of system
 * @param software Name of software running the system
 * @param version Version of software running
 * @param contact Human contact for problems
 * @param sender Real world sender of the message
 */
@SerialName("MessageHeaderSource")
@Serializable
public data class MessageHeaderSource(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Actual source address or Endpoint resource
   */
  public val endpointUrl: String? = null,
  /**
   * Actual source address or Endpoint resource
   */
  public val endpointReference: Reference? = null,
  /**
   * Name of system
   */
  public val name: String? = null,
  /**
   * Name of software running the system
   */
  public val software: String? = null,
  /**
   * Version of software running
   */
  public val version: String? = null,
  /**
   * Human contact for problems
   */
  public val contact: ContactPoint? = null,
  /**
   * Real world sender of the message
   */
  public val sender: Reference? = null,
) : BackboneElement
