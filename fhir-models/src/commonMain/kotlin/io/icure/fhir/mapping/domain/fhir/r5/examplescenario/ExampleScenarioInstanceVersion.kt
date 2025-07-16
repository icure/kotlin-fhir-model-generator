//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.examplescenario

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Snapshot of instance that changes
 *
 * Represents the instance as it was at a specific time-point.
 *
 * @param id Unique id for inter-element referencing
 * @param key ID or acronym of the version
 * @param title Label for instance version
 * @param description Details about version
 * @param content Example instance version data
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
   * ID or acronym of the version
   */
  public val key: String? = null,
  /**
   * Label for instance version
   */
  public val title: String? = null,
  /**
   * Details about version
   */
  public val description: String? = null,
  /**
   * Example instance version data
   */
  public val content: Reference? = null,
) : BackboneElement
