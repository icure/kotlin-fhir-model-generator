//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.encounter

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The list of medical reasons that are expected to be addressed during the episode of care
 *
 * The list of medical reasons that are expected to be addressed during the episode of care.
 *
 * @param id Unique id for inter-element referencing
 */
@SerialName("EncounterReason")
@Serializable
public data class EncounterReason(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val use: List<CodeableConcept> = emptyList(),
  public val `value`: List<CodeableReference> = emptyList(),
) : BackboneElement
