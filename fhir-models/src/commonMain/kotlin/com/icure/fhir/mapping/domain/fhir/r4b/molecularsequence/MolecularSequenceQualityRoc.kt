//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.molecularsequence

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
