//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.bundle

import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.signature.Signature
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Contains a collection of resources
 *
 * A container for a collection of resources.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param identifier Persistent identifier for the bundle
 * @param type document | message | transaction | transaction-response | batch | batch-response |
 * history | searchset | collection
 * @param timestamp When the bundle was assembled
 * @param total If search, the total number of matches
 * @param signature Digital Signature
 */
@SerialName("Bundle")
@Serializable
public data class Bundle(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Persistent identifier for the bundle
   */
  public val identifier: Identifier? = null,
  /**
   * document | message | transaction | transaction-response | batch | batch-response | history |
   * searchset | collection
   */
  public val type: String? = null,
  /**
   * When the bundle was assembled
   */
  public val timestamp: String? = null,
  /**
   * If search, the total number of matches
   */
  public val total: Int? = null,
  public val link: List<BundleLink> = emptyList(),
  public val entry: List<BundleEntry> = emptyList(),
  /**
   * Digital Signature
   */
  public val signature: Signature? = null,
) : Resource
