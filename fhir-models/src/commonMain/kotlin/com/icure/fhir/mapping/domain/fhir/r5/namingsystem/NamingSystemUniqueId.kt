//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.namingsystem

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Unique identifiers used for system
 *
 * Indicates how the system may be identified when referenced in electronic exchange.
 *
 * @param id Unique id for inter-element referencing
 * @param type oid | uuid | uri | iri-stem | v2csmnemonic | other
 * @param value The unique identifier
 * @param preferred Is this the id that should be used for this type
 * @param comment Notes about identifier usage
 * @param period When is identifier valid?
 * @param authoritative Whether the identifier is authoritative
 */
@SerialName("NamingSystemUniqueId")
@Serializable
public data class NamingSystemUniqueId(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * oid | uuid | uri | iri-stem | v2csmnemonic | other
   */
  public val type: String? = null,
  /**
   * The unique identifier
   */
  public val `value`: String? = null,
  /**
   * Is this the id that should be used for this type
   */
  public val preferred: Boolean? = null,
  /**
   * Notes about identifier usage
   */
  public val comment: String? = null,
  /**
   * When is identifier valid?
   */
  public val period: Period? = null,
  /**
   * Whether the identifier is authoritative
   */
  public val authoritative: Boolean? = null,
) : BackboneElement
