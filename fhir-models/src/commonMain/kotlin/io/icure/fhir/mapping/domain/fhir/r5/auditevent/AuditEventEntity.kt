//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.auditevent

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
