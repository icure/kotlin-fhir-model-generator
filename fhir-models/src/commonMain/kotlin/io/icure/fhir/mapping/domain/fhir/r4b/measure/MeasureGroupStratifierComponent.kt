//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.measure

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Stratifier criteria component for the measure
 *
 * A component of the stratifier criteria for the measure report, specified as either the name of a
 * valid CQL expression defined within a referenced library or a valid FHIR Resource Path.
 *
 * @param id Unique id for inter-element referencing
 * @param code Meaning of the stratifier component
 * @param description The human readable description of this stratifier component
 * @param criteria Component of how the measure should be stratified
 */
@SerialName("MeasureGroupStratifierComponent")
@Serializable
public data class MeasureGroupStratifierComponent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Meaning of the stratifier component
   */
  public val code: CodeableConcept? = null,
  /**
   * The human readable description of this stratifier component
   */
  public val description: String? = null,
  /**
   * Component of how the measure should be stratified
   */
  public val criteria: Expression,
) : BackboneElement
