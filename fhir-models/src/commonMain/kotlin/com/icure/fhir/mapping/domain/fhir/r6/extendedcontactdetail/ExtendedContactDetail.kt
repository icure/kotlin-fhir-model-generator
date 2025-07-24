//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.extendedcontactdetail

import com.icure.fhir.mapping.domain.fhir.r6.address.Address
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.humanname.HumanName
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contact information
 *
 * Specifies contact information for a specific purpose over a period of time, might be
 * handled/monitored by a specific named person or organization.
 *
 * @param id Unique id for inter-element referencing
 * @param purpose The type of contact
 * @param address Address for the contact
 * @param organization This contact detail is handled/monitored by a specific organization
 * @param period Period that this contact was valid for usage
 */
@SerialName("ExtendedContactDetail")
@Serializable
public data class ExtendedContactDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * The type of contact
   */
  public val purpose: CodeableConcept? = null,
  public val name: List<HumanName> = emptyList(),
  public val telecom: List<ContactPoint> = emptyList(),
  /**
   * Address for the contact
   */
  public val address: Address? = null,
  /**
   * This contact detail is handled/monitored by a specific organization
   */
  public val organization: Reference? = null,
  /**
   * Period that this contact was valid for usage
   */
  public val period: Period? = null,
) : DataType
