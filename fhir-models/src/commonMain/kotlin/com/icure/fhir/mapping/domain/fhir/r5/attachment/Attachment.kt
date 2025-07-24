//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.attachment

import com.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Float
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
 * @param height Height of the image in pixels (photo/video)
 * @param width Width of the image in pixels (photo/video)
 * @param frames Number of frames if > 1 (photo)
 * @param duration Length in seconds (audio / video)
 * @param pages Number of printed pages
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
  /**
   * Height of the image in pixels (photo/video)
   */
  public val height: Int? = null,
  /**
   * Width of the image in pixels (photo/video)
   */
  public val width: Int? = null,
  /**
   * Number of frames if > 1 (photo)
   */
  public val frames: Int? = null,
  /**
   * Length in seconds (audio / video)
   */
  public val duration: Float? = null,
  /**
   * Number of printed pages
   */
  public val pages: Int? = null,
) : DataType
