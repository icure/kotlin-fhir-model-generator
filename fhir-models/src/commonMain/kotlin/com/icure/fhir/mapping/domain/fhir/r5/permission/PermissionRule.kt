//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.permission

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
