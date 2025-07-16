//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.messageheader

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
) : BackboneElement
