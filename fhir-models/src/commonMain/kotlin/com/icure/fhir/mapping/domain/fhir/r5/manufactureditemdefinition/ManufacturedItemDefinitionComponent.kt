//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.manufactureditemdefinition

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
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
