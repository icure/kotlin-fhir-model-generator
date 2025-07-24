//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.backbonetype

import com.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.collections.List

/**
 * Base for datatypes that can carry modifier extensions
 *
 * Base definition for the few data types that are allowed to carry modifier extensions.
 */
public interface BackboneType : DataType {
  public val modifierExtension: List<Extension>
}
