//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5

import com.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Metadata about a resource
 *
 * The metadata about a resource. This is content in the resource that is maintained by the
 * infrastructure. Changes to the content might not always be associated with version changes to the
 * resource.
 *
 * @param id Unique id for inter-element referencing
 * @param versionId Version specific identifier
 * @param lastUpdated When the resource version last changed
 * @param source Identifies where the resource comes from
 */
@SerialName("Meta")
@Serializable
public data class Meta(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Version specific identifier
   */
  public val versionId: String? = null,
  /**
   * When the resource version last changed
   */
  public val lastUpdated: String? = null,
  /**
   * Identifies where the resource comes from
   */
  public val source: String? = null,
  public val profile: List<String> = emptyList(),
  public val security: List<Coding> = emptyList(),
  public val tag: List<Coding> = emptyList(),
) : DataType
