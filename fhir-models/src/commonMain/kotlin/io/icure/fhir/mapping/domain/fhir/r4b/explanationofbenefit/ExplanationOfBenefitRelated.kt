//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.explanationofbenefit

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Prior or corollary claims
 *
 * Other claims which are related to this claim such as prior submissions or claims for related
 * services or for the same event.
 *
 * @param id Unique id for inter-element referencing
 * @param claim Reference to the related claim
 * @param relationship How the reference claim is related
 * @param reference File or case reference
 */
@SerialName("ExplanationOfBenefitRelated")
@Serializable
public data class ExplanationOfBenefitRelated(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to the related claim
   */
  public val claim: Reference? = null,
  /**
   * How the reference claim is related
   */
  public val relationship: CodeableConcept? = null,
  /**
   * File or case reference
   */
  public val reference: Identifier? = null,
) : BackboneElement
