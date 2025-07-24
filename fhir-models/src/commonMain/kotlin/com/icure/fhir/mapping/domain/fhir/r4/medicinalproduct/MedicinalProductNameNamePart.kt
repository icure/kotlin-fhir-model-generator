//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproduct

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Coding words or phrases of the name
 *
 * Coding words or phrases of the name.
 *
 * @param id Unique id for inter-element referencing
 * @param part A fragment of a product name
 * @param type Idenifying type for this part of the name (e.g. strength part)
 */
@SerialName("MedicinalProductNameNamePart")
@Serializable
public data class MedicinalProductNameNamePart(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A fragment of a product name
   */
  public val part: String? = null,
  /**
   * Idenifying type for this part of the name (e.g. strength part)
   */
  public val type: Coding,
) : BackboneElement
