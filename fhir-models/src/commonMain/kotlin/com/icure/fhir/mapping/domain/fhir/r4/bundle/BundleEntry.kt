//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.bundle

import com.icure.fhir.mapping.domain.fhir.r4.Resource
import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
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
 * @param fullUrl URI for resource (Absolute URL server address or URI for UUID/OID)
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
   * URI for resource (Absolute URL server address or URI for UUID/OID)
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
