//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.encounterhistory

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Location of the patient at this point in the encounter
 *
 * The location of the patient at this point in the encounter, the multiple cardinality permits
 * de-normalizing the levels of the location hierarchy, such as site/ward/room/bed.
 *
 * @param id Unique id for inter-element referencing
 * @param location Location the encounter takes place
 * @param form The physical type of the location (usually the level in the location hierarchy - bed,
 * room, ward, virtual etc.)
 */
@SerialName("EncounterHistoryLocation")
@Serializable
public data class EncounterHistoryLocation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Location the encounter takes place
   */
  public val location: Reference,
  /**
   * The physical type of the location (usually the level in the location hierarchy - bed, room,
   * ward, virtual etc.)
   */
  public val form: CodeableConcept? = null,
) : BackboneElement
