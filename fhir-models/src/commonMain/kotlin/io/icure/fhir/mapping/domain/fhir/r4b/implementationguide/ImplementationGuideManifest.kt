//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.implementationguide

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about an assembled IG
 *
 * Information about an assembled implementation guide, created by the publication tooling.
 *
 * @param id Unique id for inter-element referencing
 * @param rendering Location of rendered implementation guide
 */
@SerialName("ImplementationGuideManifest")
@Serializable
public data class ImplementationGuideManifest(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Location of rendered implementation guide
   */
  public val rendering: String? = null,
  public val resource: List<ImplementationGuideManifestResource> = emptyList(),
  public val page: List<ImplementationGuideManifestPage> = emptyList(),
  public val image: List<String> = emptyList(),
  public val other: List<String> = emptyList(),
) : BackboneElement
