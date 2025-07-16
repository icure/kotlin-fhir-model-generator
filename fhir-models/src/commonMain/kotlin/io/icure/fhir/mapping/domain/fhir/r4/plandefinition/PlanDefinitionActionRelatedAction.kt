//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.plandefinition

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.range.Range
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Relationship to another action
 *
 * A relationship to another action such as "before" or "30-60 minutes after start of".
 *
 * @param id Unique id for inter-element referencing
 * @param actionId What action is this related to
 * @param relationship before-start | before | before-end | concurrent-with-start | concurrent |
 * concurrent-with-end | after-start | after | after-end
 * @param offsetDuration Time offset for the relationship
 * @param offsetRange Time offset for the relationship
 */
@SerialName("PlanDefinitionActionRelatedAction")
@Serializable
public data class PlanDefinitionActionRelatedAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What action is this related to
   */
  public val actionId: String? = null,
  /**
   * before-start | before | before-end | concurrent-with-start | concurrent | concurrent-with-end |
   * after-start | after | after-end
   */
  public val relationship: String? = null,
  /**
   * Time offset for the relationship
   */
  public val offsetDuration: Duration? = null,
  /**
   * Time offset for the relationship
   */
  public val offsetRange: Range? = null,
) : BackboneElement
