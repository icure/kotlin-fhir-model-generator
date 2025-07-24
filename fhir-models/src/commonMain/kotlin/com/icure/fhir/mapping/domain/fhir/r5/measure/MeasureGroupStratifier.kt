//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.measure

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param linkId Unique id for stratifier in measure
 * @param code Meaning of the stratifier
 * @param description The human readable description of this stratifier
 * @param criteria How the measure should be stratified
 * @param groupDefinition A group resource that defines this population
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
   * Unique id for stratifier in measure
   */
  public val linkId: String? = null,
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
  /**
   * A group resource that defines this population
   */
  public val groupDefinition: Reference? = null,
  public val component: List<MeasureGroupStratifierComponent> = emptyList(),
) : BackboneElement
