//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.productshelflife

import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The shelf-life and storage information for a medicinal product item or container can be described
 * using this class
 *
 * The shelf-life and storage information for a medicinal product item or container can be described
 * using this class.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Unique identifier for the packaged Medicinal Product
 * @param type This describes the shelf life, taking into account various scenarios such as shelf
 * life of the packaged Medicinal Product itself, shelf life after transformation where necessary and
 * shelf life after the first opening of a bottle, etc. The shelf life type shall be specified using an
 * appropriate controlled vocabulary The controlled term and the controlled term identifier shall be
 * specified
 * @param period The shelf life time period can be specified using a numerical value for the period
 * of time and its unit of time measurement The unit of measurement shall be specified in accordance
 * with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used
 */
@SerialName("ProductShelfLife")
@Serializable
public data class ProductShelfLife(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Unique identifier for the packaged Medicinal Product
   */
  public val identifier: Identifier? = null,
  /**
   * This describes the shelf life, taking into account various scenarios such as shelf life of the
   * packaged Medicinal Product itself, shelf life after transformation where necessary and shelf life
   * after the first opening of a bottle, etc. The shelf life type shall be specified using an
   * appropriate controlled vocabulary The controlled term and the controlled term identifier shall be
   * specified
   */
  public val type: CodeableConcept,
  /**
   * The shelf life time period can be specified using a numerical value for the period of time and
   * its unit of time measurement The unit of measurement shall be specified in accordance with ISO
   * 11240 and the resulting terminology The symbol and the symbol identifier shall be used
   */
  public val period: Quantity,
  public val specialPrecautionsForStorage: List<CodeableConcept> = emptyList(),
) : BackboneElement
