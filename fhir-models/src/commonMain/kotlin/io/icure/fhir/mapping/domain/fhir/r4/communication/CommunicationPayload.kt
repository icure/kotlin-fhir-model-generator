//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.communication

import io.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Message payload
 *
 * Text, attachment(s), or resource(s) that was communicated to the recipient.
 *
 * @param id Unique id for inter-element referencing
 * @param contentString Message part content
 * @param contentAttachment Message part content
 * @param contentReference Message part content
 */
@SerialName("CommunicationPayload")
@Serializable
public data class CommunicationPayload(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Message part content
   */
  public val contentString: String? = null,
  /**
   * Message part content
   */
  public val contentAttachment: Attachment? = null,
  /**
   * Message part content
   */
  public val contentReference: Reference? = null,
) : BackboneElement
