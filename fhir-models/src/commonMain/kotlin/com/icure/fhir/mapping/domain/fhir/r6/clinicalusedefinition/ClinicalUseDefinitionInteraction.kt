//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.clinicalusedefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specifics for when this is an interaction
 *
 * Specifics for when this is an interaction.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of the interaction e.g. drug-drug interaction, drug-lab test interaction
 * @param effect The effect of the interaction, for example "reduced gastric absorption of primary
 * medication"
 * @param incidence The incidence of the interaction, e.g. theoretical, observed
 */
@SerialName("ClinicalUseDefinitionInteraction")
@Serializable
public data class ClinicalUseDefinitionInteraction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val interactant: List<ClinicalUseDefinitionInteractionInteractant> = emptyList(),
  /**
   * The type of the interaction e.g. drug-drug interaction, drug-lab test interaction
   */
  public val type: CodeableConcept? = null,
  /**
   * The effect of the interaction, for example "reduced gastric absorption of primary medication"
   */
  public val effect: CodeableReference? = null,
  /**
   * The incidence of the interaction, e.g. theoretical, observed
   */
  public val incidence: CodeableConcept? = null,
  public val management: List<CodeableConcept> = emptyList(),
) : BackboneElement
