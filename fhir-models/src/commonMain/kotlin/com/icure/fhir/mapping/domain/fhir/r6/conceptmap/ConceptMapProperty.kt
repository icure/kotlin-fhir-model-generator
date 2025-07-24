//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.conceptmap

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional properties of the mapping
 *
 * A property defines a slot through which additional information can be provided about a map from
 * source -> target.
 *
 * @param id Unique id for inter-element referencing
 * @param code Identifies the property on the mappings, and when referred to in the $translate
 * operation
 * @param uri Formal identifier for the property
 * @param description Why the property is defined, and/or what it conveys
 * @param type Coding | string | integer | boolean | dateTime | decimal | code
 * @param system The CodeSystem from which code values come
 */
@SerialName("ConceptMapProperty")
@Serializable
public data class ConceptMapProperty(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifies the property on the mappings, and when referred to in the $translate operation
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
   * Coding | string | integer | boolean | dateTime | decimal | code
   */
  public val type: String? = null,
  /**
   * The CodeSystem from which code values come
   */
  public val system: String? = null,
) : BackboneElement
