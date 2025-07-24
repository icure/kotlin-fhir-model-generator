//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.clinicalusedefinition

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A possible negative outcome from the use of this treatment
 *
 * Describe the possible undesirable effects (negative outcomes) from the use of the medicinal
 * product as treatment.
 *
 * @param id Unique id for inter-element referencing
 * @param symptomConditionEffect The situation in which the undesirable effect may manifest
 * @param classification High level classification of the effect
 * @param frequencyOfOccurrence How often the effect is seen
 */
@SerialName("ClinicalUseDefinitionUndesirableEffect")
@Serializable
public data class ClinicalUseDefinitionUndesirableEffect(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The situation in which the undesirable effect may manifest
   */
  public val symptomConditionEffect: CodeableReference? = null,
  /**
   * High level classification of the effect
   */
  public val classification: CodeableConcept? = null,
  /**
   * How often the effect is seen
   */
  public val frequencyOfOccurrence: CodeableConcept? = null,
) : BackboneElement
