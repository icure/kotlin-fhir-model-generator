//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.specimendefinition

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The specimen's container
 *
 * The specimen's container.
 *
 * @param id Unique id for inter-element referencing
 * @param material Container material
 * @param type Kind of container associated with the kind of specimen
 * @param cap Color of container cap
 * @param description Container description
 * @param capacity Container capacity
 * @param minimumVolumeQuantity Minimum volume
 * @param minimumVolumeString Minimum volume
 * @param preparation Specimen container preparation
 */
@SerialName("SpecimenDefinitionTypeTestedContainer")
@Serializable
public data class SpecimenDefinitionTypeTestedContainer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Container material
   */
  public val material: CodeableConcept? = null,
  /**
   * Kind of container associated with the kind of specimen
   */
  public val type: CodeableConcept? = null,
  /**
   * Color of container cap
   */
  public val cap: CodeableConcept? = null,
  /**
   * Container description
   */
  public val description: String? = null,
  /**
   * Container capacity
   */
  public val capacity: Quantity? = null,
  /**
   * Minimum volume
   */
  public val minimumVolumeQuantity: Quantity? = null,
  /**
   * Minimum volume
   */
  public val minimumVolumeString: String? = null,
  public val additive: List<SpecimenDefinitionTypeTestedContainerAdditive> = emptyList(),
  /**
   * Specimen container preparation
   */
  public val preparation: String? = null,
) : BackboneElement
