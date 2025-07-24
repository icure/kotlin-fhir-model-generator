//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.contactdetail

import com.icure.fhir.mapping.domain.fhir.r4.Element
import com.icure.fhir.mapping.domain.fhir.r4.contactpoint.ContactPoint
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contact information
 *
 * Specifies contact information for a person or organization.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name of an individual to contact
 */
@SerialName("ContactDetail")
@Serializable
public data class ContactDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Name of an individual to contact
   */
  public val name: String? = null,
  public val telecom: List<ContactPoint> = emptyList(),
) : Element
