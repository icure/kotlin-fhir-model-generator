//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.auditevent

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Audit Event Reporter
 *
 * The system that is reporting the event.
 *
 * @param id Unique id for inter-element referencing
 * @param site Logical source location within the enterprise
 * @param observer The identity of source detecting the event
 */
@SerialName("AuditEventSource")
@Serializable
public data class AuditEventSource(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Logical source location within the enterprise
   */
  public val site: String? = null,
  /**
   * The identity of source detecting the event
   */
  public val observer: Reference,
  public val type: List<Coding> = emptyList(),
) : BackboneElement
