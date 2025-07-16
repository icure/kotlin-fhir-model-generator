//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.clinicalusedefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
