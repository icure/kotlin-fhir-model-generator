//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.practitioner

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A language which may be used to communicate with the practitioner
 *
 * A language which may be used to communicate with the practitioner, often for
 * correspondence/administrative purposes.The `PractitionerRole.communication` property should be
 * used for publishing the languages that a practitioner is able to communicate with patients (on a per
 * Organization/Role basis).
 *
 * @param id Unique id for inter-element referencing
 * @param language The language code used to communicate with the practitioner
 * @param preferred Language preference indicator
 */
@SerialName("PractitionerCommunication")
@Serializable
public data class PractitionerCommunication(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The language code used to communicate with the practitioner
   */
  public val language: CodeableConcept,
  /**
   * Language preference indicator
   */
  public val preferred: Boolean? = null,
) : BackboneElement
