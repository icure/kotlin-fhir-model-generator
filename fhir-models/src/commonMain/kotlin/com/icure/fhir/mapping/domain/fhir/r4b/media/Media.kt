//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.media

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be
 * inline or provided by direct reference
 *
 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be
 * inline or provided by direct reference.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status preparation | in-progress | not-done | on-hold | stopped | completed |
 * entered-in-error | unknown
 * @param type Classification of media as image, video, or audio
 * @param modality The type of acquisition equipment/process
 * @param view Imaging view, e.g. Lateral or Antero-posterior
 * @param subject Who/What this Media is a record of
 * @param encounter Encounter associated with media
 * @param createdDateTime When Media was collected
 * @param createdPeriod When Media was collected
 * @param issued Date/Time this version was made available
 * @param operator The person who generated the image
 * @param bodySite Observed body part
 * @param deviceName Name of the device/manufacturer
 * @param device Observing Device
 * @param height Height of the image in pixels (photo/video)
 * @param width Width of the image in pixels (photo/video)
 * @param frames Number of frames if > 1 (photo)
 * @param duration Length in seconds (audio / video)
 * @param content Actual Media - reference or data
 */
@SerialName("Media")
@Serializable
public data class Media(
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
   * preparation | in-progress | not-done | on-hold | stopped | completed | entered-in-error |
   * unknown
   */
  public val status: String? = null,
  /**
   * Classification of media as image, video, or audio
   */
  public val type: CodeableConcept? = null,
  /**
   * The type of acquisition equipment/process
   */
  public val modality: CodeableConcept? = null,
  /**
   * Imaging view, e.g. Lateral or Antero-posterior
   */
  public val view: CodeableConcept? = null,
  /**
   * Who/What this Media is a record of
   */
  public val subject: Reference? = null,
  /**
   * Encounter associated with media
   */
  public val encounter: Reference? = null,
  /**
   * When Media was collected
   */
  public val createdDateTime: String? = null,
  /**
   * When Media was collected
   */
  public val createdPeriod: Period? = null,
  /**
   * Date/Time this version was made available
   */
  public val issued: String? = null,
  /**
   * The person who generated the image
   */
  public val `operator`: Reference? = null,
  public val reasonCode: List<CodeableConcept> = emptyList(),
  /**
   * Observed body part
   */
  public val bodySite: CodeableConcept? = null,
  /**
   * Name of the device/manufacturer
   */
  public val deviceName: String? = null,
  /**
   * Observing Device
   */
  public val device: Reference? = null,
  /**
   * Height of the image in pixels (photo/video)
   */
  public val height: Int? = null,
  /**
   * Width of the image in pixels (photo/video)
   */
  public val width: Int? = null,
  /**
   * Number of frames if > 1 (photo)
   */
  public val frames: Int? = null,
  /**
   * Length in seconds (audio / video)
   */
  public val duration: Float? = null,
  /**
   * Actual Media - reference or data
   */
  public val content: Attachment,
  public val note: List<Annotation> = emptyList(),
) : DomainResource
