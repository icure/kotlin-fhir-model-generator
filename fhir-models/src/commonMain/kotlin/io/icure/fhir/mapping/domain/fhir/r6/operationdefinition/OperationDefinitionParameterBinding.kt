//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.operationdefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * ValueSet details if this is coded
 *
 * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
 *
 * @param id Unique id for inter-element referencing
 * @param strength required | extensible | preferred | example
 * @param valueSet Source of value set
 */
@SerialName("OperationDefinitionParameterBinding")
@Serializable
public data class OperationDefinitionParameterBinding(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * required | extensible | preferred | example
   */
  public val strength: String? = null,
  /**
   * Source of value set
   */
  public val valueSet: String? = null,
) : BackboneElement
