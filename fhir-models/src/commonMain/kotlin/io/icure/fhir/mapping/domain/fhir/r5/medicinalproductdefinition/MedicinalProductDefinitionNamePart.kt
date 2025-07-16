//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.medicinalproductdefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
@SerialName("MedicinalProductDefinitionNamePart")
@Serializable
public data class MedicinalProductDefinitionNamePart(
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
