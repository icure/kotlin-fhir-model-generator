//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.dosage

import com.icure.fhir.mapping.domain.fhir.r5.Element
import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import com.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Amount of medication administered, to be administered or typical amount to be administered
 *
 * Depending on the resource,this is the amount of medication administered, to  be administered or
 * typical amount to be administered.
 *
 * @param id Unique id for inter-element referencing
 * @param type The kind of dose or rate specified
 * @param doseRange Amount of medication per dose
 * @param doseQuantity Amount of medication per dose
 * @param rateRatio Amount of medication per unit of time
 * @param rateRange Amount of medication per unit of time
 * @param rateQuantity Amount of medication per unit of time
 */
@SerialName("DosageDoseAndRate")
@Serializable
public data class DosageDoseAndRate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * The kind of dose or rate specified
   */
  public val type: CodeableConcept? = null,
  /**
   * Amount of medication per dose
   */
  public val doseRange: Range? = null,
  /**
   * Amount of medication per dose
   */
  public val doseQuantity: Quantity? = null,
  /**
   * Amount of medication per unit of time
   */
  public val rateRatio: Ratio? = null,
  /**
   * Amount of medication per unit of time
   */
  public val rateRange: Range? = null,
  /**
   * Amount of medication per unit of time
   */
  public val rateQuantity: Quantity? = null,
) : Element
