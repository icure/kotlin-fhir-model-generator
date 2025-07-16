//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.testscript

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Placeholder for evaluated elements
 *
 * Variable is set based either on element value in response body or on header field value in the
 * response headers.
 *
 * @param id Unique id for inter-element referencing
 * @param name Descriptive name for this variable
 * @param defaultValue Default, hard-coded, or user-defined value for this variable
 * @param description Natural language description of the variable
 * @param expression The FHIRPath expression against the fixture body
 * @param headerField HTTP header field name for source
 * @param hint Hint help text for default value to enter
 * @param path XPath or JSONPath against the fixture body
 * @param sourceId Fixture Id of source expression or headerField within this variable
 */
@SerialName("TestScriptVariable")
@Serializable
public data class TestScriptVariable(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Descriptive name for this variable
   */
  public val name: String? = null,
  /**
   * Default, hard-coded, or user-defined value for this variable
   */
  public val defaultValue: String? = null,
  /**
   * Natural language description of the variable
   */
  public val description: String? = null,
  /**
   * The FHIRPath expression against the fixture body
   */
  public val expression: String? = null,
  /**
   * HTTP header field name for source
   */
  public val headerField: String? = null,
  /**
   * Hint help text for default value to enter
   */
  public val hint: String? = null,
  /**
   * XPath or JSONPath against the fixture body
   */
  public val path: String? = null,
  /**
   * Fixture Id of source expression or headerField within this variable
   */
  public val sourceId: String? = null,
) : BackboneElement
