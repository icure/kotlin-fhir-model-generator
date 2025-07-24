//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.contract

import com.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contract Legal Language
 *
 * List of Legal expressions or representations of this Contract.
 *
 * @param id Unique id for inter-element referencing
 * @param contentAttachment Contract Legal Text
 * @param contentReference Contract Legal Text
 */
@SerialName("ContractLegal")
@Serializable
public data class ContractLegal(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Contract Legal Text
   */
  public val contentAttachment: Attachment? = null,
  /**
   * Contract Legal Text
   */
  public val contentReference: Reference? = null,
) : BackboneElement
