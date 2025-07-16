//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.implementationguide

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defines how IG is built by tools
 *
 * A set of parameters that defines how the implementation guide is built. The parameters are
 * defined by the relevant tools that build the implementation guides.
 *
 * @param id Unique id for inter-element referencing
 * @param code Code that identifies parameter
 * @param value Value for named type
 */
@SerialName("ImplementationGuideDefinitionParameter")
@Serializable
public data class ImplementationGuideDefinitionParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that identifies parameter
   */
  public val code: Coding,
  /**
   * Value for named type
   */
  public val `value`: String? = null,
) : BackboneElement
