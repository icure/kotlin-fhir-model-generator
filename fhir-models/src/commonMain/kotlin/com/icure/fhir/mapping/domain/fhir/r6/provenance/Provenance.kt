//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.provenance

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.signature.Signature
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who, What, When for a set of resources
 *
 * Provenance of a resource is a record that describes entities and processes involved in producing
 * and delivering or otherwise influencing that resource. Provenance provides a critical foundation for
 * assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a
 * form of contextual metadata and can themselves become important records with their own provenance.
 * Provenance statement indicates clinical significance in terms of confidence in authenticity,
 * reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has
 * the artifact been legally authenticated), all of which may impact security, privacy, and trust
 * policies.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param occurredPeriod When the activity occurred
 * @param occurredDateTime When the activity occurred
 * @param recorded When the activity was recorded / updated
 * @param location Where the activity occurred, if relevant
 * @param activity Activity that occurred
 * @param patient The patient is the subject of the data created/updated (.target) by the activity
 * @param encounter Encounter within which this event occurred or which the event is tightly
 * associated
 */
@SerialName("Provenance")
@Serializable
public data class Provenance(
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
  public val target: List<Reference> = emptyList(),
  /**
   * When the activity occurred
   */
  public val occurredPeriod: Period? = null,
  /**
   * When the activity occurred
   */
  public val occurredDateTime: String? = null,
  /**
   * When the activity was recorded / updated
   */
  public val recorded: String? = null,
  public val policy: List<String> = emptyList(),
  /**
   * Where the activity occurred, if relevant
   */
  public val location: Reference? = null,
  public val authorization: List<CodeableReference> = emptyList(),
  /**
   * Activity that occurred
   */
  public val activity: CodeableConcept? = null,
  public val basedOn: List<Reference> = emptyList(),
  /**
   * The patient is the subject of the data created/updated (.target) by the activity
   */
  public val patient: Reference? = null,
  /**
   * Encounter within which this event occurred or which the event is tightly associated
   */
  public val encounter: Reference? = null,
  public val agent: List<ProvenanceAgent> = emptyList(),
  public val entity: List<ProvenanceEntity> = emptyList(),
  public val signature: List<Signature> = emptyList(),
) : DomainResource
