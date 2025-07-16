//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.backboneelement

import io.icure.fhir.mapping.domain.fhir.r4.Element
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.collections.List

/**
 * Base for elements defined inside a resource
 *
 * Base definition for all elements that are defined inside a resource - but not those in a data
 * type.
 */
public interface BackboneElement : Element {
  public val modifierExtension: List<Extension>
}
