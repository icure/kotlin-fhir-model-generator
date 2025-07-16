//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.testscript

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The setup operation to perform
 *
 * The operation to perform.
 *
 * @param id Unique id for inter-element referencing
 * @param type The operation code type that will be executed
 * @param resource Resource type
 * @param label Tracking/logging operation label
 * @param description Tracking/reporting operation description
 * @param accept Mime type to accept in the payload of the response, with charset etc
 * @param contentType Mime type of the request payload contents, with charset etc
 * @param destination Server responding to the request
 * @param encodeRequestUrl Whether or not to send the request url in encoded format
 * @param method delete | get | options | patch | post | put | head
 * @param origin Server initiating the request
 * @param params Explicitly defined path parameters
 * @param requestId Fixture Id of mapped request
 * @param responseId Fixture Id of mapped response
 * @param sourceId Fixture Id of body for PUT and POST requests
 * @param targetId Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
 * @param url Request URL
 */
@SerialName("TestScriptSetupActionOperation")
@Serializable
public data class TestScriptSetupActionOperation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The operation code type that will be executed
   */
  public val type: Coding? = null,
  /**
   * Resource type
   */
  public val resource: String? = null,
  /**
   * Tracking/logging operation label
   */
  public val label: String? = null,
  /**
   * Tracking/reporting operation description
   */
  public val description: String? = null,
  /**
   * Mime type to accept in the payload of the response, with charset etc
   */
  public val accept: String? = null,
  /**
   * Mime type of the request payload contents, with charset etc
   */
  public val contentType: String? = null,
  /**
   * Server responding to the request
   */
  public val destination: Int? = null,
  /**
   * Whether or not to send the request url in encoded format
   */
  public val encodeRequestUrl: Boolean? = null,
  /**
   * delete | get | options | patch | post | put | head
   */
  public val method: String? = null,
  /**
   * Server initiating the request
   */
  public val origin: Int? = null,
  /**
   * Explicitly defined path parameters
   */
  public val params: String? = null,
  public val requestHeader: List<TestScriptSetupActionOperationRequestHeader> = emptyList(),
  /**
   * Fixture Id of mapped request
   */
  public val requestId: String? = null,
  /**
   * Fixture Id of mapped response
   */
  public val responseId: String? = null,
  /**
   * Fixture Id of body for PUT and POST requests
   */
  public val sourceId: String? = null,
  /**
   * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
   */
  public val targetId: String? = null,
  /**
   * Request URL
   */
  public val url: String? = null,
) : BackboneElement
