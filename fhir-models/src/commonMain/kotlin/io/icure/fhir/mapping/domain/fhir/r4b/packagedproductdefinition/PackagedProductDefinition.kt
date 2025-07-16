//
//  Generated from FHIR Version 4.3.0
//
package io.icure.fhir.mapping.domain.fhir.r4b.packagedproductdefinition

import io.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import io.icure.fhir.mapping.domain.fhir.r4b.Meta
import io.icure.fhir.mapping.domain.fhir.r4b.Quantity
import io.icure.fhir.mapping.domain.fhir.r4b.Resource
import io.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r4b.marketingstatus.MarketingStatus
import io.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

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
 * @param copackagedIndicator If the drug product is supplied with another item such as a diluent or
 * adjuvant
 * @param package_fhir A packaging item, as a container for medically related items, possibly with
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
  public val characteristic: List<CodeableConcept> = emptyList(),
  /**
   * If the drug product is supplied with another item such as a diluent or adjuvant
   */
  public val copackagedIndicator: Boolean? = null,
  public val manufacturer: List<Reference> = emptyList(),
  /**
   * A packaging item, as a container for medically related items, possibly with other packaging
   * items within, or a packaging component, such as bottle cap
   */
  @JsonNames("package")
  public val package_fhir: PackagedProductDefinitionPackage? = null,
) : DomainResource
