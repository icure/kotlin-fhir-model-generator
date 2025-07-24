//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.datarequirement

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * What codes are expected
 *
 * Code filters specify additional constraints on the data, specifying the value set of interest for
 * a particular element of the data. Each code filter defines an additional constraint on the data,
 * i.e. code filters are AND'ed, not OR'ed.
 *
 * @param id Unique id for inter-element referencing
 * @param path A code-valued attribute to filter on
 * @param searchParam A coded (token) parameter to search on
 * @param valueSet Valueset for the filter
 */
@SerialName("DataRequirementCodeFilter")
@Serializable
public data class DataRequirementCodeFilter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * A code-valued attribute to filter on
   */
  public val path: String? = null,
  /**
   * A coded (token) parameter to search on
   */
  public val searchParam: String? = null,
  /**
   * Valueset for the filter
   */
  public val valueSet: String? = null,
  public val code: List<Coding> = emptyList(),
) : Element
