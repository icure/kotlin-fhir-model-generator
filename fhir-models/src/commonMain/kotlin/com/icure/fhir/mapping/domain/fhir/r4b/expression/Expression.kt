//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.expression

import com.icure.fhir.mapping.domain.fhir.r4b.Element
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * An expression that can be used to generate a value
 *
 * A expression that is evaluated in a specified context and returns a value. The context of use of
 * the expression must specify the context in which the expression is evaluated, and how the result of
 * the expression is used.
 *
 * @param id Unique id for inter-element referencing
 * @param description Natural language description of the condition
 * @param name Short name assigned to expression for reuse
 * @param language text/cql | text/fhirpath | application/x-fhir-query | text/cql-identifier |
 * text/cql-expression | etc.
 * @param expression Expression in specified language
 * @param reference Where the expression is found
 */
@SerialName("Expression")
@Serializable
public data class Expression(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Natural language description of the condition
   */
  public val description: String? = null,
  /**
   * Short name assigned to expression for reuse
   */
  public val name: String? = null,
  /**
   * text/cql | text/fhirpath | application/x-fhir-query | text/cql-identifier | text/cql-expression
   * | etc.
   */
  public val language: String? = null,
  /**
   * Expression in specified language
   */
  public val expression: String? = null,
  /**
   * Where the expression is found
   */
  public val reference: String? = null,
) : Element
