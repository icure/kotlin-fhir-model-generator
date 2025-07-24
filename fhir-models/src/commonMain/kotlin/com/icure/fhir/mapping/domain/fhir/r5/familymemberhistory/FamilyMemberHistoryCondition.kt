//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.familymemberhistory

import com.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r5.age.Age
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Condition that the related person had
 *
 * The significant Conditions (or condition) that the family member had. This is a repeating section
 * to allow a system to represent more than one condition per resource, though there is nothing
 * stopping multiple resources - one per condition.
 *
 * @param id Unique id for inter-element referencing
 * @param code Condition suffered by relation
 * @param outcome deceased | permanent disability | etc
 * @param contributedToDeath Whether the condition contributed to the cause of death
 * @param onsetAge When condition first manifested
 * @param onsetRange When condition first manifested
 * @param onsetPeriod When condition first manifested
 * @param onsetString When condition first manifested
 */
@SerialName("FamilyMemberHistoryCondition")
@Serializable
public data class FamilyMemberHistoryCondition(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Condition suffered by relation
   */
  public val code: CodeableConcept,
  /**
   * deceased | permanent disability | etc
   */
  public val outcome: CodeableConcept? = null,
  /**
   * Whether the condition contributed to the cause of death
   */
  public val contributedToDeath: Boolean? = null,
  /**
   * When condition first manifested
   */
  public val onsetAge: Age? = null,
  /**
   * When condition first manifested
   */
  public val onsetRange: Range? = null,
  /**
   * When condition first manifested
   */
  public val onsetPeriod: Period? = null,
  /**
   * When condition first manifested
   */
  public val onsetString: String? = null,
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
