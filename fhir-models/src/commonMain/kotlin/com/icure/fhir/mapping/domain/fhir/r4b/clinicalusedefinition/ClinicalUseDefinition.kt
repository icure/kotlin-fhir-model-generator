//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.clinicalusedefinition

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A single issue - either an indication, contraindication, interaction or an undesirable effect for
 * a medicinal product, medication, device or procedure
 *
 * A single issue - either an indication, contraindication, interaction or an undesirable effect for
 * a medicinal product, medication, device or procedure.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type indication | contraindication | interaction | undesirable-effect | warning
 * @param status Whether this is a current issue or one that has been retired etc
 * @param contraindication Specifics for when this is a contraindication
 * @param indication Specifics for when this is an indication
 * @param interaction Specifics for when this is an interaction
 * @param undesirableEffect A possible negative outcome from the use of this treatment
 * @param warning Critical environmental, health or physical risks or hazards. For example 'Do not
 * operate heavy machinery', 'May cause drowsiness'
 */
@SerialName("ClinicalUseDefinition")
@Serializable
public data class ClinicalUseDefinition(
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * indication | contraindication | interaction | undesirable-effect | warning
   */
  public val type: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  public val subject: List<Reference> = emptyList(),
  /**
   * Whether this is a current issue or one that has been retired etc
   */
  public val status: CodeableConcept? = null,
  /**
   * Specifics for when this is a contraindication
   */
  public val contraindication: ClinicalUseDefinitionContraindication? = null,
  /**
   * Specifics for when this is an indication
   */
  public val indication: ClinicalUseDefinitionIndication? = null,
  /**
   * Specifics for when this is an interaction
   */
  public val interaction: ClinicalUseDefinitionInteraction? = null,
  public val population: List<Reference> = emptyList(),
  /**
   * A possible negative outcome from the use of this treatment
   */
  public val undesirableEffect: ClinicalUseDefinitionUndesirableEffect? = null,
  /**
   * Critical environmental, health or physical risks or hazards. For example 'Do not operate heavy
   * machinery', 'May cause drowsiness'
   */
  public val warning: ClinicalUseDefinitionWarning? = null,
) : DomainResource
