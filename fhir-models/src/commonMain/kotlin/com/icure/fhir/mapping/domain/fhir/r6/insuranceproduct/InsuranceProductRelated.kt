//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.insuranceproduct

import com.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.period.Period
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Associated insurance product
 *
 * Another product that is related to this product. Often used to create relationships to parents or
 * families of products.
 *
 * @param id Unique id for inter-element referencing
 * @param product Related Product reference
 * @param relationship Relationship of this product to the related product
 * @param period Period that this Relationship is valid
 */
@SerialName("InsuranceProductRelated")
@Serializable
public data class InsuranceProductRelated(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Related Product reference
   */
  public val product: Reference? = null,
  /**
   * Relationship of this product to the related product
   */
  public val relationship: CodeableConcept? = null,
  /**
   * Period that this Relationship is valid
   */
  public val period: Period? = null,
) : BackboneElement
