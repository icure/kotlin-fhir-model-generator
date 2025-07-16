//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.clinicalusedefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Critical environmental, health or physical risks or hazards. For example 'Do not operate heavy
 * machinery', 'May cause drowsiness'
 *
 * A critical piece of information about environmental, health or physical risks or hazards that
 * serve as caution to the user. For example 'Do not operate heavy machinery', 'May cause drowsiness',
 * or 'Get medical advice/attention if you feel unwell'.
 *
 * @param id Unique id for inter-element referencing
 * @param description A textual definition of this warning, with formatting
 * @param code A coded or unformatted textual definition of this warning
 */
@SerialName("ClinicalUseDefinitionWarning")
@Serializable
public data class ClinicalUseDefinitionWarning(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A textual definition of this warning, with formatting
   */
  public val description: String? = null,
  /**
   * A coded or unformatted textual definition of this warning
   */
  public val code: CodeableConcept? = null,
) : BackboneElement
