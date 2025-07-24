//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.documentmanifest

import com.icure.fhir.mapping.domain.fhir.r4.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4.Meta
import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A list that defines a set of documents
 *
 * A collection of documents compiled for a purpose together with metadata that applies to the
 * collection.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param masterIdentifier Unique Identifier for the set of documents
 * @param status current | superseded | entered-in-error
 * @param type Kind of document set
 * @param subject The subject of the set of documents
 * @param created When this document manifest created
 * @param source The source system/application/software
 * @param description Human-readable description (title)
 */
@SerialName("DocumentManifest")
@Serializable
public data class DocumentManifest(
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
   * Unique Identifier for the set of documents
   */
  public val masterIdentifier: Identifier? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * current | superseded | entered-in-error
   */
  public val status: String? = null,
  /**
   * Kind of document set
   */
  public val type: CodeableConcept? = null,
  /**
   * The subject of the set of documents
   */
  public val subject: Reference? = null,
  /**
   * When this document manifest created
   */
  public val created: String? = null,
  public val author: List<Reference> = emptyList(),
  public val recipient: List<Reference> = emptyList(),
  /**
   * The source system/application/software
   */
  public val source: String? = null,
  /**
   * Human-readable description (title)
   */
  public val description: String? = null,
  public val content: List<Reference> = emptyList(),
  public val related: List<DocumentManifestRelated> = emptyList(),
) : DomainResource
