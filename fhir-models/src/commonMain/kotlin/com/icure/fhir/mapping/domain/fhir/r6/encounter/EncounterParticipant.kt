//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.encounter

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of participants involved in the encounter
 *
 * The list of people responsible for providing the service.
 *
 * @param id Unique id for inter-element referencing
 * @param period Period of time during the encounter that the participant participated
 * @param actor The individual, device, or service participating in the encounter
 */
@SerialName("EncounterParticipant")
@Serializable
public data class EncounterParticipant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Period of time during the encounter that the participant participated
   */
  public val period: Period? = null,
  /**
   * The individual, device, or service participating in the encounter
   */
  public val actor: Reference? = null,
) : BackboneElement
