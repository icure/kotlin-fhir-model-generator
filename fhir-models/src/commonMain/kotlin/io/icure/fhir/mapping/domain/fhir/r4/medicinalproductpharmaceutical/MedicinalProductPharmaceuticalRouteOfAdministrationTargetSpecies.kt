//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductpharmaceutical

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A species for which this route applies
 *
 * A species for which this route applies.
 *
 * @param id Unique id for inter-element referencing
 * @param code Coded expression for the species
 */
@SerialName("MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies")
@Serializable
public data class MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Coded expression for the species
   */
  public val code: CodeableConcept,
  public val withdrawalPeriod:
      List<MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod> =
      emptyList(),
) : BackboneElement
