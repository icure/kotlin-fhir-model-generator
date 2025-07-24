//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.guidanceresponse

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.`annotation`.Annotation
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.datarequirement.DataRequirement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The formal response to a guidance request
 *
 * A guidance response is the formal response to a guidance request, including any output parameters
 * returned by the evaluation, as well as the description of any proposed actions to be taken.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param requestIdentifier The identifier of the request associated with this response, if any
 * @param moduleUri What guidance was requested
 * @param moduleCanonical What guidance was requested
 * @param moduleCodeableConcept What guidance was requested
 * @param status success | data-requested | data-required | in-progress | failure | entered-in-error
 * @param subject Patient the request was performed for
 * @param encounter Encounter during which the response was returned
 * @param occurrenceDateTime When the guidance response was processed
 * @param performer Device returning the guidance
 * @param evaluationMessage Messages resulting from the evaluation of the artifact or artifacts
 * @param outputParameters The output parameters of the evaluation, if any
 */
@SerialName("GuidanceResponse")
@Serializable
public data class GuidanceResponse(
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
   * The identifier of the request associated with this response, if any
   */
  public val requestIdentifier: Identifier? = null,
  public val identifier: List<Identifier> = emptyList(),
  /**
   * What guidance was requested
   */
  public val moduleUri: String? = null,
  /**
   * What guidance was requested
   */
  public val moduleCanonical: String? = null,
  /**
   * What guidance was requested
   */
  public val moduleCodeableConcept: CodeableConcept? = null,
  /**
   * success | data-requested | data-required | in-progress | failure | entered-in-error
   */
  public val status: String? = null,
  /**
   * Patient the request was performed for
   */
  public val subject: Reference? = null,
  /**
   * Encounter during which the response was returned
   */
  public val encounter: Reference? = null,
  /**
   * When the guidance response was processed
   */
  public val occurrenceDateTime: String? = null,
  /**
   * Device returning the guidance
   */
  public val performer: Reference? = null,
  public val reason: List<CodeableReference> = emptyList(),
  public val note: List<Annotation> = emptyList(),
  /**
   * Messages resulting from the evaluation of the artifact or artifacts
   */
  public val evaluationMessage: Reference? = null,
  /**
   * The output parameters of the evaluation, if any
   */
  public val outputParameters: Reference? = null,
  public val result: List<Reference> = emptyList(),
  public val dataRequirement: List<DataRequirement> = emptyList(),
) : DomainResource
