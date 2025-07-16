//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.subscription

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Criteria for narrowing the subscription topic stream
 *
 * The filter properties to be applied to narrow the subscription topic stream.  When multiple
 * filters are applied, evaluates to true if all the conditions applicable to that resource are met;
 * otherwise it returns false (i.e., logical AND).
 *
 * @param id Unique id for inter-element referencing
 * @param resource Allowed Resource (reference to definition) for this Subscription filter
 * @param filterParameter Filter label defined in SubscriptionTopic
 * @param comparator eq | ne | gt | lt | ge | le | sa | eb | ap
 * @param modifier missing | exact | contains | not | text | in | not-in | below | above | type |
 * identifier | of-type | code-text | text-advanced | iterate
 * @param value Literal value or resource path
 */
@SerialName("SubscriptionFilterBy")
@Serializable
public data class SubscriptionFilterBy(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Allowed Resource (reference to definition) for this Subscription filter
   */
  public val resource: String? = null,
  /**
   * Filter label defined in SubscriptionTopic
   */
  public val filterParameter: String? = null,
  /**
   * eq | ne | gt | lt | ge | le | sa | eb | ap
   */
  public val comparator: String? = null,
  /**
   * missing | exact | contains | not | text | in | not-in | below | above | type | identifier |
   * of-type | code-text | text-advanced | iterate
   */
  public val modifier: String? = null,
  /**
   * Literal value or resource path
   */
  public val `value`: String? = null,
) : BackboneElement
