//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.messageheader

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * If this is a reply to prior message
 *
 * Information about the message that this message is a response to.  Only present if this message
 * is a response.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Id of original message
 * @param code ok | transient-error | fatal-error
 * @param details Specific list of hints/warnings/errors
 */
@SerialName("MessageHeaderResponse")
@Serializable
public data class MessageHeaderResponse(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Id of original message
   */
  public val identifier: String? = null,
  /**
   * ok | transient-error | fatal-error
   */
  public val code: String? = null,
  /**
   * Specific list of hints/warnings/errors
   */
  public val details: Reference? = null,
) : BackboneElement
