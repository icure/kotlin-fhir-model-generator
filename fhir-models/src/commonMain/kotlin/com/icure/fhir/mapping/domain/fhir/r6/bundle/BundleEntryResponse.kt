//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.bundle

import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Results of execution (transaction/batch/history)
 *
 * Indicates the results of processing the corresponding 'request' entry in the batch or transaction
 * being responded to or what the results of an operation where when returning history.
 *
 * @param id Unique id for inter-element referencing
 * @param status Status response code (text optional)
 * @param location The location (if the operation returns a location)
 * @param etag The Etag for the resource (if relevant)
 * @param lastModified Server's date time modified
 * @param outcome OperationOutcome with hints and warnings (for batch/transaction)
 */
@SerialName("BundleEntryResponse")
@Serializable
public data class BundleEntryResponse(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Status response code (text optional)
   */
  public val status: String? = null,
  /**
   * The location (if the operation returns a location)
   */
  public val location: String? = null,
  /**
   * The Etag for the resource (if relevant)
   */
  public val etag: String? = null,
  /**
   * Server's date time modified
   */
  public val lastModified: String? = null,
  /**
   * OperationOutcome with hints and warnings (for batch/transaction)
   */
  public val outcome: Resource? = null,
) : BackboneElement
