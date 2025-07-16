//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.immunization

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Educational material presented to patient
 *
 * Educational material presented to the patient (or guardian) at the time of vaccine
 * administration.
 *
 * @param id Unique id for inter-element referencing
 * @param documentType Educational material document identifier
 * @param reference Educational material reference pointer
 * @param publicationDate Educational material publication date
 * @param presentationDate Educational material presentation date
 */
@SerialName("ImmunizationEducation")
@Serializable
public data class ImmunizationEducation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Educational material document identifier
   */
  public val documentType: String? = null,
  /**
   * Educational material reference pointer
   */
  public val reference: String? = null,
  /**
   * Educational material publication date
   */
  public val publicationDate: String? = null,
  /**
   * Educational material presentation date
   */
  public val presentationDate: String? = null,
) : BackboneElement
