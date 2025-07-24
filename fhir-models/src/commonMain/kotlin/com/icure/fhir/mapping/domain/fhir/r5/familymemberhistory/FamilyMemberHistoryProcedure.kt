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
 * Procedures that the related person had
 *
 * The significant Procedures (or procedure) that the family member had. This is a repeating section
 * to allow a system to represent more than one procedure per resource, though there is nothing
 * stopping multiple resources - one per procedure.
 *
 * @param id Unique id for inter-element referencing
 * @param code Procedures performed on the related person
 * @param outcome What happened following the procedure
 * @param contributedToDeath Whether the procedure contributed to the cause of death
 * @param performedAge When the procedure was performed
 * @param performedRange When the procedure was performed
 * @param performedPeriod When the procedure was performed
 * @param performedString When the procedure was performed
 * @param performedDateTime When the procedure was performed
 */
@SerialName("FamilyMemberHistoryProcedure")
@Serializable
public data class FamilyMemberHistoryProcedure(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Procedures performed on the related person
   */
  public val code: CodeableConcept,
  /**
   * What happened following the procedure
   */
  public val outcome: CodeableConcept? = null,
  /**
   * Whether the procedure contributed to the cause of death
   */
  public val contributedToDeath: Boolean? = null,
  /**
   * When the procedure was performed
   */
  public val performedAge: Age? = null,
  /**
   * When the procedure was performed
   */
  public val performedRange: Range? = null,
  /**
   * When the procedure was performed
   */
  public val performedPeriod: Period? = null,
  /**
   * When the procedure was performed
   */
  public val performedString: String? = null,
  /**
   * When the procedure was performed
   */
  public val performedDateTime: String? = null,
  public val note: List<Annotation> = emptyList(),
) : BackboneElement
