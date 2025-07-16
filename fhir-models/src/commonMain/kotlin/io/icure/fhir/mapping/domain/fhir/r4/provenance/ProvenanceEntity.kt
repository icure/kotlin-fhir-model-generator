//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.provenance

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An entity used in this activity
 *
 * An entity used in this activity.
 *
 * @param id Unique id for inter-element referencing
 * @param role derivation | revision | quotation | source | removal
 * @param what Identity of entity
 */
@SerialName("ProvenanceEntity")
@Serializable
public data class ProvenanceEntity(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * derivation | revision | quotation | source | removal
   */
  public val role: String? = null,
  /**
   * Identity of entity
   */
  public val what: Reference,
  public val agent: List<ProvenanceAgent> = emptyList(),
) : BackboneElement
