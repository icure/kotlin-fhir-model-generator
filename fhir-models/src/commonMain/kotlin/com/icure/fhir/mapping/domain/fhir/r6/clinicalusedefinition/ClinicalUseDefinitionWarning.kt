//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.clinicalusedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
