//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.bodystructure

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Specific and identified anatomical structure
 *
 * Record details about an anatomical structure.  This resource may be used when a coded concept
 * does not provide the necessary detail needed for the use case.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param active Whether this record is in active use
 * @param morphology Kind of Structure
 * @param description Text description
 * @param patient Who this is about
 */
@SerialName("BodyStructure")
@Serializable
public data class BodyStructure(
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
   * Whether this record is in active use
   */
  public val active: Boolean? = null,
  /**
   * Kind of Structure
   */
  public val morphology: CodeableConcept? = null,
  public val includedStructure: List<BodyStructureIncludedStructure> = emptyList(),
  public val excludedStructure: List<BodyStructureIncludedStructure> = emptyList(),
  /**
   * Text description
   */
  public val description: String? = null,
  public val image: List<Attachment> = emptyList(),
  /**
   * Who this is about
   */
  public val patient: Reference,
) : DomainResource
