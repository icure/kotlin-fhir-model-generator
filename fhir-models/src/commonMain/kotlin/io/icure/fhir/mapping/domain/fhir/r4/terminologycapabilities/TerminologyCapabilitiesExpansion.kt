//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.terminologycapabilities

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
