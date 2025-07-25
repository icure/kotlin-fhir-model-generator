//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.medicinalproductdefinition

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Key product features such as "sugar free", "modified release"
 *
 * Allows the key product features to be recorded, such as "sugar free", "modified release",
 * "parallel import".
 *
 * @param id Unique id for inter-element referencing
 * @param type A code expressing the type of characteristic
 * @param valueCodeableConcept A value for the characteristic
 * @param valueMarkdown A value for the characteristic
 * @param valueQuantity A value for the characteristic
 * @param valueInteger A value for the characteristic
 * @param valueDate A value for the characteristic
 * @param valueBoolean A value for the characteristic
 * @param valueAttachment A value for the characteristic
 */
@SerialName("MedicinalProductDefinitionCharacteristic")
@Serializable
public data class MedicinalProductDefinitionCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A code expressing the type of characteristic
   */
  public val type: CodeableConcept,
  /**
   * A value for the characteristic
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * A value for the characteristic
   */
  public val valueMarkdown: String? = null,
  /**
   * A value for the characteristic
   */
  public val valueQuantity: Quantity? = null,
  /**
   * A value for the characteristic
   */
  public val valueInteger: Int? = null,
  /**
   * A value for the characteristic
   */
  public val valueDate: String? = null,
  /**
   * A value for the characteristic
   */
  public val valueBoolean: Boolean? = null,
  /**
   * A value for the characteristic
   */
  public val valueAttachment: Attachment? = null,
) : BackboneElement
