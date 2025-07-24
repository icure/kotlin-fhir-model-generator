//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.medicinalproductdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 * @param type Identifying type for this part of the name (e.g. strength part)
 */
@SerialName("MedicinalProductDefinitionNameNamePart")
@Serializable
public data class MedicinalProductDefinitionNameNamePart(
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
   * Identifying type for this part of the name (e.g. strength part)
   */
  public val type: CodeableConcept,
) : BackboneElement
