//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.implementationguide

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
 * @param nameUrl Where to find that page
 * @param nameReference Where to find that page
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
   * Where to find that page
   */
  public val nameUrl: String? = null,
  /**
   * Where to find that page
   */
  public val nameReference: Reference? = null,
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
