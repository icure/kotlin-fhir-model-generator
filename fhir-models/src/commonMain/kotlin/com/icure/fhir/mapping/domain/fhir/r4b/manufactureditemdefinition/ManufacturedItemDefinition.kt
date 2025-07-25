//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.manufactureditemdefinition

import com.icure.fhir.mapping.domain.fhir.r4b.DomainResource
import com.icure.fhir.mapping.domain.fhir.r4b.Meta
import com.icure.fhir.mapping.domain.fhir.r4b.Resource
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r4b.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r4b.reference.Reference
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
 * @param manufacturedDoseForm Dose form as manufactured (before any necessary transformation)
 * @param unitOfPresentation The “real world” units in which the quantity of the item is described
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
   * Dose form as manufactured (before any necessary transformation)
   */
  public val manufacturedDoseForm: CodeableConcept,
  /**
   * The “real world” units in which the quantity of the item is described
   */
  public val unitOfPresentation: CodeableConcept? = null,
  public val manufacturer: List<Reference> = emptyList(),
  public val ingredient: List<CodeableConcept> = emptyList(),
  public val `property`: List<ManufacturedItemDefinitionProperty> = emptyList(),
) : DomainResource
