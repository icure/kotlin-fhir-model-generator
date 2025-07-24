//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.humanname

import com.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Name of a human or other living entity - parts and usage
 *
 * A name, normally of a human, that can be used for other living entities (e.g. animals but not
 * organizations) that have been assigned names by a human and may need the use of name parts or the
 * need for usage information.
 *
 * @param id Unique id for inter-element referencing
 * @param use usual | official | temp | nickname | anonymous | old | maiden
 * @param text Text representation of the full name
 * @param family Family name (often called 'Surname')
 * @param period Time period when name was/is in use
 */
@SerialName("HumanName")
@Serializable
public data class HumanName(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * usual | official | temp | nickname | anonymous | old | maiden
   */
  public val use: String? = null,
  /**
   * Text representation of the full name
   */
  public val text: String? = null,
  /**
   * Family name (often called 'Surname')
   */
  public val family: String? = null,
  public val given: List<String> = emptyList(),
  public val prefix: List<String> = emptyList(),
  public val suffix: List<String> = emptyList(),
  /**
   * Time period when name was/is in use
   */
  public val period: Period? = null,
) : DataType
