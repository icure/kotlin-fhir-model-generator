//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.imagingselection

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
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
