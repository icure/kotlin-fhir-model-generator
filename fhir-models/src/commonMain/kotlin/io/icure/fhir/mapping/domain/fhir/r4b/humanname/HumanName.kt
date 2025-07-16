//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.humanname

import io.icure.fhir.mapping.domain.fhir.r4b.Element
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Name of a human - parts and usage
 *
 * A human's name with the ability to identify parts and usage.
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
) : Element
