//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.encounter

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
 * @param individual Persons involved in the encounter other than the patient
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
   * Persons involved in the encounter other than the patient
   */
  public val individual: Reference? = null,
) : BackboneElement
