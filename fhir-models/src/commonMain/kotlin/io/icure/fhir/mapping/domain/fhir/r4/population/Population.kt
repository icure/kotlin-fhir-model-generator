//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.population

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A definition of a set of people that apply to some clinically related context, for example people
 * contraindicated for a certain medication
 *
 * A populatioof people with some set of grouping criteria.
 *
 * @param id Unique id for inter-element referencing
 * @param ageRange The age of the specific population
 * @param ageCodeableConcept The age of the specific population
 * @param gender The gender of the specific population
 * @param race Race of the specific population
 * @param physiologicalCondition The existing physiological conditions of the specific population to
 * which this applies
 */
@SerialName("Population")
@Serializable
public data class Population(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The age of the specific population
   */
  public val ageRange: Range? = null,
  /**
   * The age of the specific population
   */
  public val ageCodeableConcept: CodeableConcept? = null,
  /**
   * The gender of the specific population
   */
  public val gender: CodeableConcept? = null,
  /**
   * Race of the specific population
   */
  public val race: CodeableConcept? = null,
  /**
   * The existing physiological conditions of the specific population to which this applies
   */
  public val physiologicalCondition: CodeableConcept? = null,
) : BackboneElement
