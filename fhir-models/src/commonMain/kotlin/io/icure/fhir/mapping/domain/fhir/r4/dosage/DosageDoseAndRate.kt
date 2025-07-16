//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.dosage

import io.icure.fhir.mapping.domain.fhir.r4.Element
import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.range.Range
import io.icure.fhir.mapping.domain.fhir.r4.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Amount of medication administered
 *
 * The amount of medication administered.
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
