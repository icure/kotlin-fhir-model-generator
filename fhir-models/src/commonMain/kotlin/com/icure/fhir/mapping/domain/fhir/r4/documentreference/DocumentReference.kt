//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.documentreference

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
 * A reference to a document
 *
 * A reference to a document of any kind for any purpose. Provides metadata about the document so
 * that the document can be discovered and managed. The scope of a document is any seralized object
 * with a mime-type, so includes formal patient centric documents (CDA), cliical notes, scanned paper,
 * and non-patient specific documents like policy text.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param masterIdentifier Master Version Specific Identifier
 * @param status current | superseded | entered-in-error
 * @param docStatus preliminary | final | amended | entered-in-error
 * @param type Kind of document (LOINC if possible)
 * @param subject Who/what is the subject of the document
 * @param date When this document reference was created
 * @param authenticator Who/what authenticated the document
 * @param custodian Organization which maintains the document
 * @param description Human-readable description
 * @param context Clinical context of document
 */
@SerialName("DocumentReference")
@Serializable
public data class DocumentReference(
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
   * Master Version Specific Identifier
   */
  public val masterIdentifier: Identifier? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * current | superseded | entered-in-error
   */
  public val status: String? = null,
  /**
   * preliminary | final | amended | entered-in-error
   */
  public val docStatus: String? = null,
  /**
   * Kind of document (LOINC if possible)
   */
  public val type: CodeableConcept? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Who/what is the subject of the document
   */
  public val subject: Reference? = null,
  /**
   * When this document reference was created
   */
  public val date: String? = null,
  public val author: List<Reference> = emptyList(),
  /**
   * Who/what authenticated the document
   */
  public val authenticator: Reference? = null,
  /**
   * Organization which maintains the document
   */
  public val custodian: Reference? = null,
  public val relatesTo: List<DocumentReferenceRelatesTo> = emptyList(),
  /**
   * Human-readable description
   */
  public val description: String? = null,
  public val securityLabel: List<CodeableConcept> = emptyList(),
  public val content: List<DocumentReferenceContent> = emptyList(),
  /**
   * Clinical context of document
   */
  public val context: DocumentReferenceContext? = null,
) : DomainResource
