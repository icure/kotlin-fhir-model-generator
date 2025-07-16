//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b

import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List

/**
 * Base for all elements
 *
 * Base definition for all elements in a resource.
 */
public interface Element {
  public val extension: List<Extension>

  /**
   * Unique id for inter-element referencing
   */
  public val id: String?
}
