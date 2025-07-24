//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.coding

import com.icure.fhir.mapping.domain.fhir.r5.datatype.DataType
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A reference to a code defined by a terminology system
 *
 * A reference to a code defined by a terminology system.
 *
 * @param id Unique id for inter-element referencing
 * @param system Identity of the terminology system
 * @param version Version of the system - if relevant
 * @param code Symbol in syntax defined by the system
 * @param display Representation defined by the system
 * @param userSelected If this coding was chosen directly by the user
 */
@SerialName("Coding")
@Serializable
public data class Coding(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Identity of the terminology system
   */
  public val system: String? = null,
  /**
   * Version of the system - if relevant
   */
  public val version: String? = null,
  /**
   * Symbol in syntax defined by the system
   */
  public val code: String? = null,
  /**
   * Representation defined by the system
   */
  public val display: String? = null,
  /**
   * If this coding was chosen directly by the user
   */
  public val userSelected: Boolean? = null,
) : DataType
