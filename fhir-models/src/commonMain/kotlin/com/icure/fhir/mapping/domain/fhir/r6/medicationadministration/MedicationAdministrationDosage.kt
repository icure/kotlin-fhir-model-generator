//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.medicationadministration

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of how medication was taken
 *
 * Describes the medication dosage information details e.g. dose, rate, site, route, etc.
 *
 * @param id Unique id for inter-element referencing
 * @param text Free text dosage instructions e.g. SIG
 * @param site Body site administered to
 * @param route Path of substance into body
 * @param method How drug was administered
 * @param dose Amount of medication per dose
 * @param rateRatio Dose quantity per unit of time
 * @param rateQuantity Dose quantity per unit of time
 */
@SerialName("MedicationAdministrationDosage")
@Serializable
public data class MedicationAdministrationDosage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Free text dosage instructions e.g. SIG
   */
  public val text: String? = null,
  /**
   * Body site administered to
   */
  public val site: CodeableConcept? = null,
  /**
   * Path of substance into body
   */
  public val route: CodeableConcept? = null,
  /**
   * How drug was administered
   */
  public val method: CodeableConcept? = null,
  /**
   * Amount of medication per dose
   */
  public val dose: Quantity? = null,
  /**
   * Dose quantity per unit of time
   */
  public val rateRatio: Ratio? = null,
  /**
   * Dose quantity per unit of time
   */
  public val rateQuantity: Quantity? = null,
) : BackboneElement
