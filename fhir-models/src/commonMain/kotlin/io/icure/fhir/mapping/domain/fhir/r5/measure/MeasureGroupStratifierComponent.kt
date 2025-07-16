//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.measure

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param linkId Unique id for stratifier component in measure
 * @param code Meaning of the stratifier component
 * @param description The human readable description of this stratifier component
 * @param criteria Component of how the measure should be stratified
 * @param groupDefinition A group resource that defines this population
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
   * Unique id for stratifier component in measure
   */
  public val linkId: String? = null,
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
  public val criteria: Expression? = null,
  /**
   * A group resource that defines this population
   */
  public val groupDefinition: Reference? = null,
) : BackboneElement
