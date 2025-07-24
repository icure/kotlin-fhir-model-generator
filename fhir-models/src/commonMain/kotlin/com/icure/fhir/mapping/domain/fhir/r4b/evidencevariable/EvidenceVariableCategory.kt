//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.evidencevariable

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A grouping for ordinal or polychotomous variables
 *
 * A grouping (or set of values) described along with other groupings to specify the set of
 * groupings allowed for the variable.
 *
 * @param id Unique id for inter-element referencing
 * @param name Description of the grouping
 * @param valueCodeableConcept Definition of the grouping
 * @param valueQuantity Definition of the grouping
 * @param valueRange Definition of the grouping
 */
@SerialName("EvidenceVariableCategory")
@Serializable
public data class EvidenceVariableCategory(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of the grouping
   */
  public val name: String? = null,
  /**
   * Definition of the grouping
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Definition of the grouping
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Definition of the grouping
   */
  public val valueRange: Range? = null,
) : BackboneElement
