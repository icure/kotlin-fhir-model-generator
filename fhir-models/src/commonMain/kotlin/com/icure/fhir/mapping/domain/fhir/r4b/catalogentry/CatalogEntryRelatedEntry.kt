//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.catalogentry

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An item that this catalog entry is related to
 *
 * Used for example, to point to a substance, or to a device used to administer a medication.
 *
 * @param id Unique id for inter-element referencing
 * @param relationtype triggers | is-replaced-by
 * @param item The reference to the related item
 */
@SerialName("CatalogEntryRelatedEntry")
@Serializable
public data class CatalogEntryRelatedEntry(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * triggers | is-replaced-by
   */
  public val relationtype: String? = null,
  /**
   * The reference to the related item
   */
  public val item: Reference,
) : BackboneElement
