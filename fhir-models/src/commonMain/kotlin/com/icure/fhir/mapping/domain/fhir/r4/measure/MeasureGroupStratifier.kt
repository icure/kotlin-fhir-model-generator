//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.measure

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Stratifier criteria for the measure
 *
 * The stratifier criteria for the measure report, specified as either the name of a valid CQL
 * expression defined within a referenced library or a valid FHIR Resource Path.
 *
 * @param id Unique id for inter-element referencing
 * @param code Meaning of the stratifier
 * @param description The human readable description of this stratifier
 * @param criteria How the measure should be stratified
 */
@SerialName("MeasureGroupStratifier")
@Serializable
public data class MeasureGroupStratifier(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Meaning of the stratifier
   */
  public val code: CodeableConcept? = null,
  /**
   * The human readable description of this stratifier
   */
  public val description: String? = null,
  /**
   * How the measure should be stratified
   */
  public val criteria: Expression? = null,
  public val component: List<MeasureGroupStratifierComponent> = emptyList(),
) : BackboneElement
