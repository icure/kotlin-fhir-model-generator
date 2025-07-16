//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.contract

import io.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
