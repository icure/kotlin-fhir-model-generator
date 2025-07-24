//
//  Generated from FHIR Version 6.0.0-ballot1
//
package com.icure.fhir.mapping.domain.fhir.r6.biologicallyderivedproduct

import com.icure.fhir.mapping.domain.fhir.r6.DomainResource
import com.icure.fhir.mapping.domain.fhir.r6.Meta
import com.icure.fhir.mapping.domain.fhir.r6.Resource
import com.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r6.coding.Coding
import com.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r6.range.Range
import com.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This resource reflects an instance of a biologically derived product
 *
 * This resource reflects an instance of a biologically derived product. A material substance
 * originating from a biological entity intended to be transplanted or infused
 * into another (possibly the same) biological entity.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param productCategory organ | tissue | fluid | cells | biologicalAgent
 * @param productCode A code that identifies the kind of this biologically derived product
 * @param biologicalSourceEvent An identifier that supports traceability to the event during which
 * material in this product from one or more biological entities was obtained or pooled
 * @param division A unique identifier for an aliquot of a product
 * @param productStatus available | unavailable
 * @param expirationDate Date, and where relevant time, of expiration
 * @param collection How this product was collected
 * @param storageTempRequirements Product storage temperature requirements
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
  /**
   * organ | tissue | fluid | cells | biologicalAgent
   */
  public val productCategory: Coding? = null,
  /**
   * A code that identifies the kind of this biologically derived product
   */
  public val productCode: CodeableConcept? = null,
  public val parent: List<Reference> = emptyList(),
  public val request: List<Reference> = emptyList(),
  public val identifier: List<Identifier> = emptyList(),
  /**
   * An identifier that supports traceability to the event during which material in this product
   * from one or more biological entities was obtained or pooled
   */
  public val biologicalSourceEvent: Identifier? = null,
  public val processingFacility: List<Reference> = emptyList(),
  /**
   * A unique identifier for an aliquot of a product
   */
  public val division: String? = null,
  /**
   * available | unavailable
   */
  public val productStatus: Coding? = null,
  /**
   * Date, and where relevant time, of expiration
   */
  public val expirationDate: String? = null,
  /**
   * How this product was collected
   */
  public val collection: BiologicallyDerivedProductCollection? = null,
  /**
   * Product storage temperature requirements
   */
  public val storageTempRequirements: Range? = null,
  public val `property`: List<BiologicallyDerivedProductProperty> = emptyList(),
) : DomainResource
