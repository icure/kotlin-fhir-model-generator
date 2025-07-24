//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.elementdefinition

import com.icure.fhir.mapping.domain.fhir.r6.Element
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Condition that must evaluate to true
 *
 * Formal constraints such as co-occurrence and other constraints that can be computationally
 * evaluated within the context of the instance.
 *
 * @param id Unique id for inter-element referencing
 * @param key Target of 'condition' reference above
 * @param requirements Why this constraint is necessary or appropriate
 * @param severity error | warning
 * @param suppress Suppress warning or hint in profile
 * @param human Human description of constraint
 * @param expression FHIRPath expression of constraint
 * @param source Reference to original source of constraint
 */
@SerialName("ElementDefinitionConstraint")
@Serializable
public data class ElementDefinitionConstraint(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * Target of 'condition' reference above
   */
  public val key: String? = null,
  /**
   * Why this constraint is necessary or appropriate
   */
  public val requirements: String? = null,
  /**
   * error | warning
   */
  public val severity: String? = null,
  /**
   * Suppress warning or hint in profile
   */
  public val suppress: Boolean? = null,
  /**
   * Human description of constraint
   */
  public val human: String? = null,
  /**
   * FHIRPath expression of constraint
   */
  public val expression: String? = null,
  /**
   * Reference to original source of constraint
   */
  public val source: String? = null,
) : Element
