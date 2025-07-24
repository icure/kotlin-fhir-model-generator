//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.allergyintolerance

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.age.Age
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.range.Range
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.servicelike.ServiceLike
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Allergy or Intolerance (generally: Risk of adverse reaction to a substance)
 *
 * Risk of harmful or undesirable, physiological response which is unique to an individual and
 * associated with exposure to a substance.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param clinicalStatus active | inactive | resolved
 * @param verificationStatus unconfirmed | confirmed | refuted | entered-in-error
 * @param type allergy | intolerance - Underlying mechanism (if known)
 * @param criticality low | high | unable-to-assess
 * @param code Code that identifies the allergy or intolerance
 * @param patient Who the sensitivity is for
 * @param encounter Encounter when the allergy or intolerance was asserted
 * @param onsetDateTime When allergy or intolerance was identified
 * @param onsetAge When allergy or intolerance was identified
 * @param onsetPeriod When allergy or intolerance was identified
 * @param onsetRange When allergy or intolerance was identified
 * @param onsetString When allergy or intolerance was identified
 * @param recordedDate Date first version of the resource instance was recorded
 * @param recorder Who recorded the sensitivity
 * @param asserter Source of the information about the allergy
 * @param lastOccurrence Date(/time) of last known occurrence of a reaction
 */
@SerialName("AllergyIntolerance")
@Serializable
public data class AllergyIntolerance(
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
   * active | inactive | resolved
   */
  public val clinicalStatus: CodeableConcept? = null,
  /**
   * unconfirmed | confirmed | refuted | entered-in-error
   */
  public val verificationStatus: CodeableConcept? = null,
  /**
   * allergy | intolerance - Underlying mechanism (if known)
   */
  public val type: String? = null,
  public val category: List<String> = emptyList(),
  /**
   * low | high | unable-to-assess
   */
  public val criticality: String? = null,
  /**
   * Code that identifies the allergy or intolerance
   */
  public val code: CodeableConcept? = null,
  /**
   * Who the sensitivity is for
   */
  public val patient: Reference,
  /**
   * Encounter when the allergy or intolerance was asserted
   */
  public val encounter: Reference? = null,
  /**
   * When allergy or intolerance was identified
   */
  public val onsetDateTime: String? = null,
  /**
   * When allergy or intolerance was identified
   */
  public val onsetAge: Age? = null,
  /**
   * When allergy or intolerance was identified
   */
  public val onsetPeriod: Period? = null,
  /**
   * When allergy or intolerance was identified
   */
  public val onsetRange: Range? = null,
  /**
   * When allergy or intolerance was identified
   */
  public val onsetString: String? = null,
  /**
   * Date first version of the resource instance was recorded
   */
  public val recordedDate: String? = null,
  /**
   * Who recorded the sensitivity
   */
  public val recorder: Reference? = null,
  /**
   * Source of the information about the allergy
   */
  public val asserter: Reference? = null,
  /**
   * Date(/time) of last known occurrence of a reaction
   */
  public val lastOccurrence: String? = null,
  public val note: List<Annotation> = emptyList(),
  public val reaction: List<AllergyIntoleranceReaction> = emptyList(),
) : ServiceLike, DomainResource
