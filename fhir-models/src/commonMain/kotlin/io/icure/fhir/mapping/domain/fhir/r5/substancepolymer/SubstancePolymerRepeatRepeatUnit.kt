//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.substancepolymer

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An SRU - Structural Repeat Unit
 *
 * An SRU - Structural Repeat Unit.
 *
 * @param id Unique id for inter-element referencing
 * @param unit Structural repeat units are essential elements for defining polymers
 * @param orientation The orientation of the polymerisation, e.g. head-tail, head-head, random
 * @param amount Number of repeats of this unit
 */
@SerialName("SubstancePolymerRepeatRepeatUnit")
@Serializable
public data class SubstancePolymerRepeatRepeatUnit(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Structural repeat units are essential elements for defining polymers
   */
  public val unit: String? = null,
  /**
   * The orientation of the polymerisation, e.g. head-tail, head-head, random
   */
  public val orientation: CodeableConcept? = null,
  /**
   * Number of repeats of this unit
   */
  public val amount: Int? = null,
  public val degreeOfPolymerisation: List<SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation> =
      emptyList(),
  public val structuralRepresentation:
      List<SubstancePolymerRepeatRepeatUnitStructuralRepresentation> = emptyList(),
) : BackboneElement
