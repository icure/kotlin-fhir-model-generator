//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.valueset

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Used when the value set is "expanded"
 *
 * A value set can also be "expanded", where the value set is turned into a simple collection of
 * enumerated codes. This element holds the expansion, if it has been performed.
 *
 * @param id Unique id for inter-element referencing
 * @param identifier Identifies the value set expansion (business identifier)
 * @param timestamp Time ValueSet expansion happened
 * @param total Total number of codes in the expansion
 * @param offset Offset at which this resource starts
 */
@SerialName("ValueSetExpansion")
@Serializable
public data class ValueSetExpansion(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Identifies the value set expansion (business identifier)
   */
  public val identifier: String? = null,
  /**
   * Time ValueSet expansion happened
   */
  public val timestamp: String? = null,
  /**
   * Total number of codes in the expansion
   */
  public val total: Int? = null,
  /**
   * Offset at which this resource starts
   */
  public val offset: Int? = null,
  public val parameter: List<ValueSetExpansionParameter> = emptyList(),
  public val contains: List<ValueSetExpansionContains> = emptyList(),
) : BackboneElement
