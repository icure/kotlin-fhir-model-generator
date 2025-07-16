//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.coverageeligibilityresponse

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Benefits and authorization details
 *
 * Benefits and optionally current balances, and authorization details by category or service.
 *
 * @param id Unique id for inter-element referencing
 * @param category Benefit classification
 * @param productOrService Billing, service, product, or drug code
 * @param provider Performing practitioner
 * @param excluded Excluded from the plan
 * @param name Short name for the benefit
 * @param description Description of the benefit or services covered
 * @param network In or out of network
 * @param unit Individual or family
 * @param term Annual or lifetime
 * @param authorizationRequired Authorization required flag
 * @param authorizationUrl Preauthorization requirements endpoint
 */
@SerialName("CoverageEligibilityResponseInsuranceItem")
@Serializable
public data class CoverageEligibilityResponseInsuranceItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
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
   * Performing practitioner
   */
  public val provider: Reference? = null,
  /**
   * Excluded from the plan
   */
  public val excluded: Boolean? = null,
  /**
   * Short name for the benefit
   */
  public val name: String? = null,
  /**
   * Description of the benefit or services covered
   */
  public val description: String? = null,
  /**
   * In or out of network
   */
  public val network: CodeableConcept? = null,
  /**
   * Individual or family
   */
  public val unit: CodeableConcept? = null,
  /**
   * Annual or lifetime
   */
  public val term: CodeableConcept? = null,
  public val benefit: List<CoverageEligibilityResponseInsuranceItemBenefit> = emptyList(),
  /**
   * Authorization required flag
   */
  public val authorizationRequired: Boolean? = null,
  public val authorizationSupporting: List<CodeableConcept> = emptyList(),
  /**
   * Preauthorization requirements endpoint
   */
  public val authorizationUrl: String? = null,
) : BackboneElement
