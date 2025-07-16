//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.datarequirement

import io.icure.fhir.mapping.domain.fhir.r4.Element
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Order of the results
 *
 * Specifies the order of the results to be returned.
 *
 * @param id Unique id for inter-element referencing
 * @param path The name of the attribute to perform the sort
 * @param direction ascending | descending
 */
@SerialName("DataRequirementSort")
@Serializable
public data class DataRequirementSort(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * The name of the attribute to perform the sort
   */
  public val path: String? = null,
  /**
   * ascending | descending
   */
  public val direction: String? = null,
) : Element
