//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.substancedefinition

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
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
 * @param molecularFormula Molecular formula for this moiety (e.g. with the Hill system)
 * @param amountQuantity Quantitative value for this moiety
 * @param amountString Quantitative value for this moiety
 * @param measurementType The measurement type of the quantitative value
 */
@SerialName("SubstanceDefinitionMoiety")
@Serializable
public data class SubstanceDefinitionMoiety(
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
   * Molecular formula for this moiety (e.g. with the Hill system)
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
  /**
   * The measurement type of the quantitative value
   */
  public val measurementType: CodeableConcept? = null,
) : BackboneElement
