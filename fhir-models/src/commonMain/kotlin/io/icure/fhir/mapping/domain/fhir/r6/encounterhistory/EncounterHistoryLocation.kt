//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.encounterhistory

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
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
