//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.biologicallyderivedproduct

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.range.Range
import com.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A property that is specific to this BiologicallyDerviedProduct instance
 *
 * A property that is specific to this BiologicallyDerviedProduct instance.
 *
 * @param id Unique id for inter-element referencing
 * @param type Code that specifies the property
 * @param valueBoolean Property values
 * @param valueInteger Property values
 * @param valueCodeableConcept Property values
 * @param valuePeriod Property values
 * @param valueQuantity Property values
 * @param valueRange Property values
 * @param valueRatio Property values
 * @param valueString Property values
 * @param valueAttachment Property values
 */
@SerialName("BiologicallyDerivedProductProperty")
@Serializable
public data class BiologicallyDerivedProductProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that specifies the property
   */
  public val type: CodeableConcept,
  /**
   * Property values
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Property values
   */
  public val valueInteger: Int? = null,
  /**
   * Property values
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Property values
   */
  public val valuePeriod: Period? = null,
  /**
   * Property values
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Property values
   */
  public val valueRange: Range? = null,
  /**
   * Property values
   */
  public val valueRatio: Ratio? = null,
  /**
   * Property values
   */
  public val valueString: String? = null,
  /**
   * Property values
   */
  public val valueAttachment: Attachment? = null,
) : BackboneElement
