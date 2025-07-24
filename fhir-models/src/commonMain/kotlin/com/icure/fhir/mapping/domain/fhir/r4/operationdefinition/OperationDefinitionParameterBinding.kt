//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.operationdefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
