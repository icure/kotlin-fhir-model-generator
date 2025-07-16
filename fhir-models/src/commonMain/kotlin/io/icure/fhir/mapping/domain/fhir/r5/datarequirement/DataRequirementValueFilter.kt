//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.datarequirement

import io.icure.fhir.mapping.domain.fhir.r5.Element
import io.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What values are expected
 *
 * Value filters specify additional constraints on the data for elements other than code-valued or
 * date-valued. Each value filter specifies an additional constraint on the data (i.e. valueFilters are
 * AND'ed, not OR'ed).
 *
 * @param id Unique id for inter-element referencing
 * @param path An attribute to filter on
 * @param searchParam A parameter to search on
 * @param comparator eq | gt | lt | ge | le | sa | eb
 * @param valueDateTime The value of the filter, as a Period, DateTime, or Duration value
 * @param valuePeriod The value of the filter, as a Period, DateTime, or Duration value
 * @param valueDuration The value of the filter, as a Period, DateTime, or Duration value
 */
@SerialName("DataRequirementValueFilter")
@Serializable
public data class DataRequirementValueFilter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * An attribute to filter on
   */
  public val path: String? = null,
  /**
   * A parameter to search on
   */
  public val searchParam: String? = null,
  /**
   * eq | gt | lt | ge | le | sa | eb
   */
  public val comparator: String? = null,
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
