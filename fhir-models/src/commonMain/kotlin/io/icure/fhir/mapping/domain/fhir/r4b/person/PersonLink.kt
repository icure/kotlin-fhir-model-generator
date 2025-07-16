//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.person

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
