//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.implementationguide

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * HTML page within the parent IG
 *
 * Information about a page within the IG.
 *
 * @param id Unique id for inter-element referencing
 * @param name HTML page name
 * @param title Title of the page, for references
 */
@SerialName("ImplementationGuideManifestPage")
@Serializable
public data class ImplementationGuideManifestPage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * HTML page name
   */
  public val name: String? = null,
  /**
   * Title of the page, for references
   */
  public val title: String? = null,
  public val anchor: List<String> = emptyList(),
) : BackboneElement
