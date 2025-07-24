//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.molecularsequence

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An set of value as quality of sequence
 *
 * An experimental feature attribute that defines the quality of the feature in a quantitative way,
 * such as a phred quality score
 * ([SO:0001686](http://www.sequenceontology.org/browser/current_svn/term/SO:0001686)).
 *
 * @param id Unique id for inter-element referencing
 * @param type indel | snp | unknown
 * @param standardSequence Standard sequence for comparison
 * @param start Start position of the sequence
 * @param end End position of the sequence
 * @param score Quality score for the comparison
 * @param method Method to get quality
 * @param truthTP True positives from the perspective of the truth data
 * @param queryTP True positives from the perspective of the query data
 * @param truthFN False negatives
 * @param queryFP False positives
 * @param gtFP False positives where the non-REF alleles in the Truth and Query Call Sets match
 * @param precision Precision of comparison
 * @param recall Recall of comparison
 * @param fScore F-score
 * @param roc Receiver Operator Characteristic (ROC) Curve
 */
@SerialName("MolecularSequenceQuality")
@Serializable
public data class MolecularSequenceQuality(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * indel | snp | unknown
   */
  public val type: String? = null,
  /**
   * Standard sequence for comparison
   */
  public val standardSequence: CodeableConcept? = null,
  /**
   * Start position of the sequence
   */
  public val start: Int? = null,
  /**
   * End position of the sequence
   */
  public val end: Int? = null,
  /**
   * Quality score for the comparison
   */
  public val score: Quantity? = null,
  /**
   * Method to get quality
   */
  public val method: CodeableConcept? = null,
  /**
   * True positives from the perspective of the truth data
   */
  public val truthTP: Float? = null,
  /**
   * True positives from the perspective of the query data
   */
  public val queryTP: Float? = null,
  /**
   * False negatives
   */
  public val truthFN: Float? = null,
  /**
   * False positives
   */
  public val queryFP: Float? = null,
  /**
   * False positives where the non-REF alleles in the Truth and Query Call Sets match
   */
  public val gtFP: Float? = null,
  /**
   * Precision of comparison
   */
  public val precision: Float? = null,
  /**
   * Recall of comparison
   */
  public val recall: Float? = null,
  /**
   * F-score
   */
  public val fScore: Float? = null,
  /**
   * Receiver Operator Characteristic (ROC) Curve
   */
  public val roc: MolecularSequenceQualityRoc? = null,
) : BackboneElement
