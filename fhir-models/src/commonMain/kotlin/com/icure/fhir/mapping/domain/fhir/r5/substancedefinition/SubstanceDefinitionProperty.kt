//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.attachment.Attachment
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * General specifications for this substance
 *
 * General specifications for this substance.
 *
 * @param id Unique id for inter-element referencing
 * @param type A code expressing the type of property
 * @param valueCodeableConcept A value for the property
 * @param valueQuantity A value for the property
 * @param valueDate A value for the property
 * @param valueBoolean A value for the property
 * @param valueAttachment A value for the property
 */
@SerialName("SubstanceDefinitionProperty")
@Serializable
public data class SubstanceDefinitionProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A code expressing the type of property
   */
  public val type: CodeableConcept,
  /**
   * A value for the property
   */
  public val valueCodeableConcept: CodeableConcept? = null,
  /**
   * A value for the property
   */
  public val valueQuantity: Quantity? = null,
  /**
   * A value for the property
   */
  public val valueDate: String? = null,
  /**
   * A value for the property
   */
  public val valueBoolean: Boolean? = null,
  /**
   * A value for the property
   */
  public val valueAttachment: Attachment? = null,
) : BackboneElement
