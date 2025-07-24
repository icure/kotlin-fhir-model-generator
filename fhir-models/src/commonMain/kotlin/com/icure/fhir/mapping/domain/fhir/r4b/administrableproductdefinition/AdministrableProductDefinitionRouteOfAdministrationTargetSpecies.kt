//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.administrableproductdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
@SerialName("AdministrableProductDefinitionRouteOfAdministrationTargetSpecies")
@Serializable
public data class AdministrableProductDefinitionRouteOfAdministrationTargetSpecies(
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
      List<AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod> =
      emptyList(),
) : BackboneElement
