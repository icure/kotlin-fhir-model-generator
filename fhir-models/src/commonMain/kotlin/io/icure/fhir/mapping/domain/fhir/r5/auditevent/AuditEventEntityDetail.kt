//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.auditevent

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.period.Period
import io.icure.fhir.mapping.domain.fhir.r5.range.Range
import io.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional Information about the entity
 *
 * Tagged value pairs for conveying additional information about the entity.
 *
 * @param id Unique id for inter-element referencing
 * @param type Name of the property
 * @param valueQuantity Property value
 * @param valueCodeableConcept Property value
 * @param valueString Property value
 * @param valueBoolean Property value
 * @param valueInteger Property value
 * @param valueRange Property value
 * @param valueRatio Property value
 * @param valueTime Property value
 * @param valueDateTime Property value
 * @param valuePeriod Property value
 * @param valueBase64Binary Property value
 */
@SerialName("AuditEventEntityDetail")
@Serializable
public data class AuditEventEntityDetail(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of the property
   */
  public val type: CodeableConcept,
  /**
   * Property value
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Property value
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Property value
   */
  public val valueString: String? = null,
  /**
   * Property value
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Property value
   */
  public val valueInteger: Int? = null,
  /**
   * Property value
   */
  public val valueRange: Range? = null,
  /**
   * Property value
   */
  public val valueRatio: Ratio? = null,
  /**
   * Property value
   */
  public val valueTime: String? = null,
  /**
   * Property value
   */
  public val valueDateTime: String? = null,
  /**
   * Property value
   */
  public val valuePeriod: Period? = null,
  /**
   * Property value
   */
  public val valueBase64Binary: String? = null,
) : BackboneElement
