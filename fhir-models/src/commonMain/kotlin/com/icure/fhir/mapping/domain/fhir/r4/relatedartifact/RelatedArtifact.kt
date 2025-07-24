//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.relatedartifact

import com.icure.fhir.mapping.domain.fhir.r4.Element
import com.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Related artifacts for a knowledge resource
 *
 * Related artifacts such as additional documentation, justification, or bibliographic references.
 *
 * @param id Unique id for inter-element referencing
 * @param type documentation | justification | citation | predecessor | successor | derived-from |
 * depends-on | composed-of
 * @param label Short label
 * @param display Brief description of the related artifact
 * @param citation Bibliographic citation for the artifact
 * @param url Where the artifact can be accessed
 * @param document What document is being referenced
 * @param resource What resource is being referenced
 */
@SerialName("RelatedArtifact")
@Serializable
public data class RelatedArtifact(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * documentation | justification | citation | predecessor | successor | derived-from | depends-on
   * | composed-of
   */
  public val type: String? = null,
  /**
   * Short label
   */
  public val label: String? = null,
  /**
   * Brief description of the related artifact
   */
  public val display: String? = null,
  /**
   * Bibliographic citation for the artifact
   */
  public val citation: String? = null,
  /**
   * Where the artifact can be accessed
   */
  public val url: String? = null,
  /**
   * What document is being referenced
   */
  public val document: Attachment? = null,
  /**
   * What resource is being referenced
   */
  public val resource: String? = null,
) : Element
