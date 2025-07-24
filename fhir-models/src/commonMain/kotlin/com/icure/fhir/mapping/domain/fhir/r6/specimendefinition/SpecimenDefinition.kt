//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.specimendefinition

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.contactdetail.ContactDetail
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Kind of specimen
 *
 * A kind of specimen with associated set of requirements.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param url Logical canonical URL to reference this SpecimenDefinition (globally unique)
 * @param identifier Business identifier
 * @param version Business version of the SpecimenDefinition
 * @param versionAlgorithmString How to compare versions
 * @param versionAlgorithmCoding How to compare versions
 * @param name Name for this {{title}} (computer friendly)
 * @param title Name for this SpecimenDefinition (Human friendly)
 * @param status draft | active | retired | unknown
 * @param experimental If this SpecimenDefinition is not for real usage
 * @param subjectCodeableConcept Type of subject for specimen collection
 * @param subjectReference Type of subject for specimen collection
 * @param date Date status first applied
 * @param publisher The name of the individual or organization that published the SpecimenDefinition
 * @param description Natural language description of the SpecimenDefinition
 * @param purpose Why this SpecimenDefinition is defined
 * @param copyright Use and/or publishing restrictions
 * @param copyrightLabel Copyright holder and year(s)
 * @param approvalDate When SpecimenDefinition was approved by publisher
 * @param lastReviewDate The date on which the asset content was last reviewed by the publisher
 * @param effectivePeriod The effective date range for the SpecimenDefinition
 * @param typeCollected Kind of material to collect
 * @param timeAspect Time aspect for collection
 */
@SerialName("SpecimenDefinition")
@Serializable
public data class SpecimenDefinition(
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
   * Logical canonical URL to reference this SpecimenDefinition (globally unique)
   */
  public val url: String? = null,
  /**
   * Business identifier
   */
  public val identifier: Identifier? = null,
  /**
   * Business version of the SpecimenDefinition
   */
  public val version: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmString: String? = null,
  /**
   * How to compare versions
   */
  public val versionAlgorithmCoding: Coding? = null,
  /**
   * Name for this {{title}} (computer friendly)
   */
  public val name: String? = null,
  /**
   * Name for this SpecimenDefinition (Human friendly)
   */
  public val title: String? = null,
  public val derivedFromCanonical: List<String> = emptyList(),
  public val derivedFromUri: List<String> = emptyList(),
  /**
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * If this SpecimenDefinition is not for real usage
   */
  public val experimental: Boolean? = null,
  /**
   * Type of subject for specimen collection
   */
  public val subjectCodeableConcept: CodeableConcept? = null,
  /**
   * Type of subject for specimen collection
   */
  public val subjectReference: Reference? = null,
  /**
   * Date status first applied
   */
  public val date: String? = null,
  /**
   * The name of the individual or organization that published the SpecimenDefinition
   */
  public val publisher: String? = null,
  public val contact: List<ContactDetail> = emptyList(),
  /**
   * Natural language description of the SpecimenDefinition
   */
  public val description: String? = null,
  public val useContext: List<UsageContext> = emptyList(),
  public val jurisdiction: List<CodeableConcept> = emptyList(),
  /**
   * Why this SpecimenDefinition is defined
   */
  public val purpose: String? = null,
  /**
   * Use and/or publishing restrictions
   */
  public val copyright: String? = null,
  /**
   * Copyright holder and year(s)
   */
  public val copyrightLabel: String? = null,
  /**
   * When SpecimenDefinition was approved by publisher
   */
  public val approvalDate: String? = null,
  /**
   * The date on which the asset content was last reviewed by the publisher
   */
  public val lastReviewDate: String? = null,
  /**
   * The effective date range for the SpecimenDefinition
   */
  public val effectivePeriod: Period? = null,
  /**
   * Kind of material to collect
   */
  public val typeCollected: CodeableConcept? = null,
  public val patientPreparation: List<CodeableConcept> = emptyList(),
  /**
   * Time aspect for collection
   */
  public val timeAspect: String? = null,
  public val collection: List<CodeableConcept> = emptyList(),
  public val typeTested: List<SpecimenDefinitionTypeTested> = emptyList(),
) : DomainResource
