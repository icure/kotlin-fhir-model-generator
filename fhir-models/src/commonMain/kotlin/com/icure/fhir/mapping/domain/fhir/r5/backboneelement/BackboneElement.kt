//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.backboneelement

import com.icure.fhir.mapping.domain.fhir.r5.Element
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
