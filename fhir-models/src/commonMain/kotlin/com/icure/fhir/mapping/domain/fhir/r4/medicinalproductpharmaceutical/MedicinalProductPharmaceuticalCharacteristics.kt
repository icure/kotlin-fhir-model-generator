//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductpharmaceutical

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Characteristics e.g. a products onset of action
 *
 * Characteristics e.g. a products onset of action.
 *
 * @param id Unique id for inter-element referencing
 * @param code A coded characteristic
 * @param status The status of characteristic e.g. assigned or pending
 */
@SerialName("MedicinalProductPharmaceuticalCharacteristics")
@Serializable
public data class MedicinalProductPharmaceuticalCharacteristics(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A coded characteristic
   */
  public val code: CodeableConcept,
  /**
   * The status of characteristic e.g. assigned or pending
   */
  public val status: CodeableConcept? = null,
) : BackboneElement
