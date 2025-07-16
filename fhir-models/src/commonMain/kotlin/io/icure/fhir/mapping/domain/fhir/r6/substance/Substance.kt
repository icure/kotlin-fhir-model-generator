//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.substance

import io.icure.fhir.mapping.domain.fhir.r6.DomainResource
import io.icure.fhir.mapping.domain.fhir.r6.Meta
import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.Resource
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.identifier.Identifier
import io.icure.fhir.mapping.domain.fhir.r6.narrative.Narrative
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * A homogeneous material with a definite composition
 *
 * A homogeneous material with a definite composition.
 *
 * @param id Logical id of this artifact
 * @param meta Metadata about the resource
 * @param implicitRules A set of rules under which this content was created
 * @param language Language of the resource content
 * @param text Text summary of the resource, for human interpretation
 * @param instance Is this an instance of a substance or a kind of one
 * @param status active | inactive | entered-in-error
 * @param code What substance this is
 * @param description Textual description of the substance, comments
 * @param expiry When no longer valid to use
 * @param quantity Amount of substance in the package
 */
@SerialName("Substance")
@Serializable
public data class Substance(
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
   * Is this an instance of a substance or a kind of one
   */
  public val instance: Boolean? = null,
  /**
   * active | inactive | entered-in-error
   */
  public val status: String? = null,
  public val category: List<CodeableConcept> = emptyList(),
  /**
   * What substance this is
   */
  public val code: CodeableReference,
  /**
   * Textual description of the substance, comments
   */
  public val description: String? = null,
  /**
   * When no longer valid to use
   */
  public val expiry: String? = null,
  /**
   * Amount of substance in the package
   */
  public val quantity: Quantity? = null,
  public val ingredient: List<SubstanceIngredient> = emptyList(),
) : DomainResource
