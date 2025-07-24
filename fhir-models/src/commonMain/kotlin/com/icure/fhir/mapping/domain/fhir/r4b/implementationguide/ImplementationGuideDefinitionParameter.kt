//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.implementationguide

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defines how IG is built by tools
 *
 * Defines how IG is built by tools.
 *
 * @param id Unique id for inter-element referencing
 * @param code apply | path-resource | path-pages | path-tx-cache | expansion-parameter |
 * rule-broken-links | generate-xml | generate-json | generate-turtle | html-template
 * @param value Value for named type
 */
@SerialName("ImplementationGuideDefinitionParameter")
@Serializable
public data class ImplementationGuideDefinitionParameter(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * apply | path-resource | path-pages | path-tx-cache | expansion-parameter | rule-broken-links |
   * generate-xml | generate-json | generate-turtle | html-template
   */
  public val code: String? = null,
  /**
   * Value for named type
   */
  public val `value`: String? = null,
) : BackboneElement
