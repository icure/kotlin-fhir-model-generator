//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.measure

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Population criteria group
 *
 * A group of population criteria for the measure.
 *
 * @param id Unique id for inter-element referencing
 * @param code Meaning of the group
 * @param description Summary description
 */
@SerialName("MeasureGroup")
@Serializable
public data class MeasureGroup(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Meaning of the group
   */
  public val code: CodeableConcept? = null,
  /**
   * Summary description
   */
  public val description: String? = null,
  public val population: List<MeasureGroupPopulation> = emptyList(),
  public val stratifier: List<MeasureGroupStratifier> = emptyList(),
) : BackboneElement
