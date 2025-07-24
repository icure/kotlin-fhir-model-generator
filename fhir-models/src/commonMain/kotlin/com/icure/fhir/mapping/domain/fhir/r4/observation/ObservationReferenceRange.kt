//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.observation

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Provides guide for interpretation
 *
 * Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple
 * reference ranges are interpreted as an "OR".   In other words, to represent two distinct target
 * populations, two `referenceRange` elements would be used.
 *
 * @param id Unique id for inter-element referencing
 * @param low Low Range, if relevant
 * @param high High Range, if relevant
 * @param type Reference range qualifier
 * @param age Applicable age range, if relevant
 * @param text Text based reference range in an observation
 */
@SerialName("ObservationReferenceRange")
@Serializable
public data class ObservationReferenceRange(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Low Range, if relevant
   */
  public val low: Quantity? = null,
  /**
   * High Range, if relevant
   */
  public val high: Quantity? = null,
  /**
   * Reference range qualifier
   */
  public val type: CodeableConcept? = null,
  public val appliesTo: List<CodeableConcept> = emptyList(),
  /**
   * Applicable age range, if relevant
   */
  public val age: Range? = null,
  /**
   * Text based reference range in an observation
   */
  public val text: String? = null,
) : BackboneElement
