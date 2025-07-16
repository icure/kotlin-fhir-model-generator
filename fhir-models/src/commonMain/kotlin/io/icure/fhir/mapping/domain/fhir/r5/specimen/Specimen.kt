//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.specimen

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * the source of an environmental sample), or a sampling of a substance, a biologically-derived
 * product, or a device
 * @param receivedTime The time when specimen is received by the testing laboratory
 * @param combined grouped | pooled
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
   * an environmental sample), or a sampling of a substance, a biologically-derived product, or a
   * device
   */
  public val subject: Reference? = null,
  /**
   * The time when specimen is received by the testing laboratory
   */
  public val receivedTime: String? = null,
  public val parent: List<Reference> = emptyList(),
  public val request: List<Reference> = emptyList(),
  /**
   * grouped | pooled
   */
  public val combined: String? = null,
  public val role: List<CodeableConcept> = emptyList(),
  public val feature: List<SpecimenFeature> = emptyList(),
  /**
   * Collection details
   */
  public val collection: SpecimenCollection? = null,
  public val processing: List<SpecimenProcessing> = emptyList(),
  public val container: List<SpecimenContainer> = emptyList(),
  public val condition: List<CodeableConcept> = emptyList(),
  public val note: List<Annotation> = emptyList(),
) : DomainResource
