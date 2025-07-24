//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.documentreference

import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Document referenced
 *
 * The document and format referenced.  If there are multiple content element repetitions, these
 * must all represent the same document in different format, or attachment metadata.
 *
 * @param id Unique id for inter-element referencing
 * @param attachment Where to access the document
 */
@SerialName("DocumentReferenceContent")
@Serializable
public data class DocumentReferenceContent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Where to access the document
   */
  public val attachment: Attachment,
  public val profile: List<DocumentReferenceContentProfile> = emptyList(),
) : BackboneElement
