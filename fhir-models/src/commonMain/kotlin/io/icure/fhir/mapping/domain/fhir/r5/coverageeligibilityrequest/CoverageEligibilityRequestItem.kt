//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.coverageeligibilityrequest

import io.icure.fhir.mapping.domain.fhir.r5.Quantity
import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.money.Money
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Item to be evaluated for eligibiity
 *
 * Service categories or billable services for which benefit details and/or an authorization prior
 * to service delivery may be required by the payor.
 *
 * @param id Unique id for inter-element referencing
 * @param category Benefit classification
 * @param productOrService Billing, service, product, or drug code
 * @param provider Perfoming practitioner
 * @param quantity Count of products or services
 * @param unitPrice Fee, charge or cost per item
 * @param facility Servicing facility
 */
@SerialName("CoverageEligibilityRequestItem")
@Serializable
public data class CoverageEligibilityRequestItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val supportingInfoSequence: List<Int> = emptyList(),
  /**
   * Benefit classification
   */
  public val category: CodeableConcept? = null,
  /**
   * Billing, service, product, or drug code
   */
  public val productOrService: CodeableConcept? = null,
  public val modifier: List<CodeableConcept> = emptyList(),
  /**
   * Perfoming practitioner
   */
  public val provider: Reference? = null,
  /**
   * Count of products or services
   */
  public val quantity: Quantity? = null,
  /**
   * Fee, charge or cost per item
   */
  public val unitPrice: Money? = null,
  /**
   * Servicing facility
   */
  public val facility: Reference? = null,
  public val diagnosis: List<CoverageEligibilityRequestItemDiagnosis> = emptyList(),
  public val detail: List<Reference> = emptyList(),
) : BackboneElement
