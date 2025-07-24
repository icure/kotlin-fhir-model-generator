//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.address

import com.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An address expressed using postal conventions (as opposed to GPS or other location definition
 * formats)
 *
 * An address expressed using postal conventions (as opposed to GPS or other location definition
 * formats).  This data type may be used to convey addresses for use in delivering mail as well as for
 * visiting locations which might not be valid for mail delivery.  There are a variety of postal
 * address formats defined around the world.
 * The ISO21090-codedString may be used to provide a coded representation of the contents of strings
 * in an Address.
 *
 * @param id Unique id for inter-element referencing
 * @param use home | work | temp | old | billing - purpose of this address
 * @param type postal | physical | both
 * @param text Text representation of the address
 * @param city Name of city, town etc.
 * @param district District name (aka county)
 * @param state Sub-unit of country (abbreviations ok)
 * @param postalCode Postal code for area
 * @param country Country (e.g. may be ISO 3166 2 or 3 letter code)
 * @param period Time period when address was/is in use
 */
@SerialName("Address")
@Serializable
public data class Address(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * home | work | temp | old | billing - purpose of this address
   */
  public val use: String? = null,
  /**
   * postal | physical | both
   */
  public val type: String? = null,
  /**
   * Text representation of the address
   */
  public val text: String? = null,
  public val line: List<String> = emptyList(),
  /**
   * Name of city, town etc.
   */
  public val city: String? = null,
  /**
   * District name (aka county)
   */
  public val district: String? = null,
  /**
   * Sub-unit of country (abbreviations ok)
   */
  public val state: String? = null,
  /**
   * Postal code for area
   */
  public val postalCode: String? = null,
  /**
   * Country (e.g. may be ISO 3166 2 or 3 letter code)
   */
  public val country: String? = null,
  /**
   * Time period when address was/is in use
   */
  public val period: Period? = null,
) : DataType
