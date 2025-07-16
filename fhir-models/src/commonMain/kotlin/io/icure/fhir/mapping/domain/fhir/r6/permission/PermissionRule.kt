//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.permission

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Constraints to the Permission
 *
 * A set of rules.
 *
 * @param id Unique id for inter-element referencing
 * @param type deny | permit
 */
@SerialName("PermissionRule")
@Serializable
public data class PermissionRule(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * deny | permit
   */
  public val type: String? = null,
  public val `data`: List<PermissionRuleData> = emptyList(),
  public val activity: List<PermissionRuleActivity> = emptyList(),
  public val limit: List<CodeableConcept> = emptyList(),
) : BackboneElement
