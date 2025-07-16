//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductpharmaceutical

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The path by which the pharmaceutical product is taken into or makes contact with the body
 *
 * The path by which the pharmaceutical product is taken into or makes contact with the body.
 *
 * @param id Unique id for inter-element referencing
 * @param code Coded expression for the route
 * @param firstDose The first dose (dose quantity) administered in humans can be specified, for a
 * product under investigation, using a numerical value and its unit of measurement
 * @param maxSingleDose The maximum single dose that can be administered as per the protocol of a
 * clinical trial can be specified using a numerical value and its unit of measurement
 * @param maxDosePerDay The maximum dose per day (maximum dose quantity to be administered in any
 * one 24-h period) that can be administered as per the protocol referenced in the clinical trial
 * authorisation
 * @param maxDosePerTreatmentPeriod The maximum dose per treatment period that can be administered
 * as per the protocol referenced in the clinical trial authorisation
 * @param maxTreatmentPeriod The maximum treatment period during which an Investigational Medicinal
 * Product can be administered as per the protocol referenced in the clinical trial authorisation
 */
@SerialName("MedicinalProductPharmaceuticalRouteOfAdministration")
@Serializable
public data class MedicinalProductPharmaceuticalRouteOfAdministration(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Coded expression for the route
   */
  public val code: CodeableConcept,
  /**
   * The first dose (dose quantity) administered in humans can be specified, for a product under
   * investigation, using a numerical value and its unit of measurement
   */
  public val firstDose: Quantity? = null,
  /**
   * The maximum single dose that can be administered as per the protocol of a clinical trial can be
   * specified using a numerical value and its unit of measurement
   */
  public val maxSingleDose: Quantity? = null,
  /**
   * The maximum dose per day (maximum dose quantity to be administered in any one 24-h period) that
   * can be administered as per the protocol referenced in the clinical trial authorisation
   */
  public val maxDosePerDay: Quantity? = null,
  /**
   * The maximum dose per treatment period that can be administered as per the protocol referenced
   * in the clinical trial authorisation
   */
  public val maxDosePerTreatmentPeriod: Ratio? = null,
  /**
   * The maximum treatment period during which an Investigational Medicinal Product can be
   * administered as per the protocol referenced in the clinical trial authorisation
   */
  public val maxTreatmentPeriod: Duration? = null,
  public val targetSpecies: List<MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies> =
      emptyList(),
) : BackboneElement
