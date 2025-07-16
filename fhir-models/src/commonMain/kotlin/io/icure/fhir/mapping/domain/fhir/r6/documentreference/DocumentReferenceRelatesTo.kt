//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.documentreference

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
