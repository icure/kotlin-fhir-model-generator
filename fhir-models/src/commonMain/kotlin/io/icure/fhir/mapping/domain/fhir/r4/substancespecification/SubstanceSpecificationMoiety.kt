//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancespecification

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Moiety, for structural modifications
 *
 * Moiety, for structural modifications.
 *
 * @param id Unique id for inter-element referencing
 * @param role Role that the moiety is playing
 * @param identifier Identifier by which this moiety substance is known
 * @param name Textual name for this moiety substance
 * @param stereochemistry Stereochemistry type
 * @param opticalActivity Optical activity type
 * @param molecularFormula Molecular formula
 * @param amountQuantity Quantitative value for this moiety
 * @param amountString Quantitative value for this moiety
 */
@SerialName("SubstanceSpecificationMoiety")
@Serializable
public data class SubstanceSpecificationMoiety(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Role that the moiety is playing
   */
  public val role: CodeableConcept? = null,
  /**
   * Identifier by which this moiety substance is known
   */
  public val identifier: Identifier? = null,
  /**
   * Textual name for this moiety substance
   */
  public val name: String? = null,
  /**
   * Stereochemistry type
   */
  public val stereochemistry: CodeableConcept? = null,
  /**
   * Optical activity type
   */
  public val opticalActivity: CodeableConcept? = null,
  /**
   * Molecular formula
   */
  public val molecularFormula: String? = null,
  /**
   * Quantitative value for this moiety
   */
  public val amountQuantity: Quantity? = null,
  /**
   * Quantitative value for this moiety
   */
  public val amountString: String? = null,
) : BackboneElement
