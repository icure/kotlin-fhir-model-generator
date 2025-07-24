//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.bundle

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional execution information (transaction/batch/history)
 *
 * Additional information about how this entry should be processed as part of a transaction or
 * batch.  For history, it shows how the entry was processed to create the version contained in the
 * entry.
 *
 * @param id Unique id for inter-element referencing
 * @param method GET | HEAD | POST | PUT | DELETE | PATCH
 * @param url URL for HTTP equivalent of this entry
 * @param ifNoneMatch For managing cache currency
 * @param ifModifiedSince For managing cache currency
 * @param ifMatch For managing update contention
 * @param ifNoneExist For conditional creates
 */
@SerialName("BundleEntryRequest")
@Serializable
public data class BundleEntryRequest(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * GET | HEAD | POST | PUT | DELETE | PATCH
   */
  public val method: String? = null,
  /**
   * URL for HTTP equivalent of this entry
   */
  public val url: String? = null,
  /**
   * For managing cache currency
   */
  public val ifNoneMatch: String? = null,
  /**
   * For managing cache currency
   */
  public val ifModifiedSince: String? = null,
  /**
   * For managing update contention
   */
  public val ifMatch: String? = null,
  /**
   * For conditional creates
   */
  public val ifNoneExist: String? = null,
) : BackboneElement
