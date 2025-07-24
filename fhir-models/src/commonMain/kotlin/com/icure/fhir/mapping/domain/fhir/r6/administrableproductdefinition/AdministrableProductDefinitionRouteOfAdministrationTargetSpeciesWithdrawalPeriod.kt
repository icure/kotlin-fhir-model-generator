//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.administrableproductdefinition

import com.icure.fhir.mapping.domain.fhir.r6.Quantity
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A species specific time during which consumption of animal product is not appropriate
 *
 * A species specific time during which consumption of animal product is not appropriate.
 *
 * @param id Unique id for inter-element referencing
 * @param tissue The type of tissue for which the withdrawal period applies, e.g. meat, milk
 * @param value A value for the time
 * @param supportingInformation Extra information about the withdrawal period
 */
@SerialName("AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod")
@Serializable
public data class AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The type of tissue for which the withdrawal period applies, e.g. meat, milk
   */
  public val tissue: CodeableConcept,
  /**
   * A value for the time
   */
  public val `value`: Quantity,
  /**
   * Extra information about the withdrawal period
   */
  public val supportingInformation: String? = null,
) : BackboneElement
