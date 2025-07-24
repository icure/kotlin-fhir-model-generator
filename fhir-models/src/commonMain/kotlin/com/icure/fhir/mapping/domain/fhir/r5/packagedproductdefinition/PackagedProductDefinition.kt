//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.packagedproductdefinition

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.marketingstatus.MarketingStatus
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A medically related item or items, in a container or package
 *
 * A medically related item or items, in a container or package.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param name A name for this package. Typically as listed in a drug formulary, catalogue,
 * inventory etc
 * @param type A high level category e.g. medicinal product, raw material, shipping container etc
 * @param status The status within the lifecycle of this item. High level - not intended to
 * duplicate details elsewhere e.g. legal status, or authorization/marketing status
 * @param statusDate The date at which the given status became applicable
 * @param description Textual description. Note that this is not the name of the package or product
 * @param copackagedIndicator Identifies if the drug product is supplied with another item such as a
 * diluent or adjuvant
 * @param packaging A packaging item, as a container for medically related items, possibly with
 * other packaging items within, or a packaging component, such as bottle cap
 */
@SerialName("PackagedProductDefinition")
@Serializable
public data class PackagedProductDefinition(
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
   * A name for this package. Typically as listed in a drug formulary, catalogue, inventory etc
   */
  public val name: String? = null,
  /**
   * A high level category e.g. medicinal product, raw material, shipping container etc
   */
  public val type: CodeableConcept? = null,
  public val packageFor: List<Reference> = emptyList(),
  /**
   * The status within the lifecycle of this item. High level - not intended to duplicate details
   * elsewhere e.g. legal status, or authorization/marketing status
   */
  public val status: CodeableConcept? = null,
  /**
   * The date at which the given status became applicable
   */
  public val statusDate: String? = null,
  public val containedItemQuantity: List<Quantity> = emptyList(),
  /**
   * Textual description. Note that this is not the name of the package or product
   */
  public val description: String? = null,
  public val legalStatusOfSupply: List<PackagedProductDefinitionLegalStatusOfSupply> = emptyList(),
  public val marketingStatus: List<MarketingStatus> = emptyList(),
  /**
   * Identifies if the drug product is supplied with another item such as a diluent or adjuvant
   */
  public val copackagedIndicator: Boolean? = null,
  public val manufacturer: List<Reference> = emptyList(),
  public val attachedDocument: List<Reference> = emptyList(),
  /**
   * A packaging item, as a container for medically related items, possibly with other packaging
   * items within, or a packaging component, such as bottle cap
   */
  public val packaging: PackagedProductDefinitionPackaging? = null,
  public val characteristic: List<PackagedProductDefinitionPackagingProperty> = emptyList(),
) : DomainResource
