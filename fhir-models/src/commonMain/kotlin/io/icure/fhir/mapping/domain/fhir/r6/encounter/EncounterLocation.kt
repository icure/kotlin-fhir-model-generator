//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.encounter

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * List of locations where the patient has been
 *
 * List of locations where  the patient has been during this encounter.
 *
 * @param id Unique id for inter-element referencing
 * @param location Location the encounter takes place
 * @param status planned | active | reserved | completed
 * @param form The physical type of the location (usually the level in the location hierarchy - bed,
 * room, ward, virtual etc.)
 * @param period Time period during which the patient was present at the location
 */
@SerialName("EncounterLocation")
@Serializable
public data class EncounterLocation(
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
   * planned | active | reserved | completed
   */
  public val status: String? = null,
  /**
   * The physical type of the location (usually the level in the location hierarchy - bed, room,
   * ward, virtual etc.)
   */
  public val form: CodeableConcept? = null,
  /**
   * Time period during which the patient was present at the location
   */
  public val period: Period? = null,
) : BackboneElement
