//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.attachment

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Content in a format defined elsewhere
 *
 * For referring to data content defined in other formats.
 *
 * @param id Unique id for inter-element referencing
 * @param contentType Mime type of the content, with charset etc.
 * @param language Human language of the content (BCP-47)
 * @param data Data inline, base64ed
 * @param url Uri where the data can be found
 * @param size Number of bytes of content (if url provided)
 * @param hash Hash of the data (sha-1, base64ed)
 * @param title Label to display in place of the data
 * @param creation Date attachment was first created
 */
@SerialName("Attachment")
@Serializable
public data class Attachment(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Mime type of the content, with charset etc.
   */
  public val contentType: String? = null,
  /**
   * Human language of the content (BCP-47)
   */
  public val language: String? = null,
  /**
   * Data inline, base64ed
   */
  public val `data`: String? = null,
  /**
   * Uri where the data can be found
   */
  public val url: String? = null,
  /**
   * Number of bytes of content (if url provided)
   */
  public val size: Int? = null,
  /**
   * Hash of the data (sha-1, base64ed)
   */
  public val hash: String? = null,
  /**
   * Label to display in place of the data
   */
  public val title: String? = null,
  /**
   * Date attachment was first created
   */
  public val creation: String? = null,
) : Element
