//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.permission

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A description or definition of which activities are allowed to be done on the data
 *
 * A description or definition of which activities are allowed to be done on the data.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("PermissionRuleActivity")
@Serializable
public data class PermissionRuleActivity(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val actor: List<Reference> = emptyList(),
  public val action: List<CodeableConcept> = emptyList(),
  public val purpose: List<CodeableConcept> = emptyList(),
) : BackboneElement
