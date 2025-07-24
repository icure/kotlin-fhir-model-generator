//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.codesystem

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
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
 * @param description Why the property is defined, and/or what it conveys
 * @param type code | Coding | string | integer | boolean | dateTime | decimal
 */
@SerialName("CodeSystemProperty")
@Serializable
public data class CodeSystemProperty(
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
  /**
   * Why the property is defined, and/or what it conveys
   */
  public val description: String? = null,
  /**
   * code | Coding | string | integer | boolean | dateTime | decimal
   */
  public val type: String? = null,
) : BackboneElement
