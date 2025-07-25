//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.evidence

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import kotlin.Float
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An attribute of the Statistic
 *
 * A statistical attribute of the statistic such as a measure of heterogeneity.
 *
 * @param id Unique id for inter-element referencing
 * @param description Textual description of the attribute estimate
 * @param type The type of attribute estimate, e.g., confidence interval or p value
 * @param quantity The singular quantity of the attribute estimate, for attribute estimates
 * represented as single values; also used to report unit of measure
 * @param level Level of confidence interval, e.g., 0.95 for 95% confidence interval
 * @param range Lower and upper bound values of the attribute estimate
 */
@SerialName("EvidenceStatisticAttributeEstimate")
@Serializable
public data class EvidenceStatisticAttributeEstimate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Textual description of the attribute estimate
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * The type of attribute estimate, e.g., confidence interval or p value
   */
  public val type: CodeableConcept? = null,
  /**
   * The singular quantity of the attribute estimate, for attribute estimates represented as single
   * values; also used to report unit of measure
   */
  public val quantity: Quantity? = null,
  /**
   * Level of confidence interval, e.g., 0.95 for 95% confidence interval
   */
  public val level: Float? = null,
  /**
   * Lower and upper bound values of the attribute estimate
   */
  public val range: Range? = null,
  public val attributeEstimate: List<EvidenceStatisticAttributeEstimate> = emptyList(),
) : BackboneElement
