//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.composition

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.relatedartifact.RelatedArtifact
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A set of resources composed into a single coherent clinical statement with clinical attestation
 *
 * A set of healthcare-related information that is assembled together into a single logical package
 * that provides a single coherent statement of meaning, establishes its own context and that has
 * clinical attestation with regard to who is making the statement. A Composition defines the structure
 * and narrative content necessary for a document. However, a Composition alone does not constitute a
 * document. Rather, the Composition must be the first entry in a Bundle where Bundle.type=document,
 * and any other resources referenced from Composition must be included as subsequent entries in the
 * Bundle (for example Patient, Practitioner, Encounter, etc.).
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this Composition, represented as a URI (globally unique)
 * @param version An explicitly assigned identifier of a variation of the content in the Composition
 * @param status registered | partial | preliminary | final | amended | corrected | appended |
 * cancelled | entered-in-error | deprecated | unknown
 * @param type Kind of composition (LOINC if possible)
 * @param encounter Context of the Composition
 * @param date Composition editing time
 * @param name Name for this Composition (computer friendly)
 * @param title Human Readable name/title
 * @param custodian Organization which maintains the composition
 */
@SerialName("Composition")
@Serializable
public data class Composition(
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
   * Canonical identifier for this Composition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * An explicitly assigned identifier of a variation of the content in the Composition
   */
  public val version: String? = null,
  /**
   * registered | partial | preliminary | final | amended | corrected | appended | cancelled |
   * entered-in-error | deprecated | unknown
   */
  public val status: String? = null,
  /**
   * Kind of composition (LOINC if possible)
   */
  public val type: CodeableConcept,
  public val category: List<CodeableConcept> = emptyList(),
  public val subject: List<Reference> = emptyList(),
  /**
   * Context of the Composition
   */
  public val encounter: Reference? = null,
  /**
   * Composition editing time
   */
  public val date: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val author: List<Reference> = emptyList(),
  /**
   * Name for this Composition (computer friendly)
   */
  public val name: String? = null,
  /**
   * Human Readable name/title
   */
  public val title: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val attester: List<CompositionAttester> = emptyList(),
  /**
   * Organization which maintains the composition
   */
  public val custodian: Reference? = null,
  public val relatesTo: List<RelatedArtifact> = emptyList(),
  public val event: List<CompositionEvent> = emptyList(),
  public val section: List<CompositionSection> = emptyList(),
) : DomainResource
