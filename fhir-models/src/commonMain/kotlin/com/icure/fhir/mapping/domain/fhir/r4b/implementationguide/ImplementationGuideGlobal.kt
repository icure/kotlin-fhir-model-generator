//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.implementationguide

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Profiles that apply globally
 *
 * A set of profiles that all resources covered by this implementation guide must conform to.
 *
 * @param id Unique id for inter-element referencing
 * @param type Type this profile applies to
 * @param profile Profile that all resources must conform to
 */
@SerialName("ImplementationGuideGlobal")
@Serializable
public data class ImplementationGuideGlobal(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type this profile applies to
   */
  public val type: String? = null,
  /**
   * Profile that all resources must conform to
   */
  public val profile: String? = null,
) : BackboneElement
