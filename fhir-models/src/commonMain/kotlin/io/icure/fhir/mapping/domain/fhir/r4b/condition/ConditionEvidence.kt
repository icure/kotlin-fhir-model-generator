//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.condition

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Supporting evidence
 *
 * Supporting evidence / manifestations that are the basis of the Condition's verification status,
 * such as evidence that confirmed or refuted the condition.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("ConditionEvidence")
@Serializable
public data class ConditionEvidence(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val code: List<CodeableConcept> = emptyList(),
  public val detail: List<Reference> = emptyList(),
) : BackboneElement
