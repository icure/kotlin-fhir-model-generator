//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.provenance

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Actor involved
 *
 * An actor taking a role in an activity  for which it can be assigned some degree of responsibility
 * for the activity taking place.
 *
 * @param id Unique id for inter-element referencing
 * @param type How the agent participated
 * @param who Who participated
 * @param onBehalfOf Who the agent is representing
 */
@SerialName("ProvenanceAgent")
@Serializable
public data class ProvenanceAgent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * How the agent participated
   */
  public val type: CodeableConcept? = null,
  public val role: List<CodeableConcept> = emptyList(),
  /**
   * Who participated
   */
  public val who: Reference,
  /**
   * Who the agent is representing
   */
  public val onBehalfOf: Reference? = null,
) : BackboneElement
