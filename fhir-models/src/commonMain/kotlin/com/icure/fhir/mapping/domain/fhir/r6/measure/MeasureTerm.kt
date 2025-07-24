//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.measure

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Defined terms used in the measure documentation
 *
 * Provides a description of an individual term used within the measure.
 *
 * @param id Unique id for inter-element referencing
 * @param code What term?
 * @param definition Meaning of the term
 */
@SerialName("MeasureTerm")
@Serializable
public data class MeasureTerm(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * What term?
   */
  public val code: CodeableConcept? = null,
  /**
   * Meaning of the term
   */
  public val definition: String? = null,
) : BackboneElement
