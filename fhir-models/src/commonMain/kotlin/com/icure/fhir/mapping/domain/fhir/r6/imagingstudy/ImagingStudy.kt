//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.imagingstudy

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A set of images produced in single study (one or more series of references images)
 *
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of
 * series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or
 * other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray,
 * CT, MR, ultrasound), but a study may have multiple series of different modalities.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status registered | available | cancelled | entered-in-error | unknown
 * @param subject Who or what is the subject of the study
 * @param encounter Encounter with which this imaging study is associated
 * @param started When the study was started
 * @param referrer Referring physician
 * @param numberOfSeries Number of Study Related Series
 * @param numberOfInstances Number of Study Related Instances
 * @param location Where ImagingStudy occurred
 * @param description Institution-generated description
 */
@SerialName("ImagingStudy")
@Serializable
public data class ImagingStudy(
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
   * registered | available | cancelled | entered-in-error | unknown
   */
  public val status: String? = null,
  public val modality: List<CodeableConcept> = emptyList(),
  /**
   * Who or what is the subject of the study
   */
  public val subject: Reference,
  /**
   * Encounter with which this imaging study is associated
   */
  public val encounter: Reference? = null,
  /**
   * When the study was started
   */
  public val started: String? = null,
  public val basedOn: List<Reference> = emptyList(),
  public val partOf: List<Reference> = emptyList(),
  /**
   * Referring physician
   */
  public val referrer: Reference? = null,
  public val endpoint: List<Reference> = emptyList(),
  /**
   * Number of Study Related Series
   */
  public val numberOfSeries: Int? = null,
  /**
   * Number of Study Related Instances
   */
  public val numberOfInstances: Int? = null,
  public val procedure: List<CodeableReference> = emptyList(),
  /**
   * Where ImagingStudy occurred
   */
  public val location: Reference? = null,
  public val reason: List<CodeableReference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  /**
   * Institution-generated description
   */
  public val description: String? = null,
  public val series: List<ImagingStudySeries> = emptyList(),
) : DomainResource
