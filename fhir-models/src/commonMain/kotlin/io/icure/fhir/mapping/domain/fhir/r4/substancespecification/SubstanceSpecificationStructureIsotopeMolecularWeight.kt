//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.substancespecification

import io.icure.fhir.mapping.domain.fhir.r4.Quantity
import io.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The molecular weight or weight range (for proteins, polymers or nucleic acids)
 *
 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
 *
 * @param id Unique id for inter-element referencing
 * @param method The method by which the molecular weight was determined
 * @param type Type of molecular weight such as exact, average (also known as. number average),
 * weight average
 * @param amount Used to capture quantitative values for a variety of elements. If only limits are
 * given, the arithmetic mean would be the average. If only a single definite value for a given element
 * is given, it would be captured in this field
 */
@SerialName("SubstanceSpecificationStructureIsotopeMolecularWeight")
@Serializable
public data class SubstanceSpecificationStructureIsotopeMolecularWeight(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The method by which the molecular weight was determined
   */
  public val method: CodeableConcept? = null,
  /**
   * Type of molecular weight such as exact, average (also known as. number average), weight average
   */
  public val type: CodeableConcept? = null,
  /**
   * Used to capture quantitative values for a variety of elements. If only limits are given, the
   * arithmetic mean would be the average. If only a single definite value for a given element is
   * given, it would be captured in this field
   */
  public val amount: Quantity? = null,
) : BackboneElement
