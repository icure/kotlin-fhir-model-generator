//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.substancedefinition

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
