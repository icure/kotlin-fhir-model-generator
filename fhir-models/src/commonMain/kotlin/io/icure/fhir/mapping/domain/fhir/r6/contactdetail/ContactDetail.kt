//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.contactdetail

import io.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
) : DataType
