//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.devicemetric

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Measurement, calculation or setting capability of a medical device
 *
 * Describes a measurement, calculation or setting capability of a device.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param type Identity of metric, for example Heart Rate or PEEP Setting
 * @param unit Unit of Measure for the Metric
 * @param device Describes the link to the Device
 * @param operationalStatus on | off | standby | entered-in-error
 * @param color Color name (from CSS4) or #RRGGBB code
 * @param category measurement | setting | calculation | unspecified
 * @param measurementFrequency Indicates how often the metric is taken or recorded
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
   * Describes the link to the Device
   */
  public val device: Reference,
  /**
   * on | off | standby | entered-in-error
   */
  public val operationalStatus: String? = null,
  /**
   * Color name (from CSS4) or #RRGGBB code
   */
  public val color: String? = null,
  /**
   * measurement | setting | calculation | unspecified
   */
  public val category: String? = null,
  /**
   * Indicates how often the metric is taken or recorded
   */
  public val measurementFrequency: Quantity? = null,
  public val calibration: List<DeviceMetricCalibration> = emptyList(),
) : DomainResource
