//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.coverageeligibilityrequest

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.money.Money
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
