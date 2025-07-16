//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.adverseevent

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param assessmentMethod Method of evaluating the relatedness of the suspected entity to the event
 * @param entityRelatedness Result of the assessment regarding the relatedness of the suspected
 * entity to the event
 * @param author Author of the information on the possible cause of the event
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
   * Method of evaluating the relatedness of the suspected entity to the event
   */
  public val assessmentMethod: CodeableConcept? = null,
  /**
   * Result of the assessment regarding the relatedness of the suspected entity to the event
   */
  public val entityRelatedness: CodeableConcept? = null,
  /**
   * Author of the information on the possible cause of the event
   */
  public val author: Reference? = null,
) : BackboneElement
