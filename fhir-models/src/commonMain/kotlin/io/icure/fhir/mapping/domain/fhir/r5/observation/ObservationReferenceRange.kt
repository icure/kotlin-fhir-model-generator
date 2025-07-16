//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.observation

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
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
 * @param normalValue Normal value, if relevant
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
   * Normal value, if relevant
   */
  public val normalValue: CodeableConcept? = null,
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
