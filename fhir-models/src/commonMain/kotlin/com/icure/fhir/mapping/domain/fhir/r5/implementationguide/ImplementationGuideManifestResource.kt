//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.implementationguide

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
 * @param isExample Is this an example
 * @param relativePath Relative path for page in IG
 */
@SerialName("ImplementationGuideManifestResource")
@Serializable
public data class ImplementationGuideManifestResource(
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
  /**
   * Is this an example
   */
  public val isExample: Boolean? = null,
  public val profile: List<String> = emptyList(),
  /**
   * Relative path for page in IG
   */
  public val relativePath: String? = null,
) : BackboneElement
