//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.permission

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
