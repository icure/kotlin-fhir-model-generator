//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.manufactureditemdefinition

import io.icure.fhir.mapping.domain.fhir.r5.DomainResource
import io.icure.fhir.mapping.domain.fhir.r5.Meta
import io.icure.fhir.mapping.domain.fhir.r5.Resource
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r5.marketingstatus.MarketingStatus
import io.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import io.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule,
 * as contained in a packaged medicinal product
 *
 * The definition and characteristics of a medicinal manufactured item, such as a tablet or capsule,
 * as contained in a packaged medicinal product.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | active | retired | unknown
 * @param name A descriptive name applied to this item
 * @param manufacturedDoseForm Dose form as manufactured (before any necessary transformation)
 * @param unitOfPresentation The “real-world” units in which the quantity of the item is described
 */
@SerialName("ManufacturedItemDefinition")
@Serializable
public data class ManufacturedItemDefinition(
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
   * draft | active | retired | unknown
   */
  public val status: String? = null,
  /**
   * A descriptive name applied to this item
   */
  public val name: String? = null,
  /**
   * Dose form as manufactured (before any necessary transformation)
   */
  public val manufacturedDoseForm: CodeableConcept,
  /**
   * The “real-world” units in which the quantity of the item is described
   */
  public val unitOfPresentation: CodeableConcept? = null,
  public val manufacturer: List<Reference> = emptyList(),
  public val marketingStatus: List<MarketingStatus> = emptyList(),
  public val ingredient: List<CodeableConcept> = emptyList(),
  public val `property`: List<ManufacturedItemDefinitionProperty> = emptyList(),
  public val component: List<ManufacturedItemDefinitionComponent> = emptyList(),
) : DomainResource
