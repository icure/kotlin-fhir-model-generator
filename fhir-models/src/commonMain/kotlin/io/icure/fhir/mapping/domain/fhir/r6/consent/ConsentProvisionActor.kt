//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.consent

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who|what controlled by this provision (or group, by role)
 *
 * Who or what is controlled by this provision. Use group to identify a set of actors by some
 * property they share (e.g. 'admitting officers').
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
  public val role: CodeableConcept? = null,
  /**
   * Resource for the actor (or group, by role)
   */
  public val reference: Reference? = null,
) : BackboneElement
