//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.communicationrequest

import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Message payload
 *
 * Text, attachment(s), or resource(s) to be communicated to the recipient.
 *
 * @param id Unique id for inter-element referencing
 * @param contentAttachment Message part content
 * @param contentReference Message part content
 * @param contentCodeableConcept Message part content
 */
@SerialName("CommunicationRequestPayload")
@Serializable
public data class CommunicationRequestPayload(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Message part content
   */
  public val contentAttachment: Attachment? = null,
  /**
   * Message part content
   */
  public val contentReference: Reference? = null,
  /**
   * Message part content
   */
  public val contentCodeableConcept: CodeableConcept? = null,
) : BackboneElement
