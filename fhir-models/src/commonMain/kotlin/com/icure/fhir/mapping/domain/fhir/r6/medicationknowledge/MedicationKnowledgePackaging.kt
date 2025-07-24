//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationknowledge

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
 * @param packagedProduct The packaged medication that is being priced
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
  public val cost: List<MedicationKnowledgeCost> = emptyList(),
  /**
   * The packaged medication that is being priced
   */
  public val packagedProduct: Reference? = null,
) : BackboneElement
