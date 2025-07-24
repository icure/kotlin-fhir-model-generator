//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.deviceusestatement

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Record of use of a device
 *
 * A record of a device being used by a patient where the record is the result of a report from the
 * patient or another clinician.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status active | completed | entered-in-error +
 * @param subject Patient using device
 * @param timingTiming How often  the device was used
 * @param timingPeriod How often  the device was used
 * @param timingDateTime How often  the device was used
 * @param recordedOn When statement was recorded
 * @param source Who made the statement
 * @param device Reference to device used
 * @param bodySite Target body site
 */
@SerialName("DeviceUseStatement")
@Serializable
public data class DeviceUseStatement(
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
   * active | completed | entered-in-error +
   */
  public val status: String? = null,
  /**
   * Patient using device
   */
  public val subject: Reference,
  public val derivedFrom: List<Reference> = emptyList(),
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
   * When statement was recorded
   */
  public val recordedOn: String? = null,
  /**
   * Who made the statement
   */
  public val source: Reference? = null,
  /**
   * Reference to device used
   */
  public val device: Reference,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  public val reasonReference: List<Reference> = emptyList(),
  /**
   * Target body site
   */
  public val bodySite: CodeableConcept? = null,
  public val note: List<Annotation> = emptyList(),
) : DomainResource
