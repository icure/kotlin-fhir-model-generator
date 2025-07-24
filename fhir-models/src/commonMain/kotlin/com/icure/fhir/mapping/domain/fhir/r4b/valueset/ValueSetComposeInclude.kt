//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.valueset

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Include one or more codes from a code system or other value set(s)
 *
 * Include one or more codes from a code system or other value set(s).
 *
 * @param id Unique id for inter-element referencing
 * @param system The system the codes come from
 * @param version Specific version of the code system referred to
 */
@SerialName("ValueSetComposeInclude")
@Serializable
public data class ValueSetComposeInclude(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The system the codes come from
   */
  public val system: String? = null,
  /**
   * Specific version of the code system referred to
   */
  public val version: String? = null,
  public val concept: List<ValueSetComposeIncludeConcept> = emptyList(),
  public val filter: List<ValueSetComposeIncludeFilter> = emptyList(),
  public val valueSet: List<String> = emptyList(),
) : BackboneElement
