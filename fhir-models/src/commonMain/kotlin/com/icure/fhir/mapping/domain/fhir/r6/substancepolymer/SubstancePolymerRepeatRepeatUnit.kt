//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.substancepolymer

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
