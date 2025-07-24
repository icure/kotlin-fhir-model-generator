//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.documentreference

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param code The relationship type with another document
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
   * The relationship type with another document
   */
  public val code: CodeableConcept,
  /**
   * Target of the relationship
   */
  public val target: Reference,
) : BackboneElement
