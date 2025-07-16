//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5

import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
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
