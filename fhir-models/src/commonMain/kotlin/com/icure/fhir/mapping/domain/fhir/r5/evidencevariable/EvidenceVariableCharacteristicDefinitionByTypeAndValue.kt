//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.evidencevariable

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defines the characteristic using type and value
 *
 * Defines the characteristic using both a type and value[x] elements.
 *
 * @param id Unique id for inter-element referencing
 * @param type Expresses the type of characteristic
 * @param device Device used for determining characteristic
 * @param valueCodeableConcept Defines the characteristic when coupled with characteristic.type
 * @param valueBoolean Defines the characteristic when coupled with characteristic.type
 * @param valueQuantity Defines the characteristic when coupled with characteristic.type
 * @param valueRange Defines the characteristic when coupled with characteristic.type
 * @param valueReference Defines the characteristic when coupled with characteristic.type
 * @param valueId Defines the characteristic when coupled with characteristic.type
 * @param offset Reference point for valueQuantity or valueRange
 */
@SerialName("EvidenceVariableCharacteristicDefinitionByTypeAndValue")
@Serializable
public data class EvidenceVariableCharacteristicDefinitionByTypeAndValue(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Expresses the type of characteristic
   */
  public val type: CodeableConcept,
  public val method: List<CodeableConcept> = emptyList(),
  /**
   * Device used for determining characteristic
   */
  public val device: Reference? = null,
  /**
   * Defines the characteristic when coupled with characteristic.type
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Defines the characteristic when coupled with characteristic.type
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Defines the characteristic when coupled with characteristic.type
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Defines the characteristic when coupled with characteristic.type
   */
  public val valueRange: Range? = null,
  /**
   * Defines the characteristic when coupled with characteristic.type
   */
  public val valueReference: Reference? = null,
  /**
   * Defines the characteristic when coupled with characteristic.type
   */
  public val valueId: String? = null,
  /**
   * Reference point for valueQuantity or valueRange
   */
  public val offset: CodeableConcept? = null,
) : BackboneElement
