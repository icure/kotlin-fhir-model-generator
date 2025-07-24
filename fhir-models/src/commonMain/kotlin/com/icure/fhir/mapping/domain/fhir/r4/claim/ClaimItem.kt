//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.claim

import com.icure.fhir.mapping.domain.fhir.r4.Quantity
import com.icure.fhir.mapping.domain.fhir.r4.address.Address
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.money.Money
import com.icure.fhir.mapping.domain.fhir.r4.period.Period
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Product or service provided
 *
 * A claim line. Either a simple  product or service or a 'group' of details which can each be a
 * simple items or groups of sub-details.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Item instance identifier
 * @param revenue Revenue or cost center code
 * @param category Benefit classification
 * @param productOrService Billing, service, product, or drug code
 * @param servicedDate Date or dates of service or product delivery
 * @param servicedPeriod Date or dates of service or product delivery
 * @param locationCodeableConcept Place of service or where product was supplied
 * @param locationAddress Place of service or where product was supplied
 * @param locationReference Place of service or where product was supplied
 * @param quantity Count of products or services
 * @param unitPrice Fee, charge or cost per item
 * @param factor Price scaling factor
 * @param net Total item cost
 * @param bodySite Anatomical location
 */
@SerialName("ClaimItem")
@Serializable
public data class ClaimItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Item instance identifier
   */
  public val sequence: Int? = null,
  public val careTeamSequence: List<Int> = emptyList(),
  public val diagnosisSequence: List<Int> = emptyList(),
  public val procedureSequence: List<Int> = emptyList(),
  public val informationSequence: List<Int> = emptyList(),
  /**
   * Revenue or cost center code
   */
  public val revenue: CodeableConcept? = null,
  /**
   * Benefit classification
   */
  public val category: CodeableConcept? = null,
  /**
   * Billing, service, product, or drug code
   */
  public val productOrService: CodeableConcept,
  public val modifier: List<CodeableConcept> = emptyList(),
  public val programCode: List<CodeableConcept> = emptyList(),
  /**
   * Date or dates of service or product delivery
   */
  public val servicedDate: String? = null,
  /**
   * Date or dates of service or product delivery
   */
  public val servicedPeriod: Period? = null,
  /**
   * Place of service or where product was supplied
   */
  public val locationCodeableConcept: CodeableConcept? = null,
  /**
   * Place of service or where product was supplied
   */
  public val locationAddress: Address? = null,
  /**
   * Place of service or where product was supplied
   */
  public val locationReference: Reference? = null,
  /**
   * Count of products or services
   */
  public val quantity: Quantity? = null,
  /**
   * Fee, charge or cost per item
   */
  public val unitPrice: Money? = null,
  /**
   * Price scaling factor
   */
  public val factor: Float? = null,
  /**
   * Total item cost
   */
  public val net: Money? = null,
  public val udi: List<Reference> = emptyList(),
  /**
   * Anatomical location
   */
  public val bodySite: CodeableConcept? = null,
  public val subSite: List<CodeableConcept> = emptyList(),
  public val encounter: List<Reference> = emptyList(),
  public val detail: List<ClaimItemDetail> = emptyList(),
) : BackboneElement
