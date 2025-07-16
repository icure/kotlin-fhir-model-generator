//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.imagingstudy

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who performed the series
 *
 * Indicates who or what performed the series and how they were involved.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of performance
 * @param actor Who performed the series
 */
@SerialName("ImagingStudySeriesPerformer")
@Serializable
public data class ImagingStudySeriesPerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of performance
   */
  public val function: CodeableConcept? = null,
  /**
   * Who performed the series
   */
  public val actor: Reference,
) : BackboneElement
