//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.implementationguide

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A template for building resources
 *
 * A template for building resources.
 *
 * @param id Unique id for inter-element referencing
 * @param code Type of template specified
 * @param source The source location for the template
 * @param scope The scope in which the template applies
 */
@SerialName("ImplementationGuideDefinitionTemplate")
@Serializable
public data class ImplementationGuideDefinitionTemplate(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of template specified
   */
  public val code: String? = null,
  /**
   * The source location for the template
   */
  public val source: String? = null,
  /**
   * The scope in which the template applies
   */
  public val scope: String? = null,
) : BackboneElement
