//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductpharmaceutical

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
 * @param tissue Coded expression for the type of tissue for which the withdrawal period applues,
 * e.g. meat, milk
 * @param value A value for the time
 * @param supportingInformation Extra information about the withdrawal period
 */
@SerialName("MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod")
@Serializable
public data class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Coded expression for the type of tissue for which the withdrawal period applues, e.g. meat,
   * milk
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
