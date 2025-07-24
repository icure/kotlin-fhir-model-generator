//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.observationdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Definition of an observation
 *
 * Set of definitional characteristics for a kind of observation or measurement produced or consumed
 * by an orderable health care service.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param code Type of observation (code / type)
 * @param multipleResultsAllowed Multiple results allowed
 * @param method Method used to produce the observation
 * @param preferredReportName Preferred report name
 * @param quantitativeDetails Characteristics of quantitative results
 * @param validCodedValueSet Value set of valid coded values for the observations conforming to this
 * ObservationDefinition
 * @param normalCodedValueSet Value set of normal coded values for the observations conforming to
 * this ObservationDefinition
 * @param abnormalCodedValueSet Value set of abnormal coded values for the observations conforming
 * to this ObservationDefinition
 * @param criticalCodedValueSet Value set of critical coded values for the observations conforming
 * to this ObservationDefinition
 */
@SerialName("ObservationDefinition")
@Serializable
public data class ObservationDefinition(
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
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * Type of observation (code / type)
   */
  public val code: CodeableConcept,
  public val identifier: List<Identifier> = emptyList(),
  public val permittedDataType: List<String> = emptyList(),
  /**
   * Multiple results allowed
   */
  public val multipleResultsAllowed: Boolean? = null,
  /**
   * Method used to produce the observation
   */
  public val method: CodeableConcept? = null,
  /**
   * Preferred report name
   */
  public val preferredReportName: String? = null,
  /**
   * Characteristics of quantitative results
   */
  public val quantitativeDetails: ObservationDefinitionQuantitativeDetails? = null,
  public val qualifiedInterval: List<ObservationDefinitionQualifiedInterval> = emptyList(),
  /**
   * Value set of valid coded values for the observations conforming to this ObservationDefinition
   */
  public val validCodedValueSet: Reference? = null,
  /**
   * Value set of normal coded values for the observations conforming to this ObservationDefinition
   */
  public val normalCodedValueSet: Reference? = null,
  /**
   * Value set of abnormal coded values for the observations conforming to this
   * ObservationDefinition
   */
  public val abnormalCodedValueSet: Reference? = null,
  /**
   * Value set of critical coded values for the observations conforming to this
   * ObservationDefinition
   */
  public val criticalCodedValueSet: Reference? = null,
) : DomainResource
