//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.prodcharacteristic

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.attachment.Attachment
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available
 *
 * The marketing status describes the date when a medicinal product is actually put on the market or
 * the date as of which it is no longer available.
 *
 * @param id Unique id for inter-element referencing
 * @param height Where applicable, the height can be specified using a numerical value and its unit
 * of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
 * resulting terminology The symbol and the symbol identifier shall be used
 * @param width Where applicable, the width can be specified using a numerical value and its unit of
 * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
 * resulting terminology The symbol and the symbol identifier shall be used
 * @param depth Where applicable, the depth can be specified using a numerical value and its unit of
 * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
 * resulting terminology The symbol and the symbol identifier shall be used
 * @param weight Where applicable, the weight can be specified using a numerical value and its unit
 * of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
 * resulting terminology The symbol and the symbol identifier shall be used
 * @param nominalVolume Where applicable, the nominal volume can be specified using a numerical
 * value and its unit of measurement The unit of measurement shall be specified in accordance with ISO
 * 11240 and the resulting terminology The symbol and the symbol identifier shall be used
 * @param externalDiameter Where applicable, the external diameter can be specified using a
 * numerical value and its unit of measurement The unit of measurement shall be specified in accordance
 * with ISO 11240 and the resulting terminology The symbol and the symbol identifier shall be used
 * @param shape Where applicable, the shape can be specified An appropriate controlled vocabulary
 * shall be used The term and the term identifier shall be used
 * @param scoring Where applicable, the scoring can be specified An appropriate controlled
 * vocabulary shall be used The term and the term identifier shall be used
 */
@SerialName("ProdCharacteristic")
@Serializable
public data class ProdCharacteristic(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Where applicable, the height can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  public val height: Quantity? = null,
  /**
   * Where applicable, the width can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  public val width: Quantity? = null,
  /**
   * Where applicable, the depth can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  public val depth: Quantity? = null,
  /**
   * Where applicable, the weight can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  public val weight: Quantity? = null,
  /**
   * Where applicable, the nominal volume can be specified using a numerical value and its unit of
   * measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  public val nominalVolume: Quantity? = null,
  /**
   * Where applicable, the external diameter can be specified using a numerical value and its unit
   * of measurement The unit of measurement shall be specified in accordance with ISO 11240 and the
   * resulting terminology The symbol and the symbol identifier shall be used
   */
  public val externalDiameter: Quantity? = null,
  /**
   * Where applicable, the shape can be specified An appropriate controlled vocabulary shall be used
   * The term and the term identifier shall be used
   */
  public val shape: String? = null,
  public val color: List<String> = emptyList(),
  public val imprint: List<String> = emptyList(),
  public val image: List<Attachment> = emptyList(),
  /**
   * Where applicable, the scoring can be specified An appropriate controlled vocabulary shall be
   * used The term and the term identifier shall be used
   */
  public val scoring: CodeableConcept? = null,
) : BackboneElement
