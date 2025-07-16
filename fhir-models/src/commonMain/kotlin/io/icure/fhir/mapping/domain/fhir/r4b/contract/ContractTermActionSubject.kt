//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.contract

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Entity of the action
 *
 * Entity of the action.
 *
 * @param id Unique id for inter-element referencing
 * @param role Role type of the agent
 */
@SerialName("ContractTermActionSubject")
@Serializable
public data class ContractTermActionSubject(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val reference: List<Reference> = emptyList(),
  /**
   * Role type of the agent
   */
  public val role: CodeableConcept? = null,
) : BackboneElement
