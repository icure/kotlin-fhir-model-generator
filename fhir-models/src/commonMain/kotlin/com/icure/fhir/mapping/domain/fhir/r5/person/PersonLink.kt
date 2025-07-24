//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.person

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Link to a resource that concerns the same actual person
 *
 * Link to a resource that concerns the same actual person.
 *
 * @param id Unique id for inter-element referencing
 * @param target The resource to which this actual person is associated
 * @param assurance level1 | level2 | level3 | level4
 */
@SerialName("PersonLink")
@Serializable
public data class PersonLink(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The resource to which this actual person is associated
   */
  public val target: Reference,
  /**
   * level1 | level2 | level3 | level4
   */
  public val assurance: String? = null,
) : BackboneElement
