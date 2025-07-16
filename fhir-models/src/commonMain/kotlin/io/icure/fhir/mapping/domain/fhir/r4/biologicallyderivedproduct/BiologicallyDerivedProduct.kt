//
//  Generated from FHIR Version 4.0.1-9346c8cc45
//
package io.icure.fhir.mapping.domain.fhir.r4.biologicallyderivedproduct

import io.icure.fhir.mapping.domain.fhir.r4.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4.Meta
import io.icure.fhir.mapping.domain.fhir.r4.Resource
import io.icure.fhir.mapping.domain.fhir.r4.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4.reference.Reference
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A material substance originating from a biological entity
 *
 * A material substance originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param productCategory organ | tissue | fluid | cells | biologicalAgent
 * @param productCode What this biologically derived product is
 * @param status available | unavailable
 * @param quantity The amount of this biologically derived product
 * @param collection How this product was collected
 * @param manipulation Any manipulation of product post-collection
 */
@SerialName("BiologicallyDerivedProduct")
@Serializable
public data class BiologicallyDerivedProduct(
  /**
   * Logical id of this artifact
   */
  override val id: String? = null,
  /**
   * Metadata about the resource
   */
  override val meta: Meta? = null,
  /**
   * A set of rules under which this content was created
   */
  override val implicitRules: String? = null,
  /**
   * Language of the resource content
   */
  override val language: String? = null,
  /**
   * Text summary of the resource, for human interpretation
   */
  override val text: Narrative? = null,
  override val contained: List<Resource> = emptyList(),
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * organ | tissue | fluid | cells | biologicalAgent
   */
  public val productCategory: String? = null,
  /**
   * What this biologically derived product is
   */
  public val productCode: CodeableConcept? = null,
  /**
   * available | unavailable
   */
  public val status: String? = null,
  public val request: List<Reference> = emptyList(),
  /**
   * The amount of this biologically derived product
   */
  public val quantity: Int? = null,
  public val parent: List<Reference> = emptyList(),
  /**
   * How this product was collected
   */
  public val collection: BiologicallyDerivedProductCollection? = null,
  public val processing: List<BiologicallyDerivedProductProcessing> = emptyList(),
  /**
   * Any manipulation of product post-collection
   */
  public val manipulation: BiologicallyDerivedProductManipulation? = null,
  public val storage: List<BiologicallyDerivedProductStorage> = emptyList(),
) : DomainResource
