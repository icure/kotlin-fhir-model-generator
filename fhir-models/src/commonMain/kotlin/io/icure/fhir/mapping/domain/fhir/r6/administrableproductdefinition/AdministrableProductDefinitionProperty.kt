//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.administrableproductdefinition

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Characteristics e.g. a product's onset of action
 *
 * Characteristics e.g. a product's onset of action.
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
 * @param status The status of characteristic e.g. assigned or pending
 */
@SerialName("AdministrableProductDefinitionProperty")
@Serializable
public data class AdministrableProductDefinitionProperty(
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
  /**
   * The status of characteristic e.g. assigned or pending
   */
  public val status: CodeableConcept? = null,
) : BackboneElement
