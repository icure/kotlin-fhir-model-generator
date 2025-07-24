//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.evidencereport

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Relationships to other compositions/documents
 *
 * Relationships that this composition has with other compositions or documents that already exist.
 *
 * @param id Unique id for inter-element referencing
 * @param code replaces | amends | appends | transforms | replacedWith | amendedWith | appendedWith
 * | transformedWith
 * @param target Target of the relationship
 */
@SerialName("EvidenceReportRelatesTo")
@Serializable
public data class EvidenceReportRelatesTo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * replaces | amends | appends | transforms | replacedWith | amendedWith | appendedWith |
   * transformedWith
   */
  public val code: String? = null,
  /**
   * Target of the relationship
   */
  public val target: EvidenceReportRelatesToTarget,
) : BackboneElement
