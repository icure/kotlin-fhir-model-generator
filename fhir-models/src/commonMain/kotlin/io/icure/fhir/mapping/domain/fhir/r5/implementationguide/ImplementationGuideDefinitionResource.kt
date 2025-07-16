//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.implementationguide

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Resource in the implementation guide
 *
 * A resource that is part of the implementation guide. Conformance resources (value set, structure
 * definition, capability statements etc.) are obvious candidates for inclusion, but any kind of
 * resource can be included as an example resource.
 *
 * @param id Unique id for inter-element referencing
 * @param reference Location of the resource
 * @param name Human readable name for the resource
 * @param description Reason why included in guide
 * @param isExample Is this an example
 * @param groupingId Grouping this is part of
 */
@SerialName("ImplementationGuideDefinitionResource")
@Serializable
public data class ImplementationGuideDefinitionResource(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Location of the resource
   */
  public val reference: Reference,
  public val fhirVersion: List<String> = emptyList(),
  /**
   * Human readable name for the resource
   */
  public val name: String? = null,
  /**
   * Reason why included in guide
   */
  public val description: String? = null,
  /**
   * Is this an example
   */
  public val isExample: Boolean? = null,
  public val profile: List<String> = emptyList(),
  /**
   * Grouping this is part of
   */
  public val groupingId: String? = null,
) : BackboneElement
