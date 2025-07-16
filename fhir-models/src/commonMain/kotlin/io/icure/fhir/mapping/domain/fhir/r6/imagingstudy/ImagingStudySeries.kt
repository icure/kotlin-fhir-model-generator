//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.imagingstudy

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Each study has one or more series of instances
 *
 * Each study has one or more series of images or other content.
 *
 * @param id Unique id for inter-element referencing
 * @param uid DICOM Series Instance UID for the series
 * @param number Numeric identifier of this series
 * @param modality The modality used for this series
 * @param description A short human readable summary of the series
 * @param numberOfInstances Number of Series Related Instances
 * @param bodySite Body part examined
 * @param laterality Body part laterality
 * @param started When the series started
 */
@SerialName("ImagingStudySeries")
@Serializable
public data class ImagingStudySeries(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * DICOM Series Instance UID for the series
   */
  public val uid: String? = null,
  /**
   * Numeric identifier of this series
   */
  public val number: Int? = null,
  /**
   * The modality used for this series
   */
  public val modality: CodeableConcept,
  /**
   * A short human readable summary of the series
   */
  public val description: String? = null,
  /**
   * Number of Series Related Instances
   */
  public val numberOfInstances: Int? = null,
  public val endpoint: List<Reference> = emptyList(),
  /**
   * Body part examined
   */
  public val bodySite: CodeableReference? = null,
  /**
   * Body part laterality
   */
  public val laterality: CodeableConcept? = null,
  public val specimen: List<Reference> = emptyList(),
  /**
   * When the series started
   */
  public val started: String? = null,
  public val performer: List<ImagingStudySeriesPerformer> = emptyList(),
  public val instance: List<ImagingStudySeriesInstance> = emptyList(),
) : BackboneElement
