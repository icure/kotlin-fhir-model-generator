//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.virtualservicedetail

import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.contactpoint.ContactPoint
import io.icure.fhir.mapping.domain.fhir.r6.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r6.extendedcontactdetail.ExtendedContactDetail
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Virtual Service Contact Details
 *
 * The set of values required to describe a virtual service's connection details, including some
 * limitations of the service.
 *
 * @param id Unique id for inter-element referencing
 * @param channelType Channel Type
 * @param addressUrl Contact address/number
 * @param addressString Contact address/number
 * @param addressContactPoint Contact address/number
 * @param addressExtendedContactDetail Contact address/number
 * @param maxParticipants Maximum number of participants supported by the virtual service
 * @param sessionKey Session Key required by the virtual service
 */
@SerialName("VirtualServiceDetail")
@Serializable
public data class VirtualServiceDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Channel Type
   */
  public val channelType: Coding? = null,
  /**
   * Contact address/number
   */
  public val addressUrl: String? = null,
  /**
   * Contact address/number
   */
  public val addressString: String? = null,
  /**
   * Contact address/number
   */
  public val addressContactPoint: ContactPoint? = null,
  /**
   * Contact address/number
   */
  public val addressExtendedContactDetail: ExtendedContactDetail? = null,
  public val additionalInfo: List<String> = emptyList(),
  /**
   * Maximum number of participants supported by the virtual service
   */
  public val maxParticipants: Int? = null,
  /**
   * Session Key required by the virtual service
   */
  public val sessionKey: String? = null,
) : DataType
