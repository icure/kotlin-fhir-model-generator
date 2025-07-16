//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.permission

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
