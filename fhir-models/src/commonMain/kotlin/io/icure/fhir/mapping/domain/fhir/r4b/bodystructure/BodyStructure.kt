//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.bodystructure

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param location Body site
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
  /**
   * Body site
   */
  public val location: CodeableConcept? = null,
  public val locationQualifier: List<CodeableConcept> = emptyList(),
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
