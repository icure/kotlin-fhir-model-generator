//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.consent

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Policies covered by this consent
 *
 * The references to the policies that are included in this consent scope. Policies may be
 * organizational, but are often defined jurisdictionally, or in law.
 *
 * @param id Unique id for inter-element referencing
 * @param authority Enforcement source for policy
 * @param uri Specific policy covered by this consent
 */
@SerialName("ConsentPolicy")
@Serializable
public data class ConsentPolicy(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Enforcement source for policy
   */
  public val authority: String? = null,
  /**
   * Specific policy covered by this consent
   */
  public val uri: String? = null,
) : BackboneElement
