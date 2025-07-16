//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.servicerequest

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The parameter details for the service being requested
 *
 * The parameter details for the service being requested.
 *
 * @param id Unique id for inter-element referencing
 * @param code The detail of the order being requested
 * @param valueQuantity The value for the order detail
 * @param valueRatio The value for the order detail
 * @param valueRange The value for the order detail
 * @param valueBoolean The value for the order detail
 * @param valueCodeableConcept The value for the order detail
 * @param valueString The value for the order detail
 * @param valuePeriod The value for the order detail
 */
@SerialName("ServiceRequestOrderDetailParameter")
@Serializable
public data class ServiceRequestOrderDetailParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The detail of the order being requested
   */
  public val code: CodeableConcept,
  /**
   * The value for the order detail
   */
  public val valueQuantity: Quantity? = null,
  /**
   * The value for the order detail
   */
  public val valueRatio: Ratio? = null,
  /**
   * The value for the order detail
   */
  public val valueRange: Range? = null,
  /**
   * The value for the order detail
   */
  public val valueBoolean: Boolean? = null,
  /**
   * The value for the order detail
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * The value for the order detail
   */
  public val valueString: String? = null,
  /**
   * The value for the order detail
   */
  public val valuePeriod: Period? = null,
) : BackboneElement
