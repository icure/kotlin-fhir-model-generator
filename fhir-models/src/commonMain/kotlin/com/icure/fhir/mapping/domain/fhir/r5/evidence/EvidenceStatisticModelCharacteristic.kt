//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.evidence

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An aspect of the statistical model
 *
 * A component of the method to generate the statistic.
 *
 * @param id Unique id for inter-element referencing
 * @param code Model specification
 * @param value Numerical value to complete model specification
 */
@SerialName("EvidenceStatisticModelCharacteristic")
@Serializable
public data class EvidenceStatisticModelCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Model specification
   */
  public val code: CodeableConcept,
  /**
   * Numerical value to complete model specification
   */
  public val `value`: Quantity? = null,
  public val variable: List<EvidenceStatisticModelCharacteristicVariable> = emptyList(),
  public val attributeEstimate: List<EvidenceStatisticAttributeEstimate> = emptyList(),
) : BackboneElement
