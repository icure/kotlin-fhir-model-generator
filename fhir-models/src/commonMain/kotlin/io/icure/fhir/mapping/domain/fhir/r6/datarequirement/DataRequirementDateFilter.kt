//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.datarequirement

import io.icure.fhir.mapping.domain.fhir.r6.Element
import io.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What dates/date ranges are expected
 *
 * Date filters specify additional constraints on the data in terms of the applicable date range for
 * specific elements. Each date filter specifies an additional constraint on the data, i.e. date
 * filters are AND'ed, not OR'ed.
 *
 * @param id Unique id for inter-element referencing
 * @param path A date-valued attribute to filter on
 * @param searchParam A date valued parameter to search on
 * @param valueDateTime The value of the filter, as a Period, DateTime, or Duration value
 * @param valuePeriod The value of the filter, as a Period, DateTime, or Duration value
 * @param valueDuration The value of the filter, as a Period, DateTime, or Duration value
 */
@SerialName("DataRequirementDateFilter")
@Serializable
public data class DataRequirementDateFilter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * A date-valued attribute to filter on
   */
  public val path: String? = null,
  /**
   * A date valued parameter to search on
   */
  public val searchParam: String? = null,
  /**
   * The value of the filter, as a Period, DateTime, or Duration value
   */
  public val valueDateTime: String? = null,
  /**
   * The value of the filter, as a Period, DateTime, or Duration value
   */
  public val valuePeriod: Period? = null,
  /**
   * The value of the filter, as a Period, DateTime, or Duration value
   */
  public val valueDuration: Duration? = null,
) : Element
