//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.documentreference

import com.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Document referenced
 *
 * The document and format referenced. There may be multiple content element repetitions, each with
 * a different format.
 *
 * @param id Unique id for inter-element referencing
 * @param attachment Where to access the document
 * @param format Format/content rules for the document
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
  /**
   * Format/content rules for the document
   */
  public val format: Coding? = null,
) : BackboneElement
