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
 * Applies to homopolymer and block co-polymers where the degree of polymerisation within a block
 * can be described
 *
 * Applies to homopolymer and block co-polymers where the degree of polymerisation within a block
 * can be described.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of the degree of polymerisation shall be described, e.g. SRU/Polymer Ratio
 * @param average An average amount of polymerisation
 * @param low A low expected limit of the amount
 * @param high A high expected limit of the amount
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
   * The type of the degree of polymerisation shall be described, e.g. SRU/Polymer Ratio
   */
  public val type: CodeableConcept? = null,
  /**
   * An average amount of polymerisation
   */
  public val average: Int? = null,
  /**
   * A low expected limit of the amount
   */
  public val low: Int? = null,
  /**
   * A high expected limit of the amount
   */
  public val high: Int? = null,
) : BackboneElement
