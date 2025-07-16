//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.plandefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.duration.Duration
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.range.Range
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
 * @param targetId What action is this related to
 * @param relationship before | before-start | before-end | concurrent | concurrent-with-start |
 * concurrent-with-end | after | after-start | after-end
 * @param endRelationship before | before-start | before-end | concurrent | concurrent-with-start |
 * concurrent-with-end | after | after-start | after-end
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
  public val targetId: String? = null,
  /**
   * before | before-start | before-end | concurrent | concurrent-with-start | concurrent-with-end |
   * after | after-start | after-end
   */
  public val relationship: String? = null,
  /**
   * before | before-start | before-end | concurrent | concurrent-with-start | concurrent-with-end |
   * after | after-start | after-end
   */
  public val endRelationship: String? = null,
  /**
   * Time offset for the relationship
   */
  public val offsetDuration: Duration? = null,
  /**
   * Time offset for the relationship
   */
  public val offsetRange: Range? = null,
) : BackboneElement
