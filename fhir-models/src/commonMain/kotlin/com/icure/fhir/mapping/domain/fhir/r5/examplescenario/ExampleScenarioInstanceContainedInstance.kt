//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.examplescenario

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Resources contained in the instance
 *
 * References to other instances that can be found within this instance (e.g. the observations
 * contained in a bundle).
 *
 * @param id Unique id for inter-element referencing
 * @param instanceReference Key of contained instance
 * @param versionReference Key of contained instance version
 */
@SerialName("ExampleScenarioInstanceContainedInstance")
@Serializable
public data class ExampleScenarioInstanceContainedInstance(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Key of contained instance
   */
  public val instanceReference: String? = null,
  /**
   * Key of contained instance version
   */
  public val versionReference: String? = null,
) : BackboneElement
