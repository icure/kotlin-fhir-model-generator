//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.consent

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who|what controlled by this rule (or group, by role)
 *
 * Who or what is controlled by this rule. Use group to identify a set of actors by some property
 * they share (e.g. 'admitting officers').
 *
 * @param id Unique id for inter-element referencing
 * @param role How the actor is involved
 * @param reference Resource for the actor (or group, by role)
 */
@SerialName("ConsentProvisionActor")
@Serializable
public data class ConsentProvisionActor(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * How the actor is involved
   */
  public val role: CodeableConcept,
  /**
   * Resource for the actor (or group, by role)
   */
  public val reference: Reference,
) : BackboneElement
