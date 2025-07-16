//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.period

import io.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Time range defined by start and end date/time
 *
 * A time period defined by a start and end date and optionally time.
 *
 * @param id Unique id for inter-element referencing
 * @param start Starting time with inclusive boundary
 * @param end End time with inclusive boundary, if not ongoing
 */
@SerialName("Period")
@Serializable
public data class Period(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Starting time with inclusive boundary
   */
  public val start: String? = null,
  /**
   * End time with inclusive boundary, if not ongoing
   */
  public val end: String? = null,
) : DataType
