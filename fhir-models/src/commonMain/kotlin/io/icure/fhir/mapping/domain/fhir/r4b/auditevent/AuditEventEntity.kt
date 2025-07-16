//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.auditevent

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param type Type of entity involved
 * @param role What role the entity played
 * @param lifecycle Life-cycle stage for the entity
 * @param name Descriptor for entity
 * @param description Descriptive text
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
   * Type of entity involved
   */
  public val type: Coding? = null,
  /**
   * What role the entity played
   */
  public val role: Coding? = null,
  /**
   * Life-cycle stage for the entity
   */
  public val lifecycle: Coding? = null,
  public val securityLabel: List<Coding> = emptyList(),
  /**
   * Descriptor for entity
   */
  public val name: String? = null,
  /**
   * Descriptive text
   */
  public val description: String? = null,
  /**
   * Query parameters
   */
  public val query: String? = null,
  public val detail: List<AuditEventEntityDetail> = emptyList(),
) : BackboneElement
