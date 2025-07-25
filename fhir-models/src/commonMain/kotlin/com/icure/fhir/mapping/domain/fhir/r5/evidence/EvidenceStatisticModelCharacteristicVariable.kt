//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.evidence

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A variable adjusted for in the adjusted analysis
 *
 * A variable adjusted for in the adjusted analysis.
 *
 * @param id Unique id for inter-element referencing
 * @param variableDefinition Description of the variable
 * @param handling continuous | dichotomous | ordinal | polychotomous
 */
@SerialName("EvidenceStatisticModelCharacteristicVariable")
@Serializable
public data class EvidenceStatisticModelCharacteristicVariable(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of the variable
   */
  public val variableDefinition: Reference,
  /**
   * continuous | dichotomous | ordinal | polychotomous
   */
  public val handling: String? = null,
  public val valueCategory: List<CodeableConcept> = emptyList(),
  public val valueQuantity: List<Quantity> = emptyList(),
  public val valueRange: List<Range> = emptyList(),
) : BackboneElement
