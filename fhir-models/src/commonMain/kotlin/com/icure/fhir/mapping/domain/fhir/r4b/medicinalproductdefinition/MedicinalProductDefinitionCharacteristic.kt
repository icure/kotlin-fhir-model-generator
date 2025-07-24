//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medicinalproductdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
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
 * @param valueQuantity A value for the characteristic
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
  public val valueQuantity: Quantity? = null,
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
