//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.operationdefinition

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
