//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.device

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Inherent, essentially fixed, characteristics of the device.  e.g., time properties, size,
 * material, etc.
 *
 * Static or essentially fixed characteristics or features of the device (e.g., time or timing
 * attributes, resolution, accuracy, intended use or instructions for use, and physical attributes)
 * that are not otherwise captured in more specific attributes.
 *
 * @param id Unique id for inter-element referencing
 * @param type Code that specifies the property being represented
 * @param valueQuantity Value of the property
 * @param valueCodeableConcept Value of the property
 * @param valueString Value of the property
 * @param valueBoolean Value of the property
 * @param valueInteger Value of the property
 * @param valueRange Value of the property
 * @param valueAttachment Value of the property
 */
@SerialName("DeviceProperty")
@Serializable
public data class DeviceProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that specifies the property being represented
   */
  public val type: CodeableConcept,
  /**
   * Value of the property
   */
  public val valueQuantity: Quantity? = null,
  /**
   * Value of the property
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * Value of the property
   */
  public val valueString: String? = null,
  /**
   * Value of the property
   */
  public val valueBoolean: Boolean? = null,
  /**
   * Value of the property
   */
  public val valueInteger: Int? = null,
  /**
   * Value of the property
   */
  public val valueRange: Range? = null,
  /**
   * Value of the property
   */
  public val valueAttachment: Attachment? = null,
) : BackboneElement
