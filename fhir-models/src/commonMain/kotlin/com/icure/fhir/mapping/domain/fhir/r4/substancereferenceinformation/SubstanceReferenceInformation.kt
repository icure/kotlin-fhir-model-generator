//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.substancereferenceinformation

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Todo
 *
 * Todo.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param comment Todo
 */
@SerialName("SubstanceReferenceInformation")
@Serializable
public data class SubstanceReferenceInformation(
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
   * Todo
   */
  public val comment: String? = null,
  public val gene: List<SubstanceReferenceInformationGene> = emptyList(),
  public val geneElement: List<SubstanceReferenceInformationGeneElement> = emptyList(),
  public val classification: List<SubstanceReferenceInformationClassification> = emptyList(),
  public val target: List<SubstanceReferenceInformationTarget> = emptyList(),
) : DomainResource
