//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.manufactureditemdefinition

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * General characteristics of this item
 *
 * General characteristics of this item.
 *
 * @param id Unique id for inter-element referencing
 * @param type A code expressing the type of characteristic
 * @param valueCodeableConcept A value for the characteristic
 * @param valueQuantity A value for the characteristic
 * @param valueDate A value for the characteristic
 * @param valueBoolean A value for the characteristic
 * @param valueMarkdown A value for the characteristic
 * @param valueAttachment A value for the characteristic
 * @param valueReference A value for the characteristic
 */
@SerialName("ManufacturedItemDefinitionProperty")
@Serializable
public data class ManufacturedItemDefinitionProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A code expressing the type of characteristic
   */
  public val type: CodeableConcept,
  /**
   * A value for the characteristic
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * A value for the characteristic
   */
  public val valueQuantity: Quantity? = null,
  /**
   * A value for the characteristic
   */
  public val valueDate: String? = null,
  /**
   * A value for the characteristic
   */
  public val valueBoolean: Boolean? = null,
  /**
   * A value for the characteristic
   */
  public val valueMarkdown: String? = null,
  /**
   * A value for the characteristic
   */
  public val valueAttachment: Attachment? = null,
  /**
   * A value for the characteristic
   */
  public val valueReference: Reference? = null,
) : BackboneElement
