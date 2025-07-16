//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.provenance

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param role revision | quotation | source | instantiates | removal
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
   * revision | quotation | source | instantiates | removal
   */
  public val role: String? = null,
  /**
   * Identity of entity
   */
  public val what: Reference,
  public val agent: List<ProvenanceAgent> = emptyList(),
) : BackboneElement
