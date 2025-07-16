//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.specimen

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Processing and processing step details
 *
 * Details concerning processing and processing steps for the specimen.
 *
 * @param id Unique id for inter-element referencing
 * @param description Textual description of procedure
 * @param procedure Indicates the treatment step  applied to the specimen
 * @param timeDateTime Date and time of specimen processing
 * @param timePeriod Date and time of specimen processing
 */
@SerialName("SpecimenProcessing")
@Serializable
public data class SpecimenProcessing(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Textual description of procedure
   */
  public val description: String? = null,
  /**
   * Indicates the treatment step  applied to the specimen
   */
  public val procedure: CodeableConcept? = null,
  public val additive: List<Reference> = emptyList(),
  /**
   * Date and time of specimen processing
   */
  public val timeDateTime: String? = null,
  /**
   * Date and time of specimen processing
   */
  public val timePeriod: Period? = null,
) : BackboneElement
