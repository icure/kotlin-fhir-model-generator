//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.auditevent

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Data or objects used
 *
 * Specific instances of data or objects that have been accessed.
 *
 * @param id Unique id for inter-element referencing
 * @param what Specific instance of resource
 * @param role What role the entity played
 * @param query Query parameters
 */
@SerialName("AuditEventEntity")
@Serializable
public data class AuditEventEntity(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Specific instance of resource
   */
  public val what: Reference? = null,
  /**
   * What role the entity played
   */
  public val role: CodeableConcept? = null,
  public val securityLabel: List<CodeableConcept> = emptyList(),
  /**
   * Query parameters
   */
  public val query: String? = null,
  public val detail: List<AuditEventEntityDetail> = emptyList(),
  public val agent: List<AuditEventAgent> = emptyList(),
) : BackboneElement
