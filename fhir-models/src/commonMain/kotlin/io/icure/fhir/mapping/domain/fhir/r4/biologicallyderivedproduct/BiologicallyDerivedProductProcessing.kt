//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.biologicallyderivedproduct

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
 * Any processing of the product during collection
 *
 * Any processing of the product during collection that does not change the fundamental nature of
 * the product. For example adding anti-coagulants during the collection of Peripheral Blood Stem
 * Cells.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of of processing
 * @param procedure Procesing code
 * @param additive Substance added during processing
 * @param timeDateTime Time of processing
 * @param timePeriod Time of processing
 */
@SerialName("BiologicallyDerivedProductProcessing")
@Serializable
public data class BiologicallyDerivedProductProcessing(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of of processing
   */
  public val description: String? = null,
  /**
   * Procesing code
   */
  public val procedure: CodeableConcept? = null,
  /**
   * Substance added during processing
   */
  public val additive: Reference? = null,
  /**
   * Time of processing
   */
  public val timeDateTime: String? = null,
  /**
   * Time of processing
   */
  public val timePeriod: Period? = null,
) : BackboneElement
