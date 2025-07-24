//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductpackaged

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Batch numbering
 *
 * Batch numbering.
 *
 * @param id Unique id for inter-element referencing
 * @param outerPackaging A number appearing on the outer packaging of a specific batch
 * @param immediatePackaging A number appearing on the immediate packaging (and not the outer
 * packaging)
 */
@SerialName("MedicinalProductPackagedBatchIdentifier")
@Serializable
public data class MedicinalProductPackagedBatchIdentifier(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A number appearing on the outer packaging of a specific batch
   */
  public val outerPackaging: Identifier,
  /**
   * A number appearing on the immediate packaging (and not the outer packaging)
   */
  public val immediatePackaging: Identifier? = null,
) : BackboneElement
