//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4

import kotlin.String
import kotlinx.serialization.Serializable

/**
 * Base Resource
 *
 * This is the base resource type for everything.
 */
@Serializable(with = ResourceSerializer::class)
public interface Resource {
  /**
   * Logical id of this artifact
   */
  public val id: String?

  /**
   * A set of rules under which this content was created
   */
  public val implicitRules: String?

  /**
   * Language of the resource content
   */
  public val language: String?

  /**
   * Metadata about the resource
   */
  public val meta: Meta?
}
