//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancepolymer

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.substanceamount.SubstanceAmount
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
 * @param degree Todo
 * @param amount Todo
 */
@SerialName("SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation")
@Serializable
public data class SubstancePolymerRepeatRepeatUnitDegreeOfPolymerisation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Todo
   */
  public val degree: CodeableConcept? = null,
  /**
   * Todo
   */
  public val amount: SubstanceAmount? = null,
) : BackboneElement
