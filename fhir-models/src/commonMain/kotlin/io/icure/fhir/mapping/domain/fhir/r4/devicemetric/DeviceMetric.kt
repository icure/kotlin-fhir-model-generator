//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.devicemetric

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r4.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Measurement, calculation or setting capability of a medical device
 *
 * Describes a measurement, calculation or setting capability of a medical device.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type Identity of metric, for example Heart Rate or PEEP Setting
 * @param unit Unit of Measure for the Metric
 * @param source Describes the link to the source Device
 * @param parent Describes the link to the parent Device
 * @param operationalStatus on | off | standby | entered-in-error
 * @param color black | red | green | yellow | blue | magenta | cyan | white
 * @param category measurement | setting | calculation | unspecified
 * @param measurementPeriod Describes the measurement repetition time
 */
@SerialName("DeviceMetric")
@Serializable
public data class DeviceMetric(
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
   * Identity of metric, for example Heart Rate or PEEP Setting
   */
  public val type: CodeableConcept,
  /**
   * Unit of Measure for the Metric
   */
  public val unit: CodeableConcept? = null,
  /**
   * Describes the link to the source Device
   */
  public val source: Reference? = null,
  /**
   * Describes the link to the parent Device
   */
  public val parent: Reference? = null,
  /**
   * on | off | standby | entered-in-error
   */
  public val operationalStatus: String? = null,
  /**
   * black | red | green | yellow | blue | magenta | cyan | white
   */
  public val color: String? = null,
  /**
   * measurement | setting | calculation | unspecified
   */
  public val category: String? = null,
  /**
   * Describes the measurement repetition time
   */
  public val measurementPeriod: Timing? = null,
  public val calibration: List<DeviceMetricCalibration> = emptyList(),
) : DomainResource
