//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancespecification

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * General specifications for this substance, including how it is related to other substances
 *
 * General specifications for this substance, including how it is related to other substances.
 *
 * @param id Unique id for inter-element referencing
 * @param category A category for this property, e.g. Physical, Chemical, Enzymatic
 * @param code Property type e.g. viscosity, pH, isoelectric point
 * @param parameters Parameters that were used in the measurement of a property (e.g. for viscosity:
 * measured at 20C with a pH of 7.1)
 * @param definingSubstanceReference A substance upon which a defining property depends (e.g. for
 * solubility: in water, in alcohol)
 * @param definingSubstanceCodeableConcept A substance upon which a defining property depends (e.g.
 * for solubility: in water, in alcohol)
 * @param amountQuantity Quantitative value for this property
 * @param amountString Quantitative value for this property
 */
@SerialName("SubstanceSpecificationProperty")
@Serializable
public data class SubstanceSpecificationProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * A category for this property, e.g. Physical, Chemical, Enzymatic
   */
  public val category: CodeableConcept? = null,
  /**
   * Property type e.g. viscosity, pH, isoelectric point
   */
  public val code: CodeableConcept? = null,
  /**
   * Parameters that were used in the measurement of a property (e.g. for viscosity: measured at 20C
   * with a pH of 7.1)
   */
  public val parameters: String? = null,
  /**
   * A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol)
   */
  public val definingSubstanceReference: Reference? = null,
  /**
   * A substance upon which a defining property depends (e.g. for solubility: in water, in alcohol)
   */
  public val definingSubstanceCodeableConcept: CodeableConcept? = null,
  /**
   * Quantitative value for this property
   */
  public val amountQuantity: Quantity? = null,
  /**
   * Quantitative value for this property
   */
  public val amountString: String? = null,
) : BackboneElement
