//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.administrableproductdefinition

import com.icure.fhir.mapping.domain.fhir.r5.DomainResource
import com.icure.fhir.mapping.domain.fhir.r5.Meta
import com.icure.fhir.mapping.domain.fhir.r5.Resource
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.identifier.Identifier
import com.icure.fhir.mapping.domain.fhir.r5.narrative.Narrative
import com.icure.fhir.mapping.domain.fhir.r5.reference.Reference
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A medicinal product in the final form, suitable for administration - after any mixing of multiple
 * components
 *
 * A medicinal product in the final form which is suitable for administering to a patient (after any
 * mixing of multiple components, dissolution etc. has been performed).
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param status draft | active | retired | unknown
 * @param administrableDoseForm The dose form of the final product after necessary reconstitution or
 * processing
 * @param unitOfPresentation The presentation type in which this item is given to a patient. e.g.
 * for a spray - 'puff'
 * @param device A device that is integral to the medicinal product, in effect being considered as
 * an "ingredient" of the medicinal product
 * @param description A general description of the product, when in its final form, suitable for
 * administration e.g. effervescent blue liquid, to be swallowed
 */
@SerialName("AdministrableProductDefinition")
@Serializable
public data class AdministrableProductDefinition(
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
  public val formOf: List<Reference> = emptyList(),
  /**
   * The dose form of the final product after necessary reconstitution or processing
   */
  public val administrableDoseForm: CodeableConcept? = null,
  /**
   * The presentation type in which this item is given to a patient. e.g. for a spray - 'puff'
   */
  public val unitOfPresentation: CodeableConcept? = null,
  public val producedFrom: List<Reference> = emptyList(),
  public val ingredient: List<CodeableConcept> = emptyList(),
  /**
   * A device that is integral to the medicinal product, in effect being considered as an
   * "ingredient" of the medicinal product
   */
  public val device: Reference? = null,
  /**
   * A general description of the product, when in its final form, suitable for administration e.g.
   * effervescent blue liquid, to be swallowed
   */
  public val description: String? = null,
  public val `property`: List<AdministrableProductDefinitionProperty> = emptyList(),
  public val routeOfAdministration: List<AdministrableProductDefinitionRouteOfAdministration> =
      emptyList(),
) : DomainResource
