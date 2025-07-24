//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.marketingstatus

import com.icure.fhir.mapping.domain.fhir.r5.backbonetype.BackboneType
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available
 *
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available.
 *
 * @param id Unique id for inter-element referencing
 * @param country The country in which the marketing authorization has been granted shall be
 * specified It should be specified using the ISO 3166 ‑ 1 alpha-2 code elements
 * @param jurisdiction Where a Medicines Regulatory Agency has granted a marketing authorization for
 * which specific provisions within a jurisdiction apply, the jurisdiction can be specified using an
 * appropriate controlled terminology The controlled term and the controlled term identifier shall be
 * specified
 * @param status This attribute provides information on the status of the marketing of the medicinal
 * product See ISO/TS 20443 for more information and examples
 * @param dateRange The date when the Medicinal Product is placed on the market by the Marketing
 * Authorization Holder (or where applicable, the manufacturer/distributor) in a country and/or
 * jurisdiction shall be provided A complete date consisting of day, month and year shall be specified
 * using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal
 * Product into the distribution chain
 * @param restoreDate The date when the Medicinal Product is placed on the market by the Marketing
 * Authorization Holder (or where applicable, the manufacturer/distributor) in a country and/or
 * jurisdiction shall be provided A complete date consisting of day, month and year shall be specified
 * using the ISO 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal
 * Product into the distribution chain
 */
@SerialName("MarketingStatus")
@Serializable
public data class MarketingStatus(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The country in which the marketing authorization has been granted shall be specified It should
   * be specified using the ISO 3166 ‑ 1 alpha-2 code elements
   */
  public val country: CodeableConcept? = null,
  /**
   * Where a Medicines Regulatory Agency has granted a marketing authorization for which specific
   * provisions within a jurisdiction apply, the jurisdiction can be specified using an appropriate
   * controlled terminology The controlled term and the controlled term identifier shall be specified
   */
  public val jurisdiction: CodeableConcept? = null,
  /**
   * This attribute provides information on the status of the marketing of the medicinal product See
   * ISO/TS 20443 for more information and examples
   */
  public val status: CodeableConcept,
  /**
   * The date when the Medicinal Product is placed on the market by the Marketing Authorization
   * Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall
   * be provided A complete date consisting of day, month and year shall be specified using the ISO
   * 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into
   * the distribution chain
   */
  public val dateRange: Period? = null,
  /**
   * The date when the Medicinal Product is placed on the market by the Marketing Authorization
   * Holder (or where applicable, the manufacturer/distributor) in a country and/or jurisdiction shall
   * be provided A complete date consisting of day, month and year shall be specified using the ISO
   * 8601 date format NOTE “Placed on the market” refers to the release of the Medicinal Product into
   * the distribution chain
   */
  public val restoreDate: String? = null,
) : BackboneType
