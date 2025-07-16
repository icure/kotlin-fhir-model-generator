//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.provenance

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
