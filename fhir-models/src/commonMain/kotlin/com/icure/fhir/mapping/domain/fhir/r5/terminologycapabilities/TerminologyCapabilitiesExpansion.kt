//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.terminologycapabilities

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Information about the [ValueSet/$expand](valueset-operation-expand.html) operation
 *
 * Information about the [ValueSet/$expand](valueset-operation-expand.html) operation.
 *
 * @param id Unique id for inter-element referencing
 * @param hierarchical Whether the server can return nested value sets
 * @param paging Whether the server supports paging on expansion
 * @param incomplete Allow request for incomplete expansions?
 * @param textFilter Documentation about text searching works
 */
@SerialName("TerminologyCapabilitiesExpansion")
@Serializable
public data class TerminologyCapabilitiesExpansion(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Whether the server can return nested value sets
   */
  public val hierarchical: Boolean? = null,
  /**
   * Whether the server supports paging on expansion
   */
  public val paging: Boolean? = null,
  /**
   * Allow request for incomplete expansions?
   */
  public val incomplete: Boolean? = null,
  public val parameter: List<TerminologyCapabilitiesExpansionParameter> = emptyList(),
  /**
   * Documentation about text searching works
   */
  public val textFilter: String? = null,
) : BackboneElement
