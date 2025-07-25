//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.structuredefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * External specification that the content is mapped to
 *
 * An external specification that the content is mapped to.
 *
 * @param id Unique id for inter-element referencing
 * @param identity Internal id when this mapping is used
 * @param uri Identifies what this mapping refers to
 * @param name Names what this mapping refers to
 * @param comment Versions, Issues, Scope limitations etc
 */
@SerialName("StructureDefinitionMapping")
@Serializable
public data class StructureDefinitionMapping(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Internal id when this mapping is used
   */
  public val identity: String? = null,
  /**
   * Identifies what this mapping refers to
   */
  public val uri: String? = null,
  /**
   * Names what this mapping refers to
   */
  public val name: String? = null,
  /**
   * Versions, Issues, Scope limitations etc
   */
  public val comment: String? = null,
) : BackboneElement
