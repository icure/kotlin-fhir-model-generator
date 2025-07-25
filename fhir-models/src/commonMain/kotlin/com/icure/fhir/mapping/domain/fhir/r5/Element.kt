//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5

import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List

/**
 * Base for all elements
 *
 * Base definition for all elements in a resource.
 */
public interface Element : Base {
  public val extension: List<Extension>

  /**
   * Unique id for inter-element referencing
   */
  public val id: String?
}
