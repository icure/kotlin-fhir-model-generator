//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.capabilitystatement

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Search parameters supported by implementation
 *
 * Search parameters for implementations to support and/or make use of - either references to ones
 * defined in the specification, or additional ones defined for/by the implementation.
 *
 * @param id Unique id for inter-element referencing
 * @param name Name for parameter in search url
 * @param definition Source of definition for parameter
 * @param type number | date | string | token | reference | composite | quantity | uri | special
 * @param documentation Server-specific usage
 */
@SerialName("CapabilityStatementRestResourceSearchParam")
@Serializable
public data class CapabilityStatementRestResourceSearchParam(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name for parameter in search url
   */
  public val name: String? = null,
  /**
   * Source of definition for parameter
   */
  public val definition: String? = null,
  /**
   * number | date | string | token | reference | composite | quantity | uri | special
   */
  public val type: String? = null,
  /**
   * Server-specific usage
   */
  public val documentation: String? = null,
) : BackboneElement
