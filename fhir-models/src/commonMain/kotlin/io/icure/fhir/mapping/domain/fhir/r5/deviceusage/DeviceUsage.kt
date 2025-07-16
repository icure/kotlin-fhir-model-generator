//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.deviceusage

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.`annotation`.Annotation
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import io.icure.fhir.mapping.domain.fhir.r5.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Record of use of a device
 *
 * A record of a device being used by a patient where the record is the result of a report from the
 * patient or a clinician.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | completed | not-done | entered-in-error +
 * @param patient Patient using device
 * @param context The encounter or episode of care that establishes the context for this device use
 * statement
 * @param timingTiming How often  the device was used
 * @param timingPeriod How often  the device was used
 * @param timingDateTime How often  the device was used
 * @param dateAsserted When the statement was made (and recorded)
 * @param usageStatus The status of the device usage, for example always, sometimes, never. This is
 * not the same as the status of the statement
 * @param adherence How device is being used
 * @param informationSource Who made the statement
 * @param device Code or Reference to device used
 * @param bodySite Target body site
 */
@SerialName("DeviceUsage")
@Serializable
public data class DeviceUsage(
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
  /**
   * active | completed | not-done | entered-in-error +
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Patient using device
   */
  public val patient: Reference,
  public val derivedFrom: List<Reference> = emptyList(),
  /**
   * The encounter or episode of care that establishes the context for this device use statement
   */
  public val context: Reference? = null,
  /**
   * How often  the device was used
   */
  public val timingTiming: Timing? = null,
  /**
   * How often  the device was used
   */
  public val timingPeriod: Period? = null,
  /**
   * How often  the device was used
   */
  public val timingDateTime: String? = null,
  /**
   * When the statement was made (and recorded)
   */
  public val dateAsserted: String? = null,
  /**
   * The status of the device usage, for example always, sometimes, never. This is not the same as
   * the status of the statement
   */
  public val usageStatus: CodeableConcept? = null,
  public val usageReason: List<CodeableConcept> = emptyList(),
  /**
   * How device is being used
   */
  public val adherence: DeviceUsageAdherence? = null,
  /**
   * Who made the statement
   */
  public val informationSource: Reference? = null,
  /**
   * Code or Reference to device used
   */
  public val device: CodeableReference,
  public val reason: List<CodeableReference> = emptyList(),
  /**
   * Target body site
   */
  public val bodySite: CodeableReference? = null,
  public val note: List<Annotation> = emptyList(),
) : DomainResource
