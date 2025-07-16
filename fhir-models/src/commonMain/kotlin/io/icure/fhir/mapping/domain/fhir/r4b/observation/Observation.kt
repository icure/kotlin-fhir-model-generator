//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.observation

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import io.icure.fhir.mapping.domain.fhir.r4b.range.Range
import io.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4b.sampleddata.SampledData
import io.icure.fhir.mapping.domain.fhir.r4b.servicelike.ServiceLike
import io.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Measurements and simple assertions
 *
 * Measurements and simple assertions made about a patient, device or other subject.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status registered | preliminary | final | amended +
 * @param code Type of observation (code / type)
 * @param subject Who and/or what the observation is about
 * @param encounter Healthcare event during which this observation is made
 * @param effectiveDateTime Clinically relevant time/time-period for observation
 * @param effectivePeriod Clinically relevant time/time-period for observation
 * @param effectiveTiming Clinically relevant time/time-period for observation
 * @param effectiveInstant Clinically relevant time/time-period for observation
 * @param issued Date/Time this version was made available
 * @param valueQuantity Actual result
 * @param valueCodeableConcept Actual result
 * @param valueString Actual result
 * @param valueBoolean Actual result
 * @param valueInteger Actual result
 * @param valueRange Actual result
 * @param valueRatio Actual result
 * @param valueSampledData Actual result
 * @param valueTime Actual result
 * @param valueDateTime Actual result
 * @param valuePeriod Actual result
 * @param dataAbsentReason Why the result is missing
 * @param bodySite Observed body part
 * @param method How it was done
 * @param specimen Specimen used for this observation
 * @param device (Measurement) Device
 */
@SerialName("Observation")
@Serializable
public data class Observation(
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
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * registered | preliminary | final | amended +
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Type of observation (code / type)
   */
  public val code: CodeableConcept,
  /**
   * Who and/or what the observation is about
   */
  public val subject: Reference? = null,
  public val focus: List<Reference> = emptyList(),
  /**
   * Healthcare event during which this observation is made
   */
  public val encounter: Reference? = null,
  /**
   * Clinically relevant time/time-period for observation
   */
  public val effectiveDateTime: String? = null,
  /**
   * Clinically relevant time/time-period for observation
   */
  public val effectivePeriod: Period? = null,
  /**
   * Clinically relevant time/time-period for observation
   */
  public val effectiveTiming: Timing? = null,
  /**
   * Clinically relevant time/time-period for observation
   */
  public val effectiveInstant: String? = null,
  /**
   * Date/Time this version was made available
   */
  public val issued: String? = null,
  public val performer: List<Reference> = emptyList(),
  /**
   * Actual result
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Actual result
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Actual result
   */
  public val valueString: String? = null,
  /**
   * Actual result
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Actual result
   */
  public val valueInteger: Int? = null,
  /**
   * Actual result
   */
  public val valueRange: Range? = null,
  /**
   * Actual result
   */
  public val valueRatio: Ratio? = null,
  /**
   * Actual result
   */
  public val valueSampledData: SampledData? = null,
  /**
   * Actual result
   */
  public val valueTime: String? = null,
  /**
   * Actual result
   */
  public val valueDateTime: String? = null,
  /**
   * Actual result
   */
  public val valuePeriod: Period? = null,
  /**
   * Why the result is missing
   */
  public val dataAbsentReason: CodeableConcept? = null,
  public val interpretation: List<CodeableConcept> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  /**
   * Observed body part
   */
  public val bodySite: CodeableConcept? = null,
  /**
   * How it was done
   */
  public val method: CodeableConcept? = null,
  /**
   * Specimen used for this observation
   */
  public val specimen: Reference? = null,
  /**
   * (Measurement) Device
   */
  public val device: Reference? = null,
  public val referenceRange: List<ObservationReferenceRange> = emptyList(),
  public val hasMember: List<Reference> = emptyList(),
  public val derivedFrom: List<Reference> = emptyList(),
  public val component: List<ObservationComponent> = emptyList(),
) : ServiceLike, DomainResource
