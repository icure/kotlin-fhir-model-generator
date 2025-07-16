//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductinteraction

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * MedicinalProductInteraction
 *
 * The interactions of the medicinal product with other medicinal products, or other forms of
 * interactions.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param description The interaction described
 * @param type The type of the interaction e.g. drug-drug interaction, drug-food interaction,
 * drug-lab test interaction
 * @param effect The effect of the interaction, for example "reduced gastric absorption of primary
 * medication"
 * @param incidence The incidence of the interaction, e.g. theoretical, observed
 * @param management Actions for managing the interaction
 */
@SerialName("MedicinalProductInteraction")
@Serializable
public data class MedicinalProductInteraction(
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
   * The interaction described
   */
  public val description: String? = null,
  public val interactant: List<MedicinalProductInteractionInteractant> = emptyList(),
  /**
   * The type of the interaction e.g. drug-drug interaction, drug-food interaction, drug-lab test
   * interaction
   */
  public val type: CodeableConcept? = null,
  /**
   * The effect of the interaction, for example "reduced gastric absorption of primary medication"
   */
  public val effect: CodeableConcept? = null,
  /**
   * The incidence of the interaction, e.g. theoretical, observed
   */
  public val incidence: CodeableConcept? = null,
  /**
   * Actions for managing the interaction
   */
  public val management: CodeableConcept? = null,
) : DomainResource
