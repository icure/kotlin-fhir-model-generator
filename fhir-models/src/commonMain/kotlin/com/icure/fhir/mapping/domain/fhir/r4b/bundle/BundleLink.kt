//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.bundle

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Links related to this Bundle
 *
 * A series of links that provide context to this bundle.
 *
 * @param id Unique id for inter-element referencing
 * @param relation See
 * http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1
 * @param url Reference details for the link
 */
@SerialName("BundleLink")
@Serializable
public data class BundleLink(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * See http://www.iana.org/assignments/link-relations/link-relations.xhtml#link-relations-1
   */
  public val relation: String? = null,
  /**
   * Reference details for the link
   */
  public val url: String? = null,
) : BackboneElement
