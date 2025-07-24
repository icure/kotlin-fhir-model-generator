//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.auditevent

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Audit Event Reporter
 *
 * The actor that is reporting the event.
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
  public val site: Reference? = null,
  /**
   * The identity of source detecting the event
   */
  public val observer: Reference,
  public val type: List<CodeableConcept> = emptyList(),
) : BackboneElement
