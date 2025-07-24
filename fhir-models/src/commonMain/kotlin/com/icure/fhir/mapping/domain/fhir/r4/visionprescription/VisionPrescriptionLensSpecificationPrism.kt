//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.visionprescription

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Eye alignment compensation
 *
 * Allows for adjustment on two axis.
 *
 * @param id Unique id for inter-element referencing
 * @param amount Amount of adjustment
 * @param base up | down | in | out
 */
@SerialName("VisionPrescriptionLensSpecificationPrism")
@Serializable
public data class VisionPrescriptionLensSpecificationPrism(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Amount of adjustment
   */
  public val amount: Float? = null,
  /**
   * up | down | in | out
   */
  public val base: String? = null,
) : BackboneElement
