//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.provenance

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param who The agent that participated in the event
 * @param onBehalfOf The agent that delegated
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
   * The agent that participated in the event
   */
  public val who: Reference,
  /**
   * The agent that delegated
   */
  public val onBehalfOf: Reference? = null,
) : BackboneElement
