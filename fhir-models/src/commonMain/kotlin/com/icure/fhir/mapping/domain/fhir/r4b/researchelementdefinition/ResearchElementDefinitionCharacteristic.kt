//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.researchelementdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r4b.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4b.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import com.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What defines the members of the research element
 *
 * A characteristic that defines the members of the research element. Multiple characteristics are
 * applied with "and" semantics.
 *
 * @param id Unique id for inter-element referencing
 * @param definitionCodeableConcept What code or expression defines members?
 * @param definitionCanonical What code or expression defines members?
 * @param definitionExpression What code or expression defines members?
 * @param definitionDataRequirement What code or expression defines members?
 * @param exclude Whether the characteristic includes or excludes members
 * @param unitOfMeasure What unit is the outcome described in?
 * @param studyEffectiveDescription What time period does the study cover
 * @param studyEffectiveDateTime What time period does the study cover
 * @param studyEffectivePeriod What time period does the study cover
 * @param studyEffectiveDuration What time period does the study cover
 * @param studyEffectiveTiming What time period does the study cover
 * @param studyEffectiveTimeFromStart Observation time from study start
 * @param studyEffectiveGroupMeasure mean | median | mean-of-mean | mean-of-median | median-of-mean
 * | median-of-median
 * @param participantEffectiveDescription What time period do participants cover
 * @param participantEffectiveDateTime What time period do participants cover
 * @param participantEffectivePeriod What time period do participants cover
 * @param participantEffectiveDuration What time period do participants cover
 * @param participantEffectiveTiming What time period do participants cover
 * @param participantEffectiveTimeFromStart Observation time from study start
 * @param participantEffectiveGroupMeasure mean | median | mean-of-mean | mean-of-median |
 * median-of-mean | median-of-median
 */
@SerialName("ResearchElementDefinitionCharacteristic")
@Serializable
public data class ResearchElementDefinitionCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What code or expression defines members?
   */
  public val definitionCodeableConcept: CodeableConcept? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionCanonical: String? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionExpression: Expression? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionDataRequirement: DataRequirement? = null,
  public val usageContext: List<UsageContext> = emptyList(),
  /**
   * Whether the characteristic includes or excludes members
   */
  public val exclude: Boolean? = null,
  /**
   * What unit is the outcome described in?
   */
  public val unitOfMeasure: CodeableConcept? = null,
  /**
   * What time period does the study cover
   */
  public val studyEffectiveDescription: String? = null,
  /**
   * What time period does the study cover
   */
  public val studyEffectiveDateTime: String? = null,
  /**
   * What time period does the study cover
   */
  public val studyEffectivePeriod: Period? = null,
  /**
   * What time period does the study cover
   */
  public val studyEffectiveDuration: Duration? = null,
  /**
   * What time period does the study cover
   */
  public val studyEffectiveTiming: Timing? = null,
  /**
   * Observation time from study start
   */
  public val studyEffectiveTimeFromStart: Duration? = null,
  /**
   * mean | median | mean-of-mean | mean-of-median | median-of-mean | median-of-median
   */
  public val studyEffectiveGroupMeasure: String? = null,
  /**
   * What time period do participants cover
   */
  public val participantEffectiveDescription: String? = null,
  /**
   * What time period do participants cover
   */
  public val participantEffectiveDateTime: String? = null,
  /**
   * What time period do participants cover
   */
  public val participantEffectivePeriod: Period? = null,
  /**
   * What time period do participants cover
   */
  public val participantEffectiveDuration: Duration? = null,
  /**
   * What time period do participants cover
   */
  public val participantEffectiveTiming: Timing? = null,
  /**
   * Observation time from study start
   */
  public val participantEffectiveTimeFromStart: Duration? = null,
  /**
   * mean | median | mean-of-mean | mean-of-median | median-of-mean | median-of-median
   */
  public val participantEffectiveGroupMeasure: String? = null,
) : BackboneElement
