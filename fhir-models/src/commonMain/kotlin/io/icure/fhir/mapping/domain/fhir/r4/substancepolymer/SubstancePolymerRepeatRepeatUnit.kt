//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancepolymer

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.substanceamount.SubstanceAmount
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Todo
 *
 * Todo.
 *
 * @param id Unique id for inter-element referencing
 * @param orientationOfPolymerisation Todo
 * @param repeatUnit Todo
 * @param amount Todo
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
   * Todo
   */
  public val orientationOfPolymerisation: CodeableConcept? = null,
  /**
   * Todo
   */
  public val repeatUnit: String? = null,
  /**
   * Todo
   */
  public val amount: SubstanceAmount? = null,
  public val degreeOfPolymerisation: List<SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation> =
      emptyList(),
  public val structuralRepresentation:
      List<SubstancePolymerRepeatRepeatUnitStructuralRepresentation> = emptyList(),
) : BackboneElement
