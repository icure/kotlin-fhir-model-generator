//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.valueset

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Description of the semantic space the Value Set Expansion is intended to cover and should further
 * clarify the text in ValueSet.description
 *
 * Description of the semantic space the Value Set Expansion is intended to cover and should further
 * clarify the text in ValueSet.description.
 *
 * @param id Unique id for inter-element referencing
 * @param inclusionCriteria Criteria describing which concepts or codes should be included and why
 * @param exclusionCriteria Criteria describing which concepts or codes should be excluded and why
 */
@SerialName("ValueSetScope")
@Serializable
public data class ValueSetScope(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Criteria describing which concepts or codes should be included and why
   */
  public val inclusionCriteria: String? = null,
  /**
   * Criteria describing which concepts or codes should be excluded and why
   */
  public val exclusionCriteria: String? = null,
) : BackboneElement
