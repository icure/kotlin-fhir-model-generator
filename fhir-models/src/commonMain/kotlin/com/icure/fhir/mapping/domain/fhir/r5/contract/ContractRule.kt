//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.contract

import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
