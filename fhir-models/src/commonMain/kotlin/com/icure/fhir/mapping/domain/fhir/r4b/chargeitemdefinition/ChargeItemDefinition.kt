//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.chargeitemdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.period.Period
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r4b.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of properties and rules about how the price and the applicability of a ChargeItem can
 * be determined
 *
 * The ChargeItemDefinition resource provides the properties that apply to the (billing) codes
 * necessary to calculate costs and prices. The properties may differ largely depending on type and
 * realm, therefore this resource gives only a rough structure and requires profiling for each type of
 * billing code system.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Canonical identifier for this charge item definition, represented as a URI (globally
 * unique)
 * @param version Business version of the charge item definition
 * @param title Name for this charge item definition (human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental For testing purposes, not real usage
 * @param date Date last changed
 * @param publisher Name of the publisher (organization or individual)
 * @param description Natural language description of the charge item definition
 * @param copyright Use and/or publishing restrictions
 * @param approvalDate When the charge item definition was approved by publisher
 * @param lastReviewDate When the charge item definition was last reviewed
 * @param effectivePeriod When the charge item definition is expected to be used
 * @param code Billing codes or product types this definition applies to
 */
@SerialName("ChargeItemDefinition")
@Serializable
public data class ChargeItemDefinition(
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
  /**
   * Canonical identifier for this charge item definition, represented as a URI (globally unique)
   */
  public val url: String? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * Business version of the charge item definition
   */
  public val version: String? = null,
  /**
   * Name for this charge item definition (human friendly)
   */
  public val title: String? = null,
  public val derivedFromUri: List<String> = emptyList(),
  public val partOf: List<String> = emptyList(),
  public val replaces: List<String> = emptyList(),
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * For testing purposes, not real usage
   */
  public val experimental: Boolean? = null,
  /**
   * Date last changed
   */
  public val date: String? = null,
  /**
   * Name of the publisher (organization or individual)
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the charge item definition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * When the charge item definition was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * When the charge item definition was last reviewed
   */
  public val lastReviewDate: String? = null,
  /**
   * When the charge item definition is expected to be used
   */
  public val effectivePeriod: Period? = null,
  /**
   * Billing codes or product types this definition applies to
   */
  public val code: CodeableConcept? = null,
  public val instance: List<Reference> = emptyList(),
  public val applicability: List<ChargeItemDefinitionApplicability> = emptyList(),
  public val propertyGroup: List<ChargeItemDefinitionPropertyGroup> = emptyList(),
) : DomainResource
