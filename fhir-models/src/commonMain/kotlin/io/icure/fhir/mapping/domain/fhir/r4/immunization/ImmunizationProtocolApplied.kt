//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.immunization

import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
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
 * @param doseNumberPositiveInt Dose number within series
 * @param doseNumberString Dose number within series
 * @param seriesDosesPositiveInt Recommended number of doses for immunity
 * @param seriesDosesString Recommended number of doses for immunity
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
  public val doseNumberPositiveInt: Int? = null,
  /**
   * Dose number within series
   */
  public val doseNumberString: String? = null,
  /**
   * Recommended number of doses for immunity
   */
  public val seriesDosesPositiveInt: Int? = null,
  /**
   * Recommended number of doses for immunity
   */
  public val seriesDosesString: String? = null,
) : BackboneElement
