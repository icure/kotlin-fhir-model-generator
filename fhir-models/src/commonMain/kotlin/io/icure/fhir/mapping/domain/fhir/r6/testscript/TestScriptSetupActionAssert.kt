//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.testscript

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
 * @param defaultManualCompletion fail | pass | skip | stop
 * @param expression The FHIRPath expression to be evaluated
 * @param headerField HTTP header field name
 * @param minimumId Fixture Id of minimum content resource
 * @param navigationLinks Perform validation on navigation links?
 * @param operator equals | notEquals | in | notIn | greaterThan | lessThan | empty | notEmpty |
 * contains | notContains | eval | manualEval
 * @param path XPath or JSONPath expression
 * @param requestMethod delete | get | options | patch | post | put | head
 * @param requestURL Request URL comparison value
 * @param resource Resource type
 * @param response continue | switchingProtocols | okay | created | accepted |
 * nonAuthoritativeInformation | noContent | resetContent | partialContent | multipleChoices |
 * movedPermanently | found | seeOther | notModified | useProxy | temporaryRedirect | permanentRedirect
 * | badRequest | unauthorized | paymentRequired | forbidden | notFound | methodNotAllowed |
 * notAcceptable | proxyAuthenticationRequired | requestTimeout | conflict | gone | lengthRequired |
 * preconditionFailed | contentTooLarge | uriTooLong | unsupportedMediaType | rangeNotSatisfiable |
 * expectationFailed | misdirectedRequest | unprocessableContent | upgradeRequired |
 * internalServerError | notImplemented | badGateway | serviceUnavailable | gatewayTimeout |
 * httpVersionNotSupported
 * @param responseCode HTTP response code to test
 * @param sourceId Fixture Id of source expression or headerField
 * @param stopTestOnFail If this assert fails, will the current test execution stop?
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
   * fail | pass | skip | stop
   */
  public val defaultManualCompletion: String? = null,
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
   * notContains | eval | manualEval
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
   * continue | switchingProtocols | okay | created | accepted | nonAuthoritativeInformation |
   * noContent | resetContent | partialContent | multipleChoices | movedPermanently | found | seeOther
   * | notModified | useProxy | temporaryRedirect | permanentRedirect | badRequest | unauthorized |
   * paymentRequired | forbidden | notFound | methodNotAllowed | notAcceptable |
   * proxyAuthenticationRequired | requestTimeout | conflict | gone | lengthRequired |
   * preconditionFailed | contentTooLarge | uriTooLong | unsupportedMediaType | rangeNotSatisfiable |
   * expectationFailed | misdirectedRequest | unprocessableContent | upgradeRequired |
   * internalServerError | notImplemented | badGateway | serviceUnavailable | gatewayTimeout |
   * httpVersionNotSupported
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
   * If this assert fails, will the current test execution stop?
   */
  public val stopTestOnFail: Boolean? = null,
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
  public val requirement: List<TestScriptSetupActionAssertRequirement> = emptyList(),
) : BackboneElement
