//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.permission

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Explicit FHIR Resource references
 *
 * Explicit FHIR Resource references.
 *
 * @param id Unique id for inter-element referencing
 * @param meaning instance | related | dependents | authoredby
 * @param reference The actual data reference
 */
@SerialName("PermissionRuleDataResource")
@Serializable
public data class PermissionRuleDataResource(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * instance | related | dependents | authoredby
   */
  public val meaning: String? = null,
  /**
   * The actual data reference
   */
  public val reference: Reference,
) : BackboneElement
