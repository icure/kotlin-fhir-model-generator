//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.measure

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What other data should be reported with the measure
 *
 * The supplemental data criteria for the measure report, specified as either the name of a valid
 * CQL expression within a referenced library, or a valid FHIR Resource Path.
 *
 * @param id Unique id for inter-element referencing
 * @param linkId Unique id for supplementalData in measure
 * @param code Meaning of the supplemental data
 * @param description The human readable description of this supplemental data
 * @param criteria Expression describing additional data to be reported
 */
@SerialName("MeasureSupplementalData")
@Serializable
public data class MeasureSupplementalData(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Unique id for supplementalData in measure
   */
  public val linkId: String? = null,
  /**
   * Meaning of the supplemental data
   */
  public val code: CodeableConcept? = null,
  public val usage: List<CodeableConcept> = emptyList(),
  /**
   * The human readable description of this supplemental data
   */
  public val description: String? = null,
  /**
   * Expression describing additional data to be reported
   */
  public val criteria: Expression,
) : BackboneElement
