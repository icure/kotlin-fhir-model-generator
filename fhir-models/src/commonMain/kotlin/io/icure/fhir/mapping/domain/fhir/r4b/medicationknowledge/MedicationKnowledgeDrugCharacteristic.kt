//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 */
@SerialName("MedicationKnowledgeDrugCharacteristic")
@Serializable
public data class MedicationKnowledgeDrugCharacteristic(
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
) : BackboneElement
