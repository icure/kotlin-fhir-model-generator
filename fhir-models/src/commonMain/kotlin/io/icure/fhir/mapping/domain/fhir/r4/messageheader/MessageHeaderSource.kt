//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.messageheader

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
 * @param name Name of system
 * @param software Name of software running the system
 * @param version Version of software running
 * @param contact Human contact for problems
 * @param endpoint Actual message source address or id
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
   * Actual message source address or id
   */
  public val endpoint: String? = null,
) : BackboneElement
