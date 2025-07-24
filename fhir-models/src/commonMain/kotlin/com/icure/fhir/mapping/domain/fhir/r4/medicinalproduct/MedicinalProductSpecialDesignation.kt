//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package com.icure.fhir.mapping.domain.fhir.r4.medicinalproduct

import com.icure.fhir.mapping.domain.fhir.r4.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease
 *
 * Indicates if the medicinal product has an orphan designation for the treatment of a rare disease.
 *
 * @param id Unique id for inter-element referencing
 * @param type The type of special designation, e.g. orphan drug, minor use
 * @param intendedUse The intended use of the product, e.g. prevention, treatment
 * @param indicationCodeableConcept Condition for which the medicinal use applies
 * @param indicationReference Condition for which the medicinal use applies
 * @param status For example granted, pending, expired or withdrawn
 * @param date Date when the designation was granted
 * @param species Animal species for which this applies
 */
@SerialName("MedicinalProductSpecialDesignation")
@Serializable
public data class MedicinalProductSpecialDesignation(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * The type of special designation, e.g. orphan drug, minor use
   */
  public val type: CodeableConcept? = null,
  /**
   * The intended use of the product, e.g. prevention, treatment
   */
  public val intendedUse: CodeableConcept? = null,
  /**
   * Condition for which the medicinal use applies
   */
  public val indicationCodeableConcept: CodeableConcept? = null,
  /**
   * Condition for which the medicinal use applies
   */
  public val indicationReference: Reference? = null,
  /**
   * For example granted, pending, expired or withdrawn
   */
  public val status: CodeableConcept? = null,
  /**
   * Date when the designation was granted
   */
  public val date: String? = null,
  /**
   * Animal species for which this applies
   */
  public val species: CodeableConcept? = null,
) : BackboneElement
