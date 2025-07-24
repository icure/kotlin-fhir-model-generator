//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifies descriptive properties of the medicine
 *
 * Specifies descriptive properties of the medicine, such as color, shape, imprints, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param type Code specifying the type of characteristic of medication
 * @param valueCodeableConcept Description of the characteristic
 * @param valueString Description of the characteristic
 * @param valueQuantity Description of the characteristic
 * @param valueBase64Binary Description of the characteristic
 * @param valueAttachment Description of the characteristic
 */
@SerialName("MedicationKnowledgeDefinitionalDrugCharacteristic")
@Serializable
public data class MedicationKnowledgeDefinitionalDrugCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code specifying the type of characteristic of medication
   */
  public val type: CodeableConcept? = null,
  /**
   * Description of the characteristic
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Description of the characteristic
   */
  public val valueString: String? = null,
  /**
   * Description of the characteristic
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Description of the characteristic
   */
  public val valueBase64Binary: String? = null,
  /**
   * Description of the characteristic
   */
  public val valueAttachment: Attachment? = null,
) : BackboneElement
