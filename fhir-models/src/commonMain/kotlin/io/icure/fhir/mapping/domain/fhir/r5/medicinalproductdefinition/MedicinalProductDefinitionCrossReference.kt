//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.medicinalproductdefinition

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Reference to another product, e.g. for linking authorised to investigational product
 *
 * Reference to another product, e.g. for linking authorised to investigational product, or a
 * virtual product.
 *
 * @param id Unique id for inter-element referencing
 * @param product Reference to another product, e.g. for linking authorised to investigational
 * product
 * @param type The type of relationship, for instance branded to generic or virtual to actual
 * product
 */
@SerialName("MedicinalProductDefinitionCrossReference")
@Serializable
public data class MedicinalProductDefinitionCrossReference(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Reference to another product, e.g. for linking authorised to investigational product
   */
  public val product: CodeableReference,
  /**
   * The type of relationship, for instance branded to generic or virtual to actual product
   */
  public val type: CodeableConcept? = null,
) : BackboneElement
