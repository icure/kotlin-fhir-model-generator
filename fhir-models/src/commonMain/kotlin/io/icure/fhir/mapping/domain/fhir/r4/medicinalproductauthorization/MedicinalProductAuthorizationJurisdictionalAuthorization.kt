//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.medicinalproductauthorization

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Authorization in areas within a country
 *
 * Authorization in areas within a country.
 *
 * @param id Unique id for inter-element referencing
 * @param country Country of authorization
 * @param legalStatusOfSupply The legal status of supply in a jurisdiction or region
 * @param validityPeriod The start and expected end date of the authorization
 */
@SerialName("MedicinalProductAuthorizationJurisdictionalAuthorization")
@Serializable
public data class MedicinalProductAuthorizationJurisdictionalAuthorization(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Country of authorization
   */
  public val country: CodeableConcept? = null,
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * The legal status of supply in a jurisdiction or region
   */
  public val legalStatusOfSupply: CodeableConcept? = null,
  /**
   * The start and expected end date of the authorization
   */
  public val validityPeriod: Period? = null,
) : BackboneElement
