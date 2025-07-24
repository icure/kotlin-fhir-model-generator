//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.observationdefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Set of qualified values for observation results
 *
 * A set of qualified values associated with a context and a set of conditions -  provides a range
 * for quantitative and ordinal observations and a collection of value sets for qualitative
 * observations.
 *
 * @param id Unique id for inter-element referencing
 * @param context Context qualifier for the set of qualified values
 * @param gender male | female | other | unknown
 * @param age Applicable age range for the set of qualified values
 * @param gestationalAge Applicable gestational age range for the set of qualified values
 * @param condition Condition associated with the set of qualified values
 * @param rangeCategory reference | critical | absolute
 * @param range The range for continuous or ordinal observations
 * @param validCodedValueSet Value set of valid coded values as part of this set of qualified values
 * @param normalCodedValueSet Value set of normal coded values as part of this set of qualified
 * values
 * @param abnormalCodedValueSet Value set of abnormal coded values as part of this set of qualified
 * values
 * @param criticalCodedValueSet Value set of critical coded values as part of this set of qualified
 * values
 */
@SerialName("ObservationDefinitionQualifiedValue")
@Serializable
public data class ObservationDefinitionQualifiedValue(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Context qualifier for the set of qualified values
   */
  public val context: CodeableConcept? = null,
  public val appliesTo: List<CodeableConcept> = emptyList(),
  /**
   * male | female | other | unknown
   */
  public val gender: String? = null,
  /**
   * Applicable age range for the set of qualified values
   */
  public val age: Range? = null,
  /**
   * Applicable gestational age range for the set of qualified values
   */
  public val gestationalAge: Range? = null,
  /**
   * Condition associated with the set of qualified values
   */
  public val condition: String? = null,
  /**
   * reference | critical | absolute
   */
  public val rangeCategory: String? = null,
  /**
   * The range for continuous or ordinal observations
   */
  public val range: Range? = null,
  /**
   * Value set of valid coded values as part of this set of qualified values
   */
  public val validCodedValueSet: String? = null,
  /**
   * Value set of normal coded values as part of this set of qualified values
   */
  public val normalCodedValueSet: String? = null,
  /**
   * Value set of abnormal coded values as part of this set of qualified values
   */
  public val abnormalCodedValueSet: String? = null,
  /**
   * Value set of critical coded values as part of this set of qualified values
   */
  public val criticalCodedValueSet: String? = null,
) : BackboneElement
