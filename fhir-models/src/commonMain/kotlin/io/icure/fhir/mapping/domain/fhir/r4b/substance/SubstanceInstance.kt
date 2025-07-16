//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.substance

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * If this describes a specific package/container of the substance
 *
 * Substance may be used to describe a kind of substance, or a specific package/container of the
 * substance: an instance.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Identifier of the package/container
 * @param expiry When no longer valid to use
 * @param quantity Amount of substance in the package
 */
@SerialName("SubstanceInstance")
@Serializable
public data class SubstanceInstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifier of the package/container
   */
  public val identifier: Identifier? = null,
  /**
   * When no longer valid to use
   */
  public val expiry: String? = null,
  /**
   * Amount of substance in the package
   */
  public val quantity: Quantity? = null,
) : BackboneElement
