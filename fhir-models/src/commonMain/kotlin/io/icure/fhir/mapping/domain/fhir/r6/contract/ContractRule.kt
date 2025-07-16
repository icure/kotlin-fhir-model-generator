//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.contract

import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Computable Contract Language
 *
 * List of Computable Policy Rule Language Representations of this Contract.
 *
 * @param id Unique id for inter-element referencing
 * @param contentAttachment Computable Contract Rules
 * @param contentReference Computable Contract Rules
 */
@SerialName("ContractRule")
@Serializable
public data class ContractRule(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Computable Contract Rules
   */
  public val contentAttachment: Attachment? = null,
  /**
   * Computable Contract Rules
   */
  public val contentReference: Reference? = null,
) : BackboneElement
