//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicinalproductdefinition

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Country and jurisdiction where the name applies
 *
 * Country and jurisdiction where the name applies, and associated language.
 *
 * @param id Unique id for inter-element referencing
 * @param country Country code for where this name applies
 * @param jurisdiction Jurisdiction code for where this name applies
 * @param language Language code for this name
 */
@SerialName("MedicinalProductDefinitionNameUsage")
@Serializable
public data class MedicinalProductDefinitionNameUsage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Country code for where this name applies
   */
  public val country: CodeableConcept,
  /**
   * Jurisdiction code for where this name applies
   */
  public val jurisdiction: CodeableConcept? = null,
  /**
   * Language code for this name
   */
  public val language: CodeableConcept,
) : BackboneElement
