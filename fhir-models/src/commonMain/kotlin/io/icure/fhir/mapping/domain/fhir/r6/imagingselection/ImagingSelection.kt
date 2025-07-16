//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.imagingselection

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A selection of DICOM SOP instances and/or frames
 *
 * A selection of DICOM SOP instances and/or frames within a single Study and Series. This might
 * include additional specifics such as an image region, an Observation UID or a Segmentation Number,
 * allowing linkage to an Observation Resource or transferring this information along with the
 * ImagingStudy Resource.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status available | entered-in-error | unknown
 * @param subject Subject of the selected instances
 * @param issued Date / Time when this imaging selection was created
 * @param code Imaging Selection purpose text or code
 * @param studyUid DICOM Study Instance UID
 * @param seriesUid DICOM Series Instance UID
 * @param seriesNumber DICOM Series Number
 * @param frameOfReferenceUid The Frame of Reference UID for the selected images
 * @param bodySite Body part examined
 */
@SerialName("ImagingSelection")
@Serializable
public data class ImagingSelection(
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
   * available | entered-in-error | unknown
   */
  public val status: String? = null,
  /**
   * Subject of the selected instances
   */
  public val subject: Reference? = null,
  /**
   * Date / Time when this imaging selection was created
   */
  public val issued: String? = null,
  public val performer: List<ImagingSelectionPerformer> = emptyList(),
  public val basedOn: List<Reference> = emptyList(),
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Imaging Selection purpose text or code
   */
  public val code: CodeableConcept,
  /**
   * DICOM Study Instance UID
   */
  public val studyUid: String? = null,
  public val derivedFrom: List<Reference> = emptyList(),
  public val endpoint: List<Reference> = emptyList(),
  /**
   * DICOM Series Instance UID
   */
  public val seriesUid: String? = null,
  /**
   * DICOM Series Number
   */
  public val seriesNumber: Int? = null,
  /**
   * The Frame of Reference UID for the selected images
   */
  public val frameOfReferenceUid: String? = null,
  /**
   * Body part examined
   */
  public val bodySite: CodeableReference? = null,
  public val focus: List<Reference> = emptyList(),
  public val instance: List<ImagingSelectionInstance> = emptyList(),
  public val imageRegion3D: List<ImagingSelectionImageRegion3D> = emptyList(),
) : DomainResource
