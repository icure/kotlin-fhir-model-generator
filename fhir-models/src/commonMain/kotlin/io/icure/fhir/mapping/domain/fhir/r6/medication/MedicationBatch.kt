//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medication

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param lotNumber Identifier assigned to batch
 * @param expirationDate When batch will expire
 */
@SerialName("MedicationBatch")
@Serializable
public data class MedicationBatch(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifier assigned to batch
   */
  public val lotNumber: String? = null,
  /**
   * When batch will expire
   */
  public val expirationDate: String? = null,
) : BackboneElement
