//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.examplescenario

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Resources contained in the instance
 *
 * Resources contained in the instance (e.g. the observations contained in a bundle).
 *
 * @param id Unique id for inter-element referencing
 * @param resourceId Each resource contained in the instance
 * @param versionId A specific version of a resource contained in the instance
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
   * Each resource contained in the instance
   */
  public val resourceId: String? = null,
  /**
   * A specific version of a resource contained in the instance
   */
  public val versionId: String? = null,
) : BackboneElement
