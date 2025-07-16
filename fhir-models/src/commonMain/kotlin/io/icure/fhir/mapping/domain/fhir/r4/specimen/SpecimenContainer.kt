//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.specimen

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
 * @param description Textual description of the container
 * @param type Kind of container directly associated with specimen
 * @param capacity Container volume or size
 * @param specimenQuantity Quantity of specimen within container
 * @param additiveCodeableConcept Additive associated with container
 * @param additiveReference Additive associated with container
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Textual description of the container
   */
  public val description: String? = null,
  /**
   * Kind of container directly associated with specimen
   */
  public val type: CodeableConcept? = null,
  /**
   * Container volume or size
   */
  public val capacity: Quantity? = null,
  /**
   * Quantity of specimen within container
   */
  public val specimenQuantity: Quantity? = null,
  /**
   * Additive associated with container
   */
  public val additiveCodeableConcept: CodeableConcept? = null,
  /**
   * Additive associated with container
   */
  public val additiveReference: Reference? = null,
) : BackboneElement
