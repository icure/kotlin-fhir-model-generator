//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b

import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
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
