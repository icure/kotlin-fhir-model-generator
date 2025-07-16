//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.implementationguide

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Page/Section in the Guide
 *
 * A page / section in the implementation guide. The root page is the implementation guide home
 * page.
 *
 * @param id Unique id for inter-element referencing
 * @param sourceUrl Source for page
 * @param sourceString Source for page
 * @param sourceMarkdown Source for page
 * @param name Name of the page when published
 * @param title Short title shown for navigational assistance
 * @param generation html | markdown | xml | generated
 */
@SerialName("ImplementationGuideDefinitionPage")
@Serializable
public data class ImplementationGuideDefinitionPage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Source for page
   */
  public val sourceUrl: String? = null,
  /**
   * Source for page
   */
  public val sourceString: String? = null,
  /**
   * Source for page
   */
  public val sourceMarkdown: String? = null,
  /**
   * Name of the page when published
   */
  public val name: String? = null,
  /**
   * Short title shown for navigational assistance
   */
  public val title: String? = null,
  /**
   * html | markdown | xml | generated
   */
  public val generation: String? = null,
  public val page: List<ImplementationGuideDefinitionPage> = emptyList(),
) : BackboneElement
