//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.testscript

import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The assertion to perform
 *
 * Evaluates the results of previous operations to determine if the server under test behaves
 * appropriately.
 *
 * @param id Unique id for inter-element referencing
 * @param label Tracking/logging assertion label
 * @param description Tracking/reporting assertion description
 * @param direction response | request
 * @param compareToSourceId Id of the source fixture to be evaluated
 * @param compareToSourceExpression The FHIRPath expression to evaluate against the source fixture
 * @param compareToSourcePath XPath or JSONPath expression to evaluate against the source fixture
 * @param contentType Mime type to compare against the 'Content-Type' header
 * @param expression The FHIRPath expression to be evaluated
 * @param headerField HTTP header field name
 * @param minimumId Fixture Id of minimum content resource
 * @param navigationLinks Perform validation on navigation links?
 * @param operator equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty |
 * contains | notContains | eval
 * @param path XPath or JSONPath expression
 * @param requestMethod delete | get | options | patch | post | put | head
 * @param requestURL Request URL comparison value
 * @param resource Resource type
 * @param response okay | created | noContent | notModified | bad | forbidden | notFound |
 * methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
 * @param responseCode HTTP response code to test
 * @param sourceId Fixture Id of source expression or headerField
 * @param validateProfileId Profile Id of validation profile reference
 * @param value The value to compare to
 * @param warningOnly Will this assert produce a warning only on error?
 */
@SerialName("TestScriptSetupActionAssert")
@Serializable
public data class TestScriptSetupActionAssert(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Tracking/logging assertion label
   */
  public val label: String? = null,
  /**
   * Tracking/reporting assertion description
   */
  public val description: String? = null,
  /**
   * response | request
   */
  public val direction: String? = null,
  /**
   * Id of the source fixture to be evaluated
   */
  public val compareToSourceId: String? = null,
  /**
   * The FHIRPath expression to evaluate against the source fixture
   */
  public val compareToSourceExpression: String? = null,
  /**
   * XPath or JSONPath expression to evaluate against the source fixture
   */
  public val compareToSourcePath: String? = null,
  /**
   * Mime type to compare against the 'Content-Type' header
   */
  public val contentType: String? = null,
  /**
   * The FHIRPath expression to be evaluated
   */
  public val expression: String? = null,
  /**
   * HTTP header field name
   */
  public val headerField: String? = null,
  /**
   * Fixture Id of minimum content resource
   */
  public val minimumId: String? = null,
  /**
   * Perform validation on navigation links?
   */
  public val navigationLinks: Boolean? = null,
  /**
   * equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty | contains |
   * notContains | eval
   */
  public val `operator`: String? = null,
  /**
   * XPath or JSONPath expression
   */
  public val path: String? = null,
  /**
   * delete | get | options | patch | post | put | head
   */
  public val requestMethod: String? = null,
  /**
   * Request URL comparison value
   */
  public val requestURL: String? = null,
  /**
   * Resource type
   */
  public val resource: String? = null,
  /**
   * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed |
   * conflict | gone | preconditionFailed | unprocessable
   */
  public val response: String? = null,
  /**
   * HTTP response code to test
   */
  public val responseCode: String? = null,
  /**
   * Fixture Id of source expression or headerField
   */
  public val sourceId: String? = null,
  /**
   * Profile Id of validation profile reference
   */
  public val validateProfileId: String? = null,
  /**
   * The value to compare to
   */
  public val `value`: String? = null,
  /**
   * Will this assert produce a warning only on error?
   */
  public val warningOnly: Boolean? = null,
) : BackboneElement
