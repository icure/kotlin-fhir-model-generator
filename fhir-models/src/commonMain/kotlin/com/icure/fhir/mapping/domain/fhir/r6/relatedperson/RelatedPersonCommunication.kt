//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.relatedperson

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A language which may be used to communicate with the related person about the patient's health
 *
 * A language which may be used to communicate with the related person about the patient's health.
 *
 * @param id Unique id for inter-element referencing
 * @param language The language which can be used to communicate with the related person about the
 * patient's health
 * @param preferred Language preference indicator
 */
@SerialName("RelatedPersonCommunication")
@Serializable
public data class RelatedPersonCommunication(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The language which can be used to communicate with the related person about the patient's
   * health
   */
  public val language: CodeableConcept,
  /**
   * Language preference indicator
   */
  public val preferred: Boolean? = null,
) : BackboneElement
