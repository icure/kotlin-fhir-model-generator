//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.graphdefinition

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Compartment Consistency Rules
 *
 * Compartment Consistency Rules.
 *
 * @param id Unique id for inter-element referencing
 * @param use condition | requirement
 * @param code Patient | Encounter | RelatedPerson | Practitioner | Device
 * @param rule identical | matching | different | custom
 * @param expression Custom rule, as a FHIRPath expression
 * @param description Documentation for FHIRPath expression
 */
@SerialName("GraphDefinitionLinkTargetCompartment")
@Serializable
public data class GraphDefinitionLinkTargetCompartment(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * condition | requirement
   */
  public val use: String? = null,
  /**
   * Patient | Encounter | RelatedPerson | Practitioner | Device
   */
  public val code: String? = null,
  /**
   * identical | matching | different | custom
   */
  public val rule: String? = null,
  /**
   * Custom rule, as a FHIRPath expression
   */
  public val expression: String? = null,
  /**
   * Documentation for FHIRPath expression
   */
  public val description: String? = null,
) : BackboneElement
