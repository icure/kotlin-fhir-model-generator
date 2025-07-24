//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.elementdefinition

import com.icure.fhir.mapping.domain.fhir.r6.Element
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.usagecontext.UsageContext
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Additional Bindings - more rules about the binding
 *
 * Additional bindings that help applications implementing this element. Additional bindings do not
 * replace the main binding but provide more information and/or context.
 *
 * @param id Unique id for inter-element referencing
 * @param purpose maximum | minimum | required | extensible | candidate | current | preferred | ui |
 * starter | component
 * @param valueSet The value set for the additional binding
 * @param documentation Documentation of the purpose of use of the binding
 * @param shortDoco Concise documentation - for summary tables
 * @param any Whether binding can applies to all repeats, or just one
 */
@SerialName("ElementDefinitionBindingAdditional")
@Serializable
public data class ElementDefinitionBindingAdditional(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  /**
   * maximum | minimum | required | extensible | candidate | current | preferred | ui | starter |
   * component
   */
  public val purpose: String? = null,
  /**
   * The value set for the additional binding
   */
  public val valueSet: String? = null,
  /**
   * Documentation of the purpose of use of the binding
   */
  public val documentation: String? = null,
  /**
   * Concise documentation - for summary tables
   */
  public val shortDoco: String? = null,
  public val usage: List<UsageContext> = emptyList(),
  /**
   * Whether binding can applies to all repeats, or just one
   */
  public val any: Boolean? = null,
) : Element
