//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.contract

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
