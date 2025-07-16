//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6

import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
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
