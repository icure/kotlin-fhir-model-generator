//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.documentreference

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Relationships to other documents
 *
 * Relationships that this document has with other document references that already exist.
 *
 * @param id Unique id for inter-element referencing
 * @param code replaces | transforms | signs | appends
 * @param target Target of the relationship
 */
@SerialName("DocumentReferenceRelatesTo")
@Serializable
public data class DocumentReferenceRelatesTo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * replaces | transforms | signs | appends
   */
  public val code: String? = null,
  /**
   * Target of the relationship
   */
  public val target: Reference,
) : BackboneElement
