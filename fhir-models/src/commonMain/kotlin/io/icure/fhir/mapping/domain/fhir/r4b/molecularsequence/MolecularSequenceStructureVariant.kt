//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.molecularsequence

import io.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Structural variant
 *
 * Information about chromosome structure variation.
 *
 * @param id Unique id for inter-element referencing
 * @param variantType Structural variant change type
 * @param exact Does the structural variant have base pair resolution breakpoints?
 * @param length Structural variant length
 * @param outer Structural variant outer
 * @param inner Structural variant inner
 */
@SerialName("MolecularSequenceStructureVariant")
@Serializable
public data class MolecularSequenceStructureVariant(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Structural variant change type
   */
  public val variantType: CodeableConcept? = null,
  /**
   * Does the structural variant have base pair resolution breakpoints?
   */
  public val exact: Boolean? = null,
  /**
   * Structural variant length
   */
  public val length: Int? = null,
  /**
   * Structural variant outer
   */
  public val outer: MolecularSequenceStructureVariantOuter? = null,
  /**
   * Structural variant inner
   */
  public val `inner`: MolecularSequenceStructureVariantInner? = null,
) : BackboneElement
