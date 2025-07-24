//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.evidencevariable

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A grouping for ordinal or polychotomous variables
 *
 * A grouping for ordinal or polychotomous variables.
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
