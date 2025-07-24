//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.insuranceplan

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extendedcontactdetail.ExtendedContactDetail
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.period.Period
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Details of a Health Insurance product/plan provided by an organization
 *
 * Details of a Health Insurance product/plan provided by an organization.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | active | retired | unknown
 * @param name Official name
 * @param period When the product is available
 * @param ownedBy Product issuer
 * @param administeredBy Product administrator
 */
@SerialName("InsurancePlan")
@Serializable
public data class InsurancePlan(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Official name
   */
  public val name: String? = null,
  public val alias: List<String> = emptyList(),
  /**
   * When the product is available
   */
  public val period: Period? = null,
  /**
   * Product issuer
   */
  public val ownedBy: Reference? = null,
  /**
   * Product administrator
   */
  public val administeredBy: Reference? = null,
  public val coverageArea: List<Reference> = emptyList(),
  public val contact: List<ExtendedContactDetail> = emptyList(),
  public val endpoint: List<Reference> = emptyList(),
  public val network: List<Reference> = emptyList(),
  public val coverage: List<InsurancePlanCoverage> = emptyList(),
  public val plan: List<InsurancePlanPlan> = emptyList(),
) : DomainResource
