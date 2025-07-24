//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.administrableproductdefinition

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.ratio.Ratio
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The path by which the product is taken into or makes contact with the body
 *
 * The path by which the product is taken into or makes contact with the body. In some regions this
 * is referred to as the licenced or approved route. RouteOfAdministration cannot be used when the
 * 'formOf' product already uses MedicinalProductDefinition.route (and vice versa).
 *
 * @param id Unique id for inter-element referencing
 * @param code Coded expression for the route
 * @param firstDose The first dose (dose quantity) administered can be specified for the product
 * @param maxSingleDose The maximum single dose that can be administered
 * @param maxDosePerDay The maximum dose quantity to be administered in any one 24-h period
 * @param maxDosePerTreatmentPeriod The maximum dose per treatment period that can be administered
 * @param maxTreatmentPeriod The maximum treatment period during which the product can be
 * administered
 */
@SerialName("AdministrableProductDefinitionRouteOfAdministration")
@Serializable
public data class AdministrableProductDefinitionRouteOfAdministration(
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
   * The first dose (dose quantity) administered can be specified for the product
   */
  public val firstDose: Quantity? = null,
  /**
   * The maximum single dose that can be administered
   */
  public val maxSingleDose: Quantity? = null,
  /**
   * The maximum dose quantity to be administered in any one 24-h period
   */
  public val maxDosePerDay: Quantity? = null,
  /**
   * The maximum dose per treatment period that can be administered
   */
  public val maxDosePerTreatmentPeriod: Ratio? = null,
  /**
   * The maximum treatment period during which the product can be administered
   */
  public val maxTreatmentPeriod: Duration? = null,
  public val targetSpecies: List<AdministrableProductDefinitionRouteOfAdministrationTargetSpecies> =
      emptyList(),
) : BackboneElement
