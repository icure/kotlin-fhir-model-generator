//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.person

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A language which may be used to communicate with the person about his or her health
 *
 * A language which may be used to communicate with the person about his or her health.
 *
 * @param id Unique id for inter-element referencing
 * @param language The language which can be used to communicate with the person about his or her
 * health
 * @param preferred Language preference indicator
 */
@SerialName("PersonCommunication")
@Serializable
public data class PersonCommunication(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The language which can be used to communicate with the person about his or her health
   */
  public val language: CodeableConcept,
  /**
   * Language preference indicator
   */
  public val preferred: Boolean? = null,
) : BackboneElement
