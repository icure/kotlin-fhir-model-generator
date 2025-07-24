//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproductundesirableeffect

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.population.Population
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MedicinalProductUndesirableEffect
 *
 * Describe the undesirable effects of the medicinal product.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param symptomConditionEffect The symptom, condition or undesirable effect
 * @param classification Classification of the effect
 * @param frequencyOfOccurrence The frequency of occurrence of the effect
 */
@SerialName("MedicinalProductUndesirableEffect")
@Serializable
public data class MedicinalProductUndesirableEffect(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val subject: List<Reference> = emptyList(),
  /**
   * The symptom, condition or undesirable effect
   */
  public val symptomConditionEffect: CodeableConcept? = null,
  /**
   * Classification of the effect
   */
  public val classification: CodeableConcept? = null,
  /**
   * The frequency of occurrence of the effect
   */
  public val frequencyOfOccurrence: CodeableConcept? = null,
  public val population: List<Population> = emptyList(),
) : DomainResource
