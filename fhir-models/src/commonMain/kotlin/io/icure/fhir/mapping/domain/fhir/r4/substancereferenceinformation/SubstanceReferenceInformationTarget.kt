//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancereferenceinformation

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.range.Range
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
