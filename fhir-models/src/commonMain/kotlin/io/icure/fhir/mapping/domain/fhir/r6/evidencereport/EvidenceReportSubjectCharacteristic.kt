//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.evidencereport

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.period.Period
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Characteristic
 *
 * Characteristic.
 *
 * @param id Unique id for inter-element referencing
 * @param code Characteristic code
 * @param valueReference Characteristic value
 * @param valueCodeableConcept Characteristic value
 * @param valueBoolean Characteristic value
 * @param valueQuantity Characteristic value
 * @param valueRange Characteristic value
 * @param exclude Is used to express not the characteristic
 * @param period Timeframe for the characteristic
 */
@SerialName("EvidenceReportSubjectCharacteristic")
@Serializable
public data class EvidenceReportSubjectCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Characteristic code
   */
  public val code: CodeableConcept,
  /**
   * Characteristic value
   */
  public val valueReference: Reference? = null,
  /**
   * Characteristic value
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Characteristic value
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Characteristic value
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Characteristic value
   */
  public val valueRange: Range? = null,
  /**
   * Is used to express not the characteristic
   */
  public val exclude: Boolean? = null,
  /**
   * Timeframe for the characteristic
   */
  public val period: Period? = null,
) : BackboneElement
