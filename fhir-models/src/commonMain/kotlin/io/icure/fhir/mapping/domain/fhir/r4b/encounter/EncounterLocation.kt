//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.encounter

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param physicalType The physical type of the location (usually the level in the location
 * hierachy - bed room ward etc.)
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
   * The physical type of the location (usually the level in the location hierachy - bed room ward
   * etc.)
   */
  public val physicalType: CodeableConcept? = null,
  /**
   * Time period during which the patient was present at the location
   */
  public val period: Period? = null,
) : BackboneElement
