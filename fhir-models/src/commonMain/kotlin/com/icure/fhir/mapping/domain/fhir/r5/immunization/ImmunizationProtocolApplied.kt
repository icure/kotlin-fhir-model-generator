//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.immunization

import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Protocol followed by the provider
 *
 * The protocol (set of recommendations) being followed by the provider who administered the dose.
 *
 * @param id Unique id for inter-element referencing
 * @param series Name of vaccine series
 * @param authority Who is responsible for publishing the recommendations
 * @param doseNumber Dose number within series
 * @param seriesDoses Recommended number of doses for immunity
 */
@SerialName("ImmunizationProtocolApplied")
@Serializable
public data class ImmunizationProtocolApplied(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Name of vaccine series
   */
  public val series: String? = null,
  /**
   * Who is responsible for publishing the recommendations
   */
  public val authority: Reference? = null,
  public val targetDisease: List<CodeableConcept> = emptyList(),
  /**
   * Dose number within series
   */
  public val doseNumber: String? = null,
  /**
   * Recommended number of doses for immunity
   */
  public val seriesDoses: String? = null,
) : BackboneElement
