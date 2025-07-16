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
 * Define overloaded variants for when  generating code
 *
 * Defines an appropriate combination of parameters to use when invoking this operation, to help
 * code generators when generating overloaded parameter sets for this operation.
 *
 * @param id Unique id for inter-element referencing
 * @param comment Comments to go on overload
 */
@SerialName("OperationDefinitionOverload")
@Serializable
public data class OperationDefinitionOverload(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val parameterName: List<String> = emptyList(),
  /**
   * Comments to go on overload
   */
  public val comment: String? = null,
) : BackboneElement
