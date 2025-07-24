//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.evidencevariable

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r4.expression.Expression
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4.timing.Timing
import com.icure.fhir.mapping.domain.fhir.r4.triggerdefinition.TriggerDefinition
import com.icure.fhir.mapping.domain.fhir.r4.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What defines the members of the evidence element
 *
 * A characteristic that defines the members of the evidence element. Multiple characteristics are
 * applied with "and" semantics.
 *
 * @param id Unique id for inter-element referencing
 * @param description Natural language description of the characteristic
 * @param definitionReference What code or expression defines members?
 * @param definitionCanonical What code or expression defines members?
 * @param definitionCodeableConcept What code or expression defines members?
 * @param definitionExpression What code or expression defines members?
 * @param definitionDataRequirement What code or expression defines members?
 * @param definitionTriggerDefinition What code or expression defines members?
 * @param exclude Whether the characteristic includes or excludes members
 * @param participantEffectiveDateTime What time period do participants cover
 * @param participantEffectivePeriod What time period do participants cover
 * @param participantEffectiveDuration What time period do participants cover
 * @param participantEffectiveTiming What time period do participants cover
 * @param timeFromStart Observation time from study start
 * @param groupMeasure mean | median | mean-of-mean | mean-of-median | median-of-mean |
 * median-of-median
 */
@SerialName("EvidenceVariableCharacteristic")
@Serializable
public data class EvidenceVariableCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Natural language description of the characteristic
   */
  public val description: String? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionReference: Reference? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionCanonical: String? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionCodeableConcept: CodeableConcept? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionExpression: Expression? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionDataRequirement: DataRequirement? = null,
  /**
   * What code or expression defines members?
   */
  public val definitionTriggerDefinition: TriggerDefinition? = null,
  public val usageContext: List<UsageContext> = emptyList(),
  /**
   * Whether the characteristic includes or excludes members
   */
  public val exclude: Boolean? = null,
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
  public val timeFromStart: Duration? = null,
  /**
   * mean | median | mean-of-mean | mean-of-median | median-of-mean | median-of-median
   */
  public val groupMeasure: String? = null,
) : BackboneElement
