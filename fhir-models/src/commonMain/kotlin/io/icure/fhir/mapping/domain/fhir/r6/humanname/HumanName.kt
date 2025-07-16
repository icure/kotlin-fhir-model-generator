//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.humanname

import io.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
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
