//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.task

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Who or what performed the task
 *
 * The entity who performed the requested task.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of performance
 * @param actor Who performed the task
 */
@SerialName("TaskPerformer")
@Serializable
public data class TaskPerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of performance
   */
  public val function: CodeableConcept? = null,
  /**
   * Who performed the task
   */
  public val actor: Reference,
) : BackboneElement
