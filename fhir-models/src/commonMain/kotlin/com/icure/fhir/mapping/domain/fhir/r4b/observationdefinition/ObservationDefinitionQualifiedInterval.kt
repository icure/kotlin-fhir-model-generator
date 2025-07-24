//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.observationdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Qualified range for continuous and ordinal observation results
 *
 * Multiple  ranges of results qualified by different contexts for ordinal or continuous
 * observations conforming to this ObservationDefinition.
 *
 * @param id Unique id for inter-element referencing
 * @param category reference | critical | absolute
 * @param range The interval itself, for continuous or ordinal observations
 * @param context Range context qualifier
 * @param gender male | female | other | unknown
 * @param age Applicable age range, if relevant
 * @param gestationalAge Applicable gestational age range, if relevant
 * @param condition Condition associated with the reference range
 */
@SerialName("ObservationDefinitionQualifiedInterval")
@Serializable
public data class ObservationDefinitionQualifiedInterval(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * reference | critical | absolute
   */
  public val category: String? = null,
  /**
   * The interval itself, for continuous or ordinal observations
   */
  public val range: Range? = null,
  /**
   * Range context qualifier
   */
  public val context: CodeableConcept? = null,
  public val appliesTo: List<CodeableConcept> = emptyList(),
  /**
   * male | female | other | unknown
   */
  public val gender: String? = null,
  /**
   * Applicable age range, if relevant
   */
  public val age: Range? = null,
  /**
   * Applicable gestational age range, if relevant
   */
  public val gestationalAge: Range? = null,
  /**
   * Condition associated with the reference range
   */
  public val condition: String? = null,
) : BackboneElement
