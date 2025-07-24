//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.adverseevent

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Supporting information relevant to the event
 *
 * Supporting information relevant to the event.
 *
 * @param id Unique id for inter-element referencing
 * @param itemReference Subject medical history or document relevant to this adverse event
 * @param itemCodeableConcept Subject medical history or document relevant to this adverse event
 */
@SerialName("AdverseEventSupportingInfo")
@Serializable
public data class AdverseEventSupportingInfo(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Subject medical history or document relevant to this adverse event
   */
  public val itemReference: Reference? = null,
  /**
   * Subject medical history or document relevant to this adverse event
   */
  public val itemCodeableConcept: CodeableConcept? = null,
) : BackboneElement
