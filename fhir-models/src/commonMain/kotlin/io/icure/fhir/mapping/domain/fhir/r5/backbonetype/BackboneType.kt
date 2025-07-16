//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.backbonetype

import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.collections.List

/**
 * Base for datatypes that can carry modifier extensions
 *
 * Base definition for the few data types that are allowed to carry modifier extensions.
 */
public interface BackboneType : DataType {
  public val modifierExtension: List<Extension>
}
