//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.evidence

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Values and parameters for a single statistic
 *
 * Values and parameters for a single statistic.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of content
 * @param statisticType Type of statistic, eg relative risk
 * @param category Associated category for categorical variable
 * @param quantity Statistic value
 * @param numberOfEvents The number of events associated with the statistic
 * @param numberAffected The number of participants affected
 * @param sampleSize Number of samples in the statistic
 */
@SerialName("EvidenceStatistic")
@Serializable
public data class EvidenceStatistic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of content
   */
  public val description: String? = null,
  public val note: List<Annotation> = emptyList(),
  /**
   * Type of statistic, eg relative risk
   */
  public val statisticType: CodeableConcept? = null,
  /**
   * Associated category for categorical variable
   */
  public val category: CodeableConcept? = null,
  /**
   * Statistic value
   */
  public val quantity: Quantity? = null,
  /**
   * The number of events associated with the statistic
   */
  public val numberOfEvents: Int? = null,
  /**
   * The number of participants affected
   */
  public val numberAffected: Int? = null,
  /**
   * Number of samples in the statistic
   */
  public val sampleSize: EvidenceStatisticSampleSize? = null,
  public val attributeEstimate: List<EvidenceStatisticAttributeEstimate> = emptyList(),
  public val modelCharacteristic: List<EvidenceStatisticModelCharacteristic> = emptyList(),
) : BackboneElement
