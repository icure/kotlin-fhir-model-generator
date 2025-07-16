//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.implementationguide

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
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
 * @param exampleBoolean Is an example/What is this an example of?
 * @param exampleCanonical Is an example/What is this an example of?
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
   * Is an example/What is this an example of?
   */
  public val exampleBoolean: Boolean? = null,
  /**
   * Is an example/What is this an example of?
   */
  public val exampleCanonical: String? = null,
  /**
   * Relative path for page in IG
   */
  public val relativePath: String? = null,
) : BackboneElement
