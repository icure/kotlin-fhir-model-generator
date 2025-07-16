//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.specimendefinition

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param material The material type used for the container
 * @param type Kind of container associated with the kind of specimen
 * @param cap Color of container cap
 * @param description The description of the kind of container
 * @param capacity The capacity of this kind of container
 * @param minimumVolumeQuantity Minimum volume
 * @param minimumVolumeString Minimum volume
 * @param preparation Special processing applied to the container for this specimen type
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
   * The material type used for the container
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
   * The description of the kind of container
   */
  public val description: String? = null,
  /**
   * The capacity of this kind of container
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
   * Special processing applied to the container for this specimen type
   */
  public val preparation: String? = null,
) : BackboneElement
