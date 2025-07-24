//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.graphdefinition

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param use where | requires
 * @param rule identical | matching | different | custom
 * @param code Patient | Encounter | RelatedPerson | Practitioner | Device | EpisodeOfCare
 * @param expression Custom rule, as a FHIRPath expression
 * @param description Documentation for FHIRPath expression
 */
@SerialName("GraphDefinitionLinkCompartment")
@Serializable
public data class GraphDefinitionLinkCompartment(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * where | requires
   */
  public val use: String? = null,
  /**
   * identical | matching | different | custom
   */
  public val rule: String? = null,
  /**
   * Patient | Encounter | RelatedPerson | Practitioner | Device | EpisodeOfCare
   */
  public val code: String? = null,
  /**
   * Custom rule, as a FHIRPath expression
   */
  public val expression: String? = null,
  /**
   * Documentation for FHIRPath expression
   */
  public val description: String? = null,
) : BackboneElement
