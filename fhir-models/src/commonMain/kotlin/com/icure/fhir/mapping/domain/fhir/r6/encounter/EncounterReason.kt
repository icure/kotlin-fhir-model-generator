//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.encounter

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
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
