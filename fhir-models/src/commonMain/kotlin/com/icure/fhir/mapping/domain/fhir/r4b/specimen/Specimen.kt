//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.specimen

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
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
 * Sample for analysis
 *
 * A sample to be used for analysis.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param accessionIdentifier Identifier assigned by the lab
 * @param status available | unavailable | unsatisfactory | entered-in-error
 * @param type Kind of material that forms the specimen
 * @param subject Where the specimen came from. This may be from patient(s), from a location (e.g.,
 * the source of an environmental sample), or a sampling of a substance or a device
 * @param receivedTime The time when specimen was received for processing
 * @param collection Collection details
 */
@SerialName("Specimen")
@Serializable
public data class Specimen(
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
   * Identifier assigned by the lab
   */
  public val accessionIdentifier: Identifier? = null,
  /**
   * available | unavailable | unsatisfactory | entered-in-error
   */
  public val status: String? = null,
  /**
   * Kind of material that forms the specimen
   */
  public val type: CodeableConcept? = null,
  /**
   * Where the specimen came from. This may be from patient(s), from a location (e.g., the source of
   * an environmental sample), or a sampling of a substance or a device
   */
  public val subject: Reference? = null,
  /**
   * The time when specimen was received for processing
   */
  public val receivedTime: String? = null,
  public val parent: List<Reference> = emptyList(),
  public val request: List<Reference> = emptyList(),
  /**
   * Collection details
   */
  public val collection: SpecimenCollection? = null,
  public val processing: List<SpecimenProcessing> = emptyList(),
  public val container: List<SpecimenContainer> = emptyList(),
  public val condition: List<CodeableConcept> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
