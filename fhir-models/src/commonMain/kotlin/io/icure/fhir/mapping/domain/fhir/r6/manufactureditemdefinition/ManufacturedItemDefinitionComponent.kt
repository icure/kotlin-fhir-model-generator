//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.manufactureditemdefinition

import io.icure.fhir.mapping.domain.fhir.r6.Quantity
import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Physical parts of the manufactured item, that it is intrisically made from. This is distinct from
 * the ingredients that are part of its chemical makeup
 *
 * Physical parts of the manufactured item, that it is intrisically made from. This is distinct from
 * the ingredients that are part of its chemical makeup.
 *
 * @param id Unique id for inter-element referencing
 * @param type Defining type of the component e.g. shell, layer, ink
 */
@SerialName("ManufacturedItemDefinitionComponent")
@Serializable
public data class ManufacturedItemDefinitionComponent(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Defining type of the component e.g. shell, layer, ink
   */
  public val type: CodeableConcept,
  public val function: List<CodeableConcept> = emptyList(),
  public val amount: List<Quantity> = emptyList(),
  public val constituent: List<ManufacturedItemDefinitionComponentConstituent> = emptyList(),
  public val `property`: List<ManufacturedItemDefinitionProperty> = emptyList(),
  public val component: List<ManufacturedItemDefinitionComponent> = emptyList(),
) : BackboneElement
