//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.documentreference

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
