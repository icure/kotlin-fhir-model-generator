//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.encounter

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

/**
 * List of past encounter classes
 *
 * The class history permits the tracking of the encounters transitions without needing to go 
 * through the resource history.  This would be used for a case where an admission starts of as an
 * emergency encounter, then transitions into an inpatient scenario. Doing this and not restarting a
 * new encounter ensures that any lab/diagnostic results can more easily follow the patient and not
 * require re-processing and not get lost or cancelled during a kind of discharge from emergency to
 * inpatient.
 *
 * @param id Unique id for inter-element referencing
 * @param class_fhir inpatient | outpatient | ambulatory | emergency +
 * @param period The time that the episode was in the specified class
 */
@SerialName("EncounterClassHistory")
@Serializable
public data class EncounterClassHistory(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * inpatient | outpatient | ambulatory | emergency +
   */
  @JsonNames("class")
  public val class_fhir: Coding,
  /**
   * The time that the episode was in the specified class
   */
  public val period: Period,
) : BackboneElement
