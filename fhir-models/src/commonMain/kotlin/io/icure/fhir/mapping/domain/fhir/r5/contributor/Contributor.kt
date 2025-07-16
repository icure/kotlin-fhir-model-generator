//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.contributor

import io.icure.fhir.mapping.domain.fhir.r5.contactdetail.ContactDetail
import io.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contributor information
 *
 * A contributor to the content of a knowledge asset, including authors, editors, reviewers, and
 * endorsers.
 *
 * @param id Unique id for inter-element referencing
 * @param type author | editor | reviewer | endorser
 * @param name Who contributed the content
 */
@SerialName("Contributor")
@Serializable
public data class Contributor(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * author | editor | reviewer | endorser
   */
  public val type: String? = null,
  /**
   * Who contributed the content
   */
  public val name: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
) : DataType
