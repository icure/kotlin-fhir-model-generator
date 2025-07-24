//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.list

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Entries in the list
 *
 * Entries in this list.
 *
 * @param id Unique id for inter-element referencing
 * @param flag Status/Workflow information about this item
 * @param deleted If this item is actually marked as deleted
 * @param date When item added to list
 * @param item Actual entry
 */
@SerialName("ListEntry")
@Serializable
public data class ListEntry(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Status/Workflow information about this item
   */
  public val flag: CodeableConcept? = null,
  /**
   * If this item is actually marked as deleted
   */
  public val deleted: Boolean? = null,
  /**
   * When item added to list
   */
  public val date: String? = null,
  /**
   * Actual entry
   */
  public val item: Reference,
) : BackboneElement
