//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.documentmanifest

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Related things
 *
 * Related identifiers or resources associated with the DocumentManifest.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Identifiers of things that are related
 * @param ref Related Resource
 */
@SerialName("DocumentManifestRelated")
@Serializable
public data class DocumentManifestRelated(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifiers of things that are related
   */
  public val identifier: Identifier? = null,
  /**
   * Related Resource
   */
  public val ref: Reference? = null,
) : BackboneElement
