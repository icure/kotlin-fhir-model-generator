//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.documentreference

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Content profile rules for the document
 *
 * An identifier of the document constraints, encoding, structure, and template that the document
 * conforms to beyond the base format indicated in the mimeType.
 *
 * @param id Unique id for inter-element referencing
 * @param valueCoding Code|uri|canonical
 * @param valueUri Code|uri|canonical
 * @param valueCanonical Code|uri|canonical
 */
@SerialName("DocumentReferenceContentProfile")
@Serializable
public data class DocumentReferenceContentProfile(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code|uri|canonical
   */
  public val valueCoding: Coding? = null,
  /**
   * Code|uri|canonical
   */
  public val valueUri: String? = null,
  /**
   * Code|uri|canonical
   */
  public val valueCanonical: String? = null,
) : BackboneElement
