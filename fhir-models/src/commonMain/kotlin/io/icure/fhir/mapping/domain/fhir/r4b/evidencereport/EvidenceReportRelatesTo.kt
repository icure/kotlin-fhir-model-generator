//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.evidencereport

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param targetIdentifier Target of the relationship
 * @param targetReference Target of the relationship
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
  public val targetIdentifier: Identifier? = null,
  /**
   * Target of the relationship
   */
  public val targetReference: Reference? = null,
) : BackboneElement
