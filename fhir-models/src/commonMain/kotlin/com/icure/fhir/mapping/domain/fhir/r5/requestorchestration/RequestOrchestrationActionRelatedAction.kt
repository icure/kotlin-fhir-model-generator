//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.requestorchestration

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.duration.Duration
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.range.Range
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
 * @param targetId What action this is related to
 * @param relationship before | before-start | before-end | concurrent | concurrent-with-start |
 * concurrent-with-end | after | after-start | after-end
 * @param endRelationship before | before-start | before-end | concurrent | concurrent-with-start |
 * concurrent-with-end | after | after-start | after-end
 * @param offsetDuration Time offset for the relationship
 * @param offsetRange Time offset for the relationship
 */
@SerialName("RequestOrchestrationActionRelatedAction")
@Serializable
public data class RequestOrchestrationActionRelatedAction(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What action this is related to
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
