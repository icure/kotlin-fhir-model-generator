//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.messagedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Responses to this message
 *
 * Indicates what types of messages may be sent as an application-level response to this message.
 *
 * @param id Unique id for inter-element referencing
 * @param message Reference to allowed message definition response
 * @param situation When should this response be used
 */
@SerialName("MessageDefinitionAllowedResponse")
@Serializable
public data class MessageDefinitionAllowedResponse(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to allowed message definition response
   */
  public val message: String? = null,
  /**
   * When should this response be used
   */
  public val situation: String? = null,
) : BackboneElement
