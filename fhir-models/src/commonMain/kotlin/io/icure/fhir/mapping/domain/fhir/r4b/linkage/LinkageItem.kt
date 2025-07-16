//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.linkage

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Item to be linked
 *
 * Identifies which record considered as the reference to the same real-world occurrence as well as
 * how the items should be evaluated within the collection of linked items.
 *
 * @param id Unique id for inter-element referencing
 * @param type source | alternate | historical
 * @param resource Resource being linked
 */
@SerialName("LinkageItem")
@Serializable
public data class LinkageItem(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * source | alternate | historical
   */
  public val type: String? = null,
  /**
   * Resource being linked
   */
  public val resource: Reference,
) : BackboneElement
