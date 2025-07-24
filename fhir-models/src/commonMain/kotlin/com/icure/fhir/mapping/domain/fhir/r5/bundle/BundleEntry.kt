//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.bundle

import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Entry in the bundle - will have a resource or information
 *
 * An entry in a bundle resource - will either contain a resource or information about a resource
 * (transactions and history only).
 *
 * @param id Unique id for inter-element referencing
 * @param fullUrl URI for resource (e.g. the absolute URL server address, URI for UUID/OID, etc.)
 * @param resource A resource in the bundle
 * @param search Search related information
 * @param request Additional execution information (transaction/batch/history)
 * @param response Results of execution (transaction/batch/history)
 */
@SerialName("BundleEntry")
@Serializable
public data class BundleEntry(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val link: List<BundleLink> = emptyList(),
  /**
   * URI for resource (e.g. the absolute URL server address, URI for UUID/OID, etc.)
   */
  public val fullUrl: String? = null,
  /**
   * A resource in the bundle
   */
  public val resource: Resource? = null,
  /**
   * Search related information
   */
  public val search: BundleEntrySearch? = null,
  /**
   * Additional execution information (transaction/batch/history)
   */
  public val request: BundleEntryRequest? = null,
  /**
   * Results of execution (transaction/batch/history)
   */
  public val response: BundleEntryResponse? = null,
) : BackboneElement
