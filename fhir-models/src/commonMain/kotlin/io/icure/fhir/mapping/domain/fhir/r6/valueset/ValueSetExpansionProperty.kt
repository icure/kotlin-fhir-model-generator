//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.valueset

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional information supplied about each concept
 *
 * A property defines an additional slot through which additional information can be provided about
 * a concept.
 *
 * @param id Unique id for inter-element referencing
 * @param code Identifies the property on the concepts, and when referred to in operations
 * @param uri Formal identifier for the property
 */
@SerialName("ValueSetExpansionProperty")
@Serializable
public data class ValueSetExpansionProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifies the property on the concepts, and when referred to in operations
   */
  public val code: String? = null,
  /**
   * Formal identifier for the property
   */
  public val uri: String? = null,
) : BackboneElement
