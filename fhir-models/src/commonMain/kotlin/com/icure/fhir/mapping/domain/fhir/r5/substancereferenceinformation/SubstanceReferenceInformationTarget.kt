//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.substancereferenceinformation

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Todo
 *
 * Todo.
 *
 * @param id Unique id for inter-element referencing
 * @param target Todo
 * @param type Todo
 * @param interaction Todo
 * @param organism Todo
 * @param organismType Todo
 * @param amountQuantity Todo
 * @param amountRange Todo
 * @param amountString Todo
 * @param amountType Todo
 */
@SerialName("SubstanceReferenceInformationTarget")
@Serializable
public data class SubstanceReferenceInformationTarget(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Todo
   */
  public val target: Identifier? = null,
  /**
   * Todo
   */
  public val type: CodeableConcept? = null,
  /**
   * Todo
   */
  public val interaction: CodeableConcept? = null,
  /**
   * Todo
   */
  public val organism: CodeableConcept? = null,
  /**
   * Todo
   */
  public val organismType: CodeableConcept? = null,
  /**
   * Todo
   */
  public val amountQuantity: Quantity? = null,
  /**
   * Todo
   */
  public val amountRange: Range? = null,
  /**
   * Todo
   */
  public val amountString: String? = null,
  /**
   * Todo
   */
  public val amountType: CodeableConcept? = null,
  public val source: List<Reference> = emptyList(),
) : BackboneElement
