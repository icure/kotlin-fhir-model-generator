//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.backboneelement

import io.icure.fhir.mapping.domain.fhir.r6.Element
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
