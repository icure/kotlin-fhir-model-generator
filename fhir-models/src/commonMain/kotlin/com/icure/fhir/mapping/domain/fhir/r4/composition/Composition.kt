//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.composition

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
 * @param identifier Version-independent identifier for the Composition
 * @param status preliminary | final | amended | entered-in-error
 * @param type Kind of composition (LOINC if possible)
 * @param subject Who and/or what the composition is about
 * @param encounter Context of the Composition
 * @param date Composition editing time
 * @param title Human Readable name/title
 * @param confidentiality As defined by affinity domain
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
   * Version-independent identifier for the Composition
   */
  public val identifier: Identifier? = null,
  /**
   * preliminary | final | amended | entered-in-error
   */
  public val status: String? = null,
  /**
   * Kind of composition (LOINC if possible)
   */
  public val type: CodeableConcept,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Who and/or what the composition is about
   */
  public val subject: Reference? = null,
  /**
   * Context of the Composition
   */
  public val encounter: Reference? = null,
  /**
   * Composition editing time
   */
  public val date: String? = null,
  public val author: List<Reference> = emptyList(),
  /**
   * Human Readable name/title
   */
  public val title: String? = null,
  /**
   * As defined by affinity domain
   */
  public val confidentiality: String? = null,
  public val attester: List<CompositionAttester> = emptyList(),
  /**
   * Organization which maintains the composition
   */
  public val custodian: Reference? = null,
  public val relatesTo: List<CompositionRelatesTo> = emptyList(),
  public val event: List<CompositionEvent> = emptyList(),
  public val section: List<CompositionSection> = emptyList(),
) : DomainResource
