//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.molecularsequence

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Receiver Operator Characteristic (ROC) Curve
 *
 * Receiver Operator Characteristic (ROC) Curve  to give sensitivity/specificity tradeoff.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("MolecularSequenceQualityRoc")
@Serializable
public data class MolecularSequenceQualityRoc(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val score: List<Int> = emptyList(),
  public val numTP: List<Int> = emptyList(),
  public val numFP: List<Int> = emptyList(),
  public val numFN: List<Int> = emptyList(),
  public val precision: List<Float> = emptyList(),
  public val sensitivity: List<Float> = emptyList(),
  public val fMeasure: List<Float> = emptyList(),
) : BackboneElement
