//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.documentreference

import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
