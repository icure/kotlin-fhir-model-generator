//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.biologicallyderivedproduct

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.period.Period
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Any manipulation of product post-collection
 *
 * Any manipulation of product post-collection that is intended to alter the product.  For example a
 * buffy-coat enrichment or CD8 reduction of Peripheral Blood Stem Cells to make it more suitable for
 * infusion.
 *
 * @param id Unique id for inter-element referencing
 * @param description Description of manipulation
 * @param timeDateTime Time of manipulation
 * @param timePeriod Time of manipulation
 */
@SerialName("BiologicallyDerivedProductManipulation")
@Serializable
public data class BiologicallyDerivedProductManipulation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Description of manipulation
   */
  public val description: String? = null,
  /**
   * Time of manipulation
   */
  public val timeDateTime: String? = null,
  /**
   * Time of manipulation
   */
  public val timePeriod: Period? = null,
) : BackboneElement
