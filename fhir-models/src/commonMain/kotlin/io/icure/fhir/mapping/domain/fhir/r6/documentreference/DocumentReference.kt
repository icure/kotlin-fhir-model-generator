//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.documentreference

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A reference to a document
 *
 * A reference to a document of any kind for any purpose. While the term “document” implies a more
 * narrow focus, for this resource this "document" encompasses *any* serialized object with a
 * mime-type, it includes formal patient-centric documents (CDA), clinical notes, scanned paper,
 * non-patient specific documents like policy text, as well as a photo, video, or audio recording
 * acquired or used in healthcare.  The DocumentReference resource provides metadata about the document
 * so that the document can be discovered and managed.  The actual content may be inline base64 encoded
 * data or provided by direct reference.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param version An explicitly assigned identifier of a variation of the content in the
 * DocumentReference
 * @param status current | superseded | entered-in-error
 * @param docStatus registered | partial | preliminary | final | amended | corrected | appended |
 * cancelled | entered-in-error | deprecated | unknown
 * @param type Kind of document (LOINC if possible)
 * @param subject Who/what is the subject of the document
 * @param facilityType Kind of facility where patient was seen
 * @param practiceSetting Additional details about where the content was created (e.g. clinical
 * specialty)
 * @param period Time of service that is being documented
 * @param date When this document reference was created
 * @param custodian Organization which maintains the document
 * @param description Human-readable description
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
  public val identifier: List<Identifier> = emptyList(),
  /**
   * An explicitly assigned identifier of a variation of the content in the DocumentReference
   */
  public val version: String? = null,
  public val basedOn: List<Reference> = emptyList(),
  /**
   * current | superseded | entered-in-error
   */
  public val status: String? = null,
  /**
   * registered | partial | preliminary | final | amended | corrected | appended | cancelled |
   * entered-in-error | deprecated | unknown
   */
  public val docStatus: String? = null,
  public val modality: List<CodeableConcept> = emptyList(),
  /**
   * Kind of document (LOINC if possible)
   */
  public val type: CodeableConcept? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Who/what is the subject of the document
   */
  public val subject: Reference? = null,
  public val context: List<Reference> = emptyList(),
  public val event: List<CodeableReference> = emptyList(),
  public val bodySite: List<CodeableReference> = emptyList(),
  /**
   * Kind of facility where patient was seen
   */
  public val facilityType: CodeableConcept? = null,
  /**
   * Additional details about where the content was created (e.g. clinical specialty)
   */
  public val practiceSetting: CodeableConcept? = null,
  /**
   * Time of service that is being documented
   */
  public val period: Period? = null,
  /**
   * When this document reference was created
   */
  public val date: String? = null,
  public val author: List<Reference> = emptyList(),
  public val attester: List<DocumentReferenceAttester> = emptyList(),
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
) : DomainResource
