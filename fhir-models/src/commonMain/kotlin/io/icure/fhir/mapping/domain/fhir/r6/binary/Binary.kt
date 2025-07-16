//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.binary

import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Pure binary content defined by a format other than FHIR
 *
 * A resource that represents the data of a single raw artifact as digital content accessible in its
 * native format.  A Binary resource can contain any content, whether text, image, pdf, zip archive,
 * etc.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param contentType MimeType of the binary content
 * @param securityContext Identifies another resource to use as proxy when enforcing access control
 * @param data The actual content
 */
@SerialName("Binary")
@Serializable
public data class Binary(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * MimeType of the binary content
   */
  public val contentType: String? = null,
  /**
   * Identifies another resource to use as proxy when enforcing access control
   */
  public val securityContext: Reference? = null,
  /**
   * The actual content
   */
  public val `data`: String? = null,
) : Resource
