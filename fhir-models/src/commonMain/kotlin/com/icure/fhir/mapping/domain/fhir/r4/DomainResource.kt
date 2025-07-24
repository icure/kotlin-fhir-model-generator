//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4

import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import kotlin.collections.List

/**
 * A resource with narrative, extensions, and contained resources
 *
 * A resource that includes narrative, extensions, and contained resources.
 */
public interface DomainResource : Resource {
  public val contained: List<Resource>

  public val extension: List<Extension>

  public val modifierExtension: List<Extension>

  /**
   * Text summary of the resource, for human interpretation
   */
  public val text: Narrative?
}
