//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.contactpoint

import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a Technology mediated contact point (phone, fax, email, etc.)
 *
 * Details for all kinds of technology mediated contact points for a person or organization,
 * including telephone, email, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param system phone | fax | email | pager | url | sms | other
 * @param value The actual contact point details
 * @param use home | work | temp | old | mobile - purpose of this contact point
 * @param rank Specify preferred order of use (1 = highest)
 * @param period Time period when the contact point was/is in use
 */
@SerialName("ContactPoint")
@Serializable
public data class ContactPoint(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * phone | fax | email | pager | url | sms | other
   */
  public val system: String? = null,
  /**
   * The actual contact point details
   */
  public val `value`: String? = null,
  /**
   * home | work | temp | old | mobile - purpose of this contact point
   */
  public val use: String? = null,
  /**
   * Specify preferred order of use (1 = highest)
   */
  public val rank: Int? = null,
  /**
   * Time period when the contact point was/is in use
   */
  public val period: Period? = null,
) : DataType
