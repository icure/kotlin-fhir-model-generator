//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.codesystem

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Concepts in the code system
 *
 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but
 * the definitions must be consulted to determine what the meanings of the hierarchical relationships
 * are.
 *
 * @param id Unique id for inter-element referencing
 * @param code Code that identifies concept
 * @param display Text to display to the user
 * @param definition Formal definition
 */
@SerialName("CodeSystemConcept")
@Serializable
public data class CodeSystemConcept(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Code that identifies concept
   */
  public val code: String? = null,
  /**
   * Text to display to the user
   */
  public val display: String? = null,
  /**
   * Formal definition
   */
  public val definition: String? = null,
  public val designation: List<CodeSystemConceptDesignation> = emptyList(),
  public val `property`: List<CodeSystemConceptProperty> = emptyList(),
  public val concept: List<CodeSystemConcept> = emptyList(),
) : BackboneElement
