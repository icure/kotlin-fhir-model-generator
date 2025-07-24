//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.specimen

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Direct container of specimen (tube/slide, etc.)
 *
 * The container holding the specimen.  The recursive nature of containers; i.e. blood in tube in
 * tray in rack is not addressed here.
 *
 * @param id Unique id for inter-element referencing
 * @param device Device resource for the container
 * @param location Where the container is
 * @param specimenQuantity Quantity of specimen within container
 */
@SerialName("SpecimenContainer")
@Serializable
public data class SpecimenContainer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Device resource for the container
   */
  public val device: Reference,
  /**
   * Where the container is
   */
  public val location: Reference? = null,
  /**
   * Quantity of specimen within container
   */
  public val specimenQuantity: Quantity? = null,
) : BackboneElement
