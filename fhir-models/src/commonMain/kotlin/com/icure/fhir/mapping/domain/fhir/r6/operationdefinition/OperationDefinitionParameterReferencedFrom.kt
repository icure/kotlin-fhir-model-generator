//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.operationdefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * References to this parameter
 *
 * Identifies other resource parameters within the operation invocation that are expected to resolve
 * to this resource.
 *
 * @param id Unique id for inter-element referencing
 * @param source Referencing parameter
 * @param sourceId Element id of reference
 */
@SerialName("OperationDefinitionParameterReferencedFrom")
@Serializable
public data class OperationDefinitionParameterReferencedFrom(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Referencing parameter
   */
  public val source: String? = null,
  /**
   * Element id of reference
   */
  public val sourceId: String? = null,
) : BackboneElement
