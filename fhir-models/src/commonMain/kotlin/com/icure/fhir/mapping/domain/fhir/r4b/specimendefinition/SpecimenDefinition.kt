//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.specimendefinition

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Kind of specimen
 *
 * A kind of specimen with associated set of requirements.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param identifier Business identifier of a kind of specimen
 * @param typeCollected Kind of material to collect
 * @param timeAspect Time aspect for collection
 */
@SerialName("SpecimenDefinition")
@Serializable
public data class SpecimenDefinition(
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
  /**
   * Business identifier of a kind of specimen
   */
  public val identifier: Identifier? = null,
  /**
   * Kind of material to collect
   */
  public val typeCollected: CodeableConcept? = null,
  public val patientPreparation: List<CodeableConcept> = emptyList(),
  /**
   * Time aspect for collection
   */
  public val timeAspect: String? = null,
  public val collection: List<CodeableConcept> = emptyList(),
  public val typeTested: List<SpecimenDefinitionTypeTested> = emptyList(),
) : DomainResource
