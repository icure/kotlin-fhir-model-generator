//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicationknowledge

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details about packaged medications
 *
 * Information that only applies to packages (not products).
 *
 * @param id Unique id for inter-element referencing
 * @param type A code that defines the specific type of packaging that the medication can be found
 * in
 * @param quantity The number of product units the package would contain if fully loaded
 */
@SerialName("MedicationKnowledgePackaging")
@Serializable
public data class MedicationKnowledgePackaging(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A code that defines the specific type of packaging that the medication can be found in
   */
  public val type: CodeableConcept? = null,
  /**
   * The number of product units the package would contain if fully loaded
   */
  public val quantity: Quantity? = null,
) : BackboneElement
