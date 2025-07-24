//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.examplescenario

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A specific version of the resource
 *
 * A specific version of the resource.
 *
 * @param id Unique id for inter-element referencing
 * @param versionId The identifier of a specific version of a resource
 * @param description The description of the resource version
 */
@SerialName("ExampleScenarioInstanceVersion")
@Serializable
public data class ExampleScenarioInstanceVersion(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The identifier of a specific version of a resource
   */
  public val versionId: String? = null,
  /**
   * The description of the resource version
   */
  public val description: String? = null,
) : BackboneElement
