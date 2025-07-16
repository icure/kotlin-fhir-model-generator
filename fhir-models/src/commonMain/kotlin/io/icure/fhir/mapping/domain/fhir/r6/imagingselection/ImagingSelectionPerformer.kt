//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.imagingselection

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Selector of the instances (human or machine)
 *
 * Selector of the instances – human or machine.
 *
 * @param id Unique id for inter-element referencing
 * @param function Type of performer
 * @param actor Author (human or machine)
 */
@SerialName("ImagingSelectionPerformer")
@Serializable
public data class ImagingSelectionPerformer(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Type of performer
   */
  public val function: CodeableConcept? = null,
  /**
   * Author (human or machine)
   */
  public val actor: Reference? = null,
) : BackboneElement
