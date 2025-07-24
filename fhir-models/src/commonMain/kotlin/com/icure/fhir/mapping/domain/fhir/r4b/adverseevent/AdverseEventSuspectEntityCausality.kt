//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.adverseevent

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information on the possible cause of the event
 *
 * Information on the possible cause of the event.
 *
 * @param id Unique id for inter-element referencing
 * @param assessment Assessment of if the entity caused the event
 * @param productRelatedness AdverseEvent.suspectEntity.causalityProductRelatedness
 * @param author AdverseEvent.suspectEntity.causalityAuthor
 * @param method ProbabilityScale | Bayesian | Checklist
 */
@SerialName("AdverseEventSuspectEntityCausality")
@Serializable
public data class AdverseEventSuspectEntityCausality(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Assessment of if the entity caused the event
   */
  public val assessment: CodeableConcept? = null,
  /**
   * AdverseEvent.suspectEntity.causalityProductRelatedness
   */
  public val productRelatedness: String? = null,
  /**
   * AdverseEvent.suspectEntity.causalityAuthor
   */
  public val author: Reference? = null,
  /**
   * ProbabilityScale | Bayesian | Checklist
   */
  public val method: CodeableConcept? = null,
) : BackboneElement
