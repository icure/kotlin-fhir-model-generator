//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.messageheader

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param identifier Bundle.identifier of original message
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
   * Bundle.identifier of original message
   */
  public val identifier: Identifier,
  /**
   * ok | transient-error | fatal-error
   */
  public val code: String? = null,
  /**
   * Specific list of hints/warnings/errors
   */
  public val details: Reference? = null,
) : BackboneElement
